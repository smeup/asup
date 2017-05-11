package org.smeup.sys.dk.source.nio;

import java.net.URI;
import java.net.URISyntaxException;

class URIUtil {
	
	private static final String UNC_PREFIX = "//"; //$NON-NLS-1$
	private static final String SCHEME_FILE = "file"; //$NON-NLS-1$
	
	private static final boolean decodeResolved;
	static {
		decodeResolved = URI.create("foo:/a%20b/").resolve("c").getSchemeSpecificPart().indexOf('%') > 0; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public static URI append(URI base, String extension) {
		try {
			String path = base.getPath();
			if (path == null)
				return appendOpaque(base, extension);
			//if the base is already a directory then resolve will just do the right thing
			URI result;
			if (path.endsWith("/")) {//$NON-NLS-1$
				result = base.resolve(new URI(null, null, extension, null));
				if (decodeResolved) {
					//see bug 267219 - Java 1.4 implementation of URI#resolve incorrectly encoded the ssp
					result = new URI(toUnencodedString(result));
				}
			} else {
				path = path + '/' + extension;
				result = new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), path, base.getQuery(), base.getFragment());
			}
			result = result.normalize();
			//Fix UNC paths that are incorrectly normalized by URI#resolve (see Java bug 4723726)
			String resultPath = result.getPath();
			if (isFileURI(base) && path != null && path.startsWith(UNC_PREFIX) && (resultPath == null || !resultPath.startsWith(UNC_PREFIX)))
				result = new URI(result.getScheme(), ensureUNCPath(result.getSchemeSpecificPart()), result.getFragment());
			return result;
		} catch (URISyntaxException e) {
			//shouldn't happen because we started from a valid URI
			throw new RuntimeException(e);
		}
	}
	
	private static URI appendOpaque(URI base, String extension) throws URISyntaxException {
		String ssp = base.getSchemeSpecificPart();
		if (ssp.endsWith("/")) //$NON-NLS-1$
			ssp += extension;
		else
			ssp = ssp + "/" + extension; //$NON-NLS-1$
		return new URI(base.getScheme(), ssp, base.getFragment());
	}
	
	public static String toUnencodedString(URI uri) {
		StringBuffer result = new StringBuffer();
		String scheme = uri.getScheme();
		if (scheme != null)
			result.append(scheme).append(':');
		//there is always a ssp
		result.append(uri.getSchemeSpecificPart());
		String fragment = uri.getFragment();
		if (fragment != null)
			result.append('#').append(fragment);
		return result.toString();
	}
	
	public static boolean isFileURI(URI uri) {
		return SCHEME_FILE.equalsIgnoreCase(uri.getScheme());
	}
	
	private static String ensureUNCPath(String path) {
		int len = path.length();
		StringBuffer result = new StringBuffer(len);
		for (int i = 0; i < 4; i++) {
			//	if we have hit the first non-slash character, add another leading slash
			if (i >= len || result.length() > 0 || path.charAt(i) != '/')
				result.append('/');
		}
		result.append(path);
		return result.toString();
	}
	
	public static URI removeFileExtension(URI uri) {
		String lastSegment = lastSegment(uri);
		if (lastSegment == null)
			return uri;
		int lastIndex = lastSegment.lastIndexOf('.');
		if (lastIndex == -1)
			return uri;
		String uriString = uri.toString();
		lastIndex = uriString.lastIndexOf('.');
		uriString = uriString.substring(0, lastIndex);
		return URI.create(uriString);
	}
	
	public static String lastSegment(URI location) {
		String path = location.getPath();
		return path.replaceFirst(".*/([^/?]+).*", "$1");
	}
}