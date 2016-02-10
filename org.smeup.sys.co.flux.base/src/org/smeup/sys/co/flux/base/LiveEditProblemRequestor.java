/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.co.flux.base;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.flux.client.MessageConnector;
import org.eclipse.jdt.core.IProblemRequestor;
import org.eclipse.jdt.core.compiler.IProblem;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Accepts computed compilation problems from JDT and forwards them to the message bus.
 * @author Martin Lippert
 */
public class LiveEditProblemRequestor implements IProblemRequestor {

	private MessageConnector messagingConnector;
	private String resourcePath;
	private final List<IProblem> problems;
	private String username;
	private String projectName;

	public LiveEditProblemRequestor(MessageConnector messagingConnector, String username, String projectName, String resourcePath) {
		this.messagingConnector = messagingConnector;
		this.username = username;
		this.projectName = projectName;
		this.resourcePath = resourcePath;

		this.problems = new ArrayList<IProblem>();
	}

	@Override
	public void acceptProblem(IProblem problem) {
		this.problems.add(problem);
	}

	@Override
	public void beginReporting() {
		this.problems.clear();
	}

	@Override
	public void endReporting() {
		sendMarkers(this.problems.toArray(new IProblem[this.problems.size()]));
	}

	@Override
	public boolean isActive() {
		return true;
	}

	private void sendMarkers(IProblem[] problems) {
		String problemsJSON = toJSON(problems);
		try {
			JSONArray array = new JSONArray(problemsJSON);
			JSONObject message = new JSONObject();
			message.put("username", this.username);
			message.put("project", this.projectName);
			message.put("resource", this.resourcePath);
			message.put("problems", array);

			messagingConnector.send("liveMetadataChanged", message);
			System.out.println("livemetadata transmitted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String toJSON(IProblem[] problems) {
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		result.append("[");
		for (IProblem problem : problems) {
			if (flag) {
				result.append(",");
			}

			result.append("{");
			result.append("\"id\":" + problem.getID());
			result.append(",\"author\":" + BaseFluxComponent.JDT_SERVICE_ID);
			result.append(",\"description\":" + JSONObject.quote(problem.getMessage()));
			result.append(",\"line\":" + problem.getSourceLineNumber());
			result.append(",\"severity\":\"" + (problem.isError() ? "error" : "warning") + "\"");
			result.append(",\"start\":" + problem.getSourceStart());

			int end = problem.getSourceEnd() + 1;

			result.append(",\"end\":" + end);
			result.append("}");

			flag = true;
		}
		result.append("]");
		return result.toString();
	}

}