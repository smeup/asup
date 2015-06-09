
Options in effect for C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\src\org\asup\db\syntax\ibmi\parser\dml\sqlIBMiQueryParser.lpg:

    ACTION-BLOCK=("IBMiQueryParser.java","/.","./")

    AST-DIRECTORY=""  AST-TYPE="Ast"  NOATTRIBUTES  NOAUTOMATIC-AST  BACKTRACK
    BYTE  CONFLICTS  DAT-DIRECTORY="./"  DAT-FILE="IBMiQueryParserdcl.data"  
    DCL-FILE="IBMiQueryParserdcl.java"  NODEBUG  
    DEF-FILE="IBMiQueryParserdef.java"  NOEDIT  ERROR-MAPS  ESCAPE='$'  
    EXPORT-TERMINALS=("IBMiQueryParserexp.java","","")  EXTENDS-PARSETABLE  
    FACTORY="new "  FILE-PREFIX="IBMiQueryParser"  NOFIRST  NOFOLLOW  
    NOGOTO-DEFAULT  
    GRM-FILE="C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\src\org\asup\db\syntax\ibmi\parser\dml\sqlIBMiQueryParser.lpg"
    NOGOTO-DEFAULT  IMP-FILE="IBMiQueryParserimp.java"  
    INCLUDE-DIRECTORY=".;..;C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\lexer;C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query;C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\sql"
    NOGOTO-DEFAULT  IMP-FILE="IBMiQueryParserimp.java"  LALR=1  NOLIST  MARGIN=8
    MAX-CASES=1024  NAMES=OPTIMIZED  NONT-CHECK  OR_MARKER='|'  
    PACKAGE="org.smeup.sys.db.syntax.ibmi.parser.dml"  NOPARENT-SAVE  
    PARSETABLE-INTERFACES="lpg.lpgjavaruntime.ParseTable"  PREFIX="TK_"  
    PRIORITY  PROGRAMMING_LANGUAGE=JAVA  PRS-FILE="IBMiQueryParserprs.java"  
    NOQUIET  READ-REDUCE  REMAP-TERMINALS  SCOPES  NOSERIALIZE  SHIFT-DEFAULT  
    NOSINGLE-PRODUCTIONS  SOFT-KEYWORDS  NOSTATES  SUFFIX=""  
    SYM-FILE="IBMiQueryParsersym.java"  TAB-FILE="sqlIBMiQueryParser.t"  TABLE
    TEMPLATE="sqlparserTemplate.lpg"  TRACE=CONFLICTS  NOVARIABLES  NOVERBOSE  
    NOVISITOR  VISITOR-TYPE="Visitor"  WARNINGS  NOXREF  

*** The following undeclared symbols are assumed to be Terminals:

        DOUBLE_QUOTE  QUOTE  LEFT_PAREN  RIGHT_PAREN  ASTERISK  PLUS_SIGN  COMMA  
    MINUS_SIGN PERIOD  SOLIDUS  COLON  SEMICOLON  LESS_THAN_OPERATOR  
    EQUALS_OPERATOR GREATER_THAN_OPERATOR  QUESTION_MARK  LEFT_BRACKET  
    RIGHT_BRACKET VERTICAL_BAR  NOT_EQUALS_OPERATOR  
    GREATER_THAN_OR_EQUALS_OPERATOR LESS_THAN_OR_EQUALS_OPERATOR  
    CONCAT_OPERATOR DOUBLE_PERIOD  RIGHT_ARROW  DELIMITED_IDENTIFIER  
    EMBEDDED_VARIABLE_NAME UNSIGNED_INTEGER  SUFFIXED_UNSIGNED_INTEGER  
    EXACT_NUMERIC_LITERAL APPROXIMATE_NUMERIC_LITERAL  
    NATIONAL_CHAR_STRING_LITERAL NATIONAL_HEX_STRING_LITERAL  BIT_STRING_LITERAL  
    HEX_STRING_LITERAL CHAR_STRING_LITERAL  COMMENT_STRING  
    DELIMITED_TYPE_IDENTIFIER VERSION_IDENTIFIER  STATEMENT_TERMINATOR  
    HOSTVARIABLE PARAMETER_MARKER  LEFT_BRACKET_TRIGRAPH  RIGHT_BRACKET_TRIGRAPH  
The macro "$NON" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 242 is undefined. No susbtitution made
The macro "$" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 242 is undefined. No susbtitution made
The macro "$NON" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 245 is undefined. No susbtitution made
The macro "$" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 245 is undefined. No susbtitution made
The macro "$NON" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 248 is undefined. No susbtitution made
The macro "$" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 248 is undefined. No susbtitution made
The macro "$NON" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 624 is undefined. No susbtitution made
The macro "$" used in file C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\lpg_include\query/sqlqueryparserRules.lpg at line 624 is undefined. No susbtitution made


Strongly-connected components in ranks:

    <table_join>
    <table_ref>



RANK RULE
==== ====
1    65    <datatype> ::= <datatype_predefined>
2    66    <datatype> ::= <datatype_user_defined_distinct>
3    67    <datatype> ::= <datatype_path-resolved_user-defined_type_name>
4    68    <datatype> ::= <datatype_collection_type>
5    158   <expression_factor> ::= LEFT_PAREN <expression> RIGHT_PAREN
6    159   <expression_factor> ::= <subquery>
7    160   <expression_factor> ::= <special_register>
8    161   <expression_factor> ::= <column_ref>
9    189   <grouping_sets_element> ::= LEFT_PAREN <grouping_sets_element_exp_list> RIGHT_PAREN
10   190   <grouping_sets_element> ::= <grouping_sets_element_exp>
11   211   <insert_stmt> ::= INSERT INTO <target_table> <opt_target_column_list> VALUES <insert_row_commalist>
12   309   <query_exp> ::= <query_combined>
13   310   <query_exp> ::= <query_term>
14   366   <super_groups_element> ::= LEFT_PAREN <super_groups_element_exp_list> RIGHT_PAREN
15   367   <super_groups_element> ::= <super_groups_element_exp>
16   404   <values_row> ::= LEFT_PAREN <expression_commalist> RIGHT_PAREN
17   408   <with_clause> ::= WITH <with_table_spec_list>
18   409   <with_clause> ::=
19   311   <query_exp_root> ::= <with_clause> <query_exp>
20   312   <query_stmt> ::= <query_exp_root> <opt_order_by_clause> <opt_updatability_clause>
21   212   <insert_stmt> ::= INSERT INTO <target_table> <opt_target_column_list> <query_exp_root>
22   402   <update_stmt> ::= UPDATE <target_table> <opt_as_target_table> SET <update_assignment_clause> <opt_where_clause>
23   140   <delete_stmt> ::= DELETE FROM <target_table> <opt_as_target_table> <opt_where_clause>
24   219   <merge statement> ::= MERGE INTO <merge_target_table> USING <merge_source_table> ON <merge_on_condition> <merge operation specification list>
25   37    <call_statement> ::= CALL <procedure_object> <opt_argument_list>
26   5     <sql_dml_stmt> ::= <query_stmt>
27   6     <sql_dml_stmt> ::= <insert_stmt>
28   7     <sql_dml_stmt> ::= <update_stmt>
29   8     <sql_dml_stmt> ::= <delete_stmt>
30   9     <sql_dml_stmt> ::= <merge statement>
31   10    <sql_dml_stmt> ::= <call_statement>
32   4     <sql_dml_stmt_xspan> ::= <sql_dml_stmt>
33   1     <sql_dml_stmt_list> ::= <sql_dml_stmt_xspan>
34   2     <sql_dml_stmt_list> ::= <sql_dml_stmt_list> STATEMENT_TERMINATOR <sql_dml_stmt_xspan>
35   3     <sql_dml_stmt_list> ::= <sql_dml_stmt_list> STATEMENT_TERMINATOR
36   0     $accept ::= <sql_dml_stmt_list>
37   57    <constant> ::= CHAR_STRING_LITERAL
38   58    <constant> ::= G CHAR_STRING_LITERAL
39   59    <constant> ::= N CHAR_STRING_LITERAL
40   60    <constant> ::= HEX_STRING_LITERAL
41   61    <constant> ::= UNSIGNED_INTEGER
42   62    <constant> ::= UNSIGNED_INTEGER
43   63    <constant> ::= EXACT_NUMERIC_LITERAL
44   64    <constant> ::= APPROXIMATE_NUMERIC_LITERAL
45   295   <parameter> ::= HOSTVARIABLE
46   296   <parameter> ::= PARAMETER_MARKER
47   198   <identifier> ::= REGULAR_IDENTIFIER
48   199   <identifier> ::= DELIMITED_IDENTIFIER
49   329   <schema> ::= <identifier>
50   280   <opt_schema_dot> ::= <schema> PERIOD
51   281   <opt_schema_dot> ::=
52   181   <function> ::= <opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN
53   182   <function> ::= <opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> <opt_expression_commalist> RIGHT_PAREN
54   38    <case_expression> ::= CASE <case_search_when_list> <opt_case_else> END
55   39    <case_expression> ::= CASE <expression> <case_simple_when_list> <opt_case_else> END
56   46    <cast_expression> ::= CAST LEFT_PAREN <cast_operand> AS <cast_target> RIGHT_PAREN
57   162   <expression_factor> ::= <constant>
58   163   <expression_factor> ::= <parameter>
59   164   <expression_factor> ::= <function>
60   165   <expression_factor> ::= <case_expression>
61   166   <expression_factor> ::= <cast_expression>
62   167   <expression_factor> ::= PLUS_SIGN <expression_factor>
63   168   <expression_factor> ::= MINUS_SIGN <expression_factor>
64   169   <expression_factor> ::= DEFAULT
65   170   <expression_factor> ::= NULL
66   171   <expression_term> ::= <expression_term> ASTERISK <expression_factor>
67   172   <expression_term> ::= <expression_term> SOLIDUS <expression_factor>
68   173   <expression_term> ::= <expression_term> CONCAT <expression_factor>
69   174   <expression_term> ::= <expression_term> CONCAT_OPERATOR <expression_factor>
70   175   <expression_term> ::= <expression_term> <duration>
71   176   <expression_term> ::= <expression_factor>
72   151   <expression> ::= <expression> PLUS_SIGN <expression_term>
73   152   <expression> ::= <expression> MINUS_SIGN <expression_term>
74   153   <expression> ::= <expression_term>
75   328   <scalar_comparison> ::= <expression> <relop> <expression>
76   403   <value_expr_row> ::= LEFT_PAREN <expression_commalist_multiple_elements> RIGHT_PAREN
77   325   <row_comparison> ::= <value_expr_row> <relop> <value_expr_row>
78   213   <intervaltest> ::= <expression> NOT BETWEEN <expression> AND <expression>
79   214   <intervaltest> ::= <expression> BETWEEN <expression> AND <expression>
80   231   <nulltest> ::= <expression> IS NOT NULL
81   232   <nulltest> ::= <expression> IS NULL
82   217   <liketest> ::= <expression> NOT LIKE <expression> <opt_escape>
83   218   <liketest> ::= <expression> LIKE <expression> <opt_escape>
84   201   <in_cond> ::= <expression> NOT IN LEFT_PAREN <expression_commalist> RIGHT_PAREN
85   202   <in_cond> ::= <expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN
86   203   <in_cond> ::= <expression> NOT IN <subquery>
87   204   <in_cond> ::= <expression> IN <subquery>
88   205   <in_cond> ::= LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN NOT IN <subquery>
89   206   <in_cond> ::= LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN IN <subquery>
90   150   <exists> ::= EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN
91   12    <all_or_any_cond> ::= <expression> <relop> ANY <subquery>
92   13    <all_or_any_cond> ::= <expression> <relop> SOME <subquery>
93   14    <all_or_any_cond> ::= <expression> <relop> ALL <subquery>
94   15    <all_or_any_cond> ::= LEFT_PAREN <expression_commalist_multiple_elements> RIGHT_PAREN EQUALS_OPERATOR ANY <subquery>
95   16    <all_or_any_cond> ::= LEFT_PAREN <expression_commalist_multiple_elements> RIGHT_PAREN EQUALS_OPERATOR SOME <subquery>
96   334   <simplecomp> ::= <scalar_comparison>
97   335   <simplecomp> ::= <row_comparison>
98   336   <simplecomp> ::= <intervaltest>
99   337   <simplecomp> ::= <nulltest>
100  338   <simplecomp> ::= <liketest>
101  339   <simplecomp> ::= <in_cond>
102  340   <simplecomp> ::= <exists>
103  341   <simplecomp> ::= <all_or_any_cond>
104  33    <boolean_primary> ::= <simplecomp>
105  34    <boolean_primary> ::= NOT <simplecomp>
106  35    <boolean_primary> ::= LEFT_PAREN <boolean_expression> RIGHT_PAREN
107  36    <boolean_primary> ::= NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN
108  28    <boolean_factor> ::= <boolean_primary>
109  29    <boolean_factor> ::= <boolean_primary> IS <boolean_values>
110  30    <boolean_factor> ::= <boolean_primary> IS NOT <boolean_values>
111  26    <boolean_term> ::= <boolean_factor>
112  27    <boolean_term> ::= <boolean_term> AND <boolean_factor>
113  24    <boolean_expression> ::= <boolean_term>
114  25    <boolean_expression> ::= <boolean_expression> OR <boolean_term>
115  56    <condition> ::= <boolean_expression>
116  222   <merge_on_condition> ::= <condition>
117  370   <table> ::= <identifier>
118  386   <table_simple> ::= <table> <opt_table_correlation>
119  375   <table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation>
120  426   <table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation>
121  427   <table_qualified> ::= <schema> SOLIDUS <table> <opt_table_correlation>
122  376   <table_query> ::= LEFT_PAREN <query_exp> RIGHT_PAREN <table_correlation>
123  377   <table_query> ::= TABLE LEFT_PAREN <query_exp> RIGHT_PAREN <table_correlation>
124  374   <table_nested> ::= LEFT_PAREN <table_ref> RIGHT_PAREN
125  372   <table_func> ::= TABLE LEFT_PAREN <opt_schema_dot> <identifier> LEFT_PAREN <opt_expression_commalist> RIGHT_PAREN RIGHT_PAREN <table_correlation>
126  373   <table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON <condition>
127  378   <table_ref> ::= <table_simple>
128  379   <table_ref> ::= <table_qualified>
129  380   <table_ref> ::= <table_join>
130  381   <table_ref> ::= <table_query>
131  382   <table_ref> ::= <table_nested>
132  383   <table_ref> ::= <table_func>
133  221   <merge_source_table> ::= <table_ref>
134  389   <target_table> ::= <table>
135  390   <target_table> ::= <schema> PERIOD <table>
136  434   <target_table> ::= <table>
137  435   <target_table> ::= <schema> PERIOD <table>
138  436   <target_table> ::= <schema> SOLIDUS <table>
139  220   <merge_target_table> ::= <target_table> <opt_as_alias>
140  11    <alias_name> ::= <identifier>
141  317   <relop> ::= EQUALS_OPERATOR
142  318   <relop> ::= LESS_THAN_OPERATOR
143  319   <relop> ::= LESS_THAN_OR_EQUALS_OPERATOR
144  320   <relop> ::= NOT_EQUALS_OPERATOR
145  321   <relop> ::= GREATER_THAN_OPERATOR
146  322   <relop> ::= GREATER_THAN_OR_EQUALS_OPERATOR
147  359   <subquery> ::= LEFT_PAREN <query_exp_root> RIGHT_PAREN
148  154   <expression_commalist> ::= <expression>
149  155   <expression_commalist> ::= <expression_commalist> COMMA <expression>
150  157   <expression_commalist_multiple_elements> ::= <expression_commalist> COMMA <expression>
151  156   <expression_commalist_multiple_elements> ::=
152  17    <argument> ::= <expression>
153  18    <argument_list> ::= LEFT_PAREN <opt_argument_list_body> RIGHT_PAREN
154  19    <argument_list_body> ::= <argument>
155  20    <argument_list_body> ::= <argument_list_body> COMMA <argument>
156  239   <opt_argument_list_body> ::= <argument_list_body>
157  240   <opt_argument_list_body> ::=
158  22    [AS] ::= AS
159  21    [AS] ::=
160  241   <opt_as> ::= AS
161  242   <opt_as> ::=
162  23    <as_alias> ::= <opt_as> <alias_name>
163  31    <boolean_values> ::= TRUE
164  32    <boolean_values> ::= FALSE
165  297   <procedure_object> ::= <opt_schema_dot> <identifier>
166  237   <opt_argument_list> ::= <argument_list>
167  238   <opt_argument_list> ::=
168  40    <case_search_when> ::= WHEN <condition> THEN <expression>
169  41    <case_search_when_list> ::= <case_search_when>
170  42    <case_search_when_list> ::= <case_search_when_list> <case_search_when>
171  250   <opt_case_else> ::= ELSE <expression>
172  251   <opt_case_else> ::=
173  43    <case_simple_when> ::= WHEN <expression> THEN <expression>
174  44    <case_simple_when_list> ::= <case_simple_when>
175  45    <case_simple_when_list> ::= <case_simple_when_list> <case_simple_when>
176  233   <null_specification> ::= NULL
177  200   <implicitly_typed_value_specification> ::= <null_specification>
178  47    <cast_operand> ::= <expression>
179  48    <cast_operand> ::= <implicitly_typed_value_specification>
180  49    <cast_target> ::= <datatype>
181  50    <column> ::= <identifier>
182  51    <column_name> ::= <identifier>
183  52    <column_name_list> ::= <column_name>
184  53    <column_name_list> ::= <column_name_list> COMMA <column_name>
185  54    <column_ref> ::= <column>
186  55    <column_ref> ::= <opt_schema_dot> <table> PERIOD <column>
187  92    <datatype_numerical_fixed_precision> ::= NUMERIC
188  93    <datatype_numerical_fixed_precision> ::= DECIMAL
189  94    <datatype_numerical_fixed_precision> ::= DEC
190  95    <datatype_numerical_fixed_precision> ::= NUMERIC LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
191  96    <datatype_numerical_fixed_precision> ::= DECIMAL LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
192  97    <datatype_numerical_fixed_precision> ::= DEC LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
193  98    <datatype_numerical_fixed_precision> ::= NUMERIC LEFT_PAREN UNSIGNED_INTEGER COMMA UNSIGNED_INTEGER RIGHT_PAREN
194  99    <datatype_numerical_fixed_precision> ::= DECIMAL LEFT_PAREN UNSIGNED_INTEGER COMMA UNSIGNED_INTEGER RIGHT_PAREN
195  100   <datatype_numerical_fixed_precision> ::= DEC LEFT_PAREN UNSIGNED_INTEGER COMMA UNSIGNED_INTEGER RIGHT_PAREN
196  101   <datatype_numerical_integer> ::= INTEGER
197  102   <datatype_numerical_integer> ::= INT
198  103   <datatype_numerical_integer> ::= SMALLINT
199  104   <datatype_numerical_integer> ::= BIGINT
200  85    <datatype_numerical_exact> ::= <datatype_numerical_fixed_precision>
201  86    <datatype_numerical_exact> ::= <datatype_numerical_integer>
202  87    <datatype_numerical_approximate> ::= FLOAT
203  88    <datatype_numerical_approximate> ::= FLOAT LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
204  89    <datatype_numerical_approximate> ::= REAL
205  90    <datatype_numerical_approximate> ::= DOUBLE
206  91    <datatype_numerical_approximate> ::= DOUBLE PRECISION
207  83    <datatype_numerical> ::= <datatype_numerical_exact>
208  84    <datatype_numerical> ::= <datatype_numerical_approximate>
209  109   <datatype_character> ::= CHARACTER
210  110   <datatype_character> ::= CHAR
211  111   <datatype_character> ::= CHARACTER LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
212  112   <datatype_character> ::= CHAR LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
213  113   <datatype_character> ::= CHARACTER VARYING LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
214  114   <datatype_character> ::= CHAR VARYING LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
215  115   <datatype_character> ::= VARCHAR LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
216  116   <datatype_character> ::= CLOB
217  117   <datatype_character> ::= CLOB LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
218  118   <datatype_character> ::= CHARACTER LARGE OBJECT
219  119   <datatype_character> ::= CHARACTER LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
220  120   <datatype_character> ::= CHAR LARGE OBJECT
221  121   <datatype_character> ::= CHAR LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
222  122   <datatype_character_national> ::= GRAPHIC
223  123   <datatype_character_national> ::= GRAPHIC LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
224  124   <datatype_character_national> ::= VARGRAPHIC LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN
225  125   <datatype_character_national> ::= DBCLOB
226  126   <datatype_character_national> ::= DBCLOB LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
227  105   <datatype_binary> ::= BLOB
228  106   <datatype_binary> ::= BLOB LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
229  107   <datatype_binary> ::= BINARY LARGE OBJECT
230  108   <datatype_binary> ::= BINARY LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER <datatype_opt_size_unit> RIGHT_PAREN
231  81    <datatype_time> ::= TIME
232  82    <datatype_time> ::= TIMESTAMP
233  80    <datatype_date> ::= DATE
234  74    <datatype_predefined> ::= <datatype_numerical>
235  75    <datatype_predefined> ::= <datatype_character>
236  76    <datatype_predefined> ::= <datatype_character_national>
237  77    <datatype_predefined> ::= <datatype_binary>
238  78    <datatype_predefined> ::= <datatype_time>
239  79    <datatype_predefined> ::= <datatype_date>
240  132   <datatype_user_defined_distinct> ::= <identifier>
241  131   <datatype_path-resolved_user-defined_type_name> ::= <opt_schema_dot> <identifier>
242  71    <datatype_array_type> ::= <datatype> ARRAY
243  72    <datatype_array_type> ::= <datatype> ARRAY <left_bracket_or_trigraph> UNSIGNED_INTEGER <right_bracket_or_trigraph>
244  73    <datatype_multiset_type> ::= <datatype> MULTISET
245  69    <datatype_collection_type> ::= <datatype_array_type>
246  70    <datatype_collection_type> ::= <datatype_multiset_type>
247  215   <left_bracket_or_trigraph> ::= LEFT_BRACKET
248  216   <left_bracket_or_trigraph> ::= LEFT_BRACKET_TRIGRAPH
249  323   <right_bracket_or_trigraph> ::= RIGHT_BRACKET
250  324   <right_bracket_or_trigraph> ::= RIGHT_BRACKET_TRIGRAPH
251  127   <datatype_opt_size_unit> ::= K
252  128   <datatype_opt_size_unit> ::= M
253  129   <datatype_opt_size_unit> ::= G
254  130   <datatype_opt_size_unit> ::=
255  133   <default_option> ::= <constant>
256  134   <default_option> ::= USER
257  135   <default_option> ::= CURRENT_USER
258  136   <default_option> ::= CURRENT_ROLE
259  137   <default_option> ::= SESSION_USER
260  138   <default_option> ::= SYSTEM_USER
261  139   <default_option> ::= CURRENT_PATH
262  245   <opt_as_target_table> ::= <opt_as> <table>
263  246   <opt_as_target_table> ::=
264  290   <opt_where_clause> ::= WHERE <condition>
265  291   <opt_where_clause> ::=
266  387   <target_column_list> ::= <column_ref>
267  388   <target_column_list> ::= <target_column_list> COMMA <column_ref>
268  141   <derived_column_list> ::= <column_ref>
269  142   <derived_column_list> ::= <target_column_list> COMMA <column_ref>
270  143   <duration> ::= DAYS
271  144   <duration> ::= HOURS
272  145   <duration> ::= MICROSECONDS
273  146   <duration> ::= MINUTES
274  147   <duration> ::= MONTHS
275  148   <duration> ::= SECONDS
276  149   <duration> ::= YEARS
277  342   <special_register> ::= CURRENT_DATE
278  343   <special_register> ::= CURRENT_TIME
279  344   <special_register> ::= CURRENT_TIMESTAMP
280  345   <special_register> ::= CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> RIGHT_PAREN
281  346   <special_register> ::= LOCALTIME
282  347   <special_register> ::= LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN
283  348   <special_register> ::= LOCALTIMESTAMP
284  349   <special_register> ::= LOCALTIMESTAMP LEFT_PAREN <timestamp precision> RIGHT_PAREN
285  350   <special_register> ::= CURRENT_DEFAULT_TRANSFORM_GROUP
286  351   <special_register> ::= CURRENT_PATH
287  352   <special_register> ::= CURRENT_ROLE
288  353   <special_register> ::= CURRENT_TRANSFORM_GROUP_FOR_TYPE <datatype_path-resolved_user-defined_type_name>
289  354   <special_register> ::= CURRENT_USER
290  355   <special_register> ::= SESSION_USER
291  356   <special_register> ::= SYSTEM_USER
292  357   <special_register> ::= USER
293  358   <special_register> ::= VALUE
294  177   <string_value_expression> ::= <expression>
295  178   <fetch_first_clause> ::= FETCH FIRST <opt_fetch_first_row_count> <row_or_rows> ONLY
296  288   <opt_fetch_first_row_count> ::= UNSIGNED_INTEGER
297  289   <opt_fetch_first_row_count> ::=
298  326   <row_or_rows> ::= ROW
299  327   <row_or_rows> ::= ROWS
300  179   <func_ref> ::= <identifier>
301  180   <func_ref> ::= <alias_name> PERIOD <identifier>
302  235   <opt_all_distinct> ::= ALL
303  236   <opt_all_distinct> ::= DISTINCT
304  234   <opt_all_distinct> ::=
305  258   <opt_expression_commalist> ::= <expression_commalist>
306  259   <opt_expression_commalist> ::=
307  185   <grouping_exp> ::= <expression>
308  360   <super_groups> ::= CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN
309  361   <super_groups> ::= ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN
310  362   <super_groups> ::= LEFT_PAREN RIGHT_PAREN
311  183   <grouping> ::= <grouping_exp>
312  184   <grouping> ::= <super_groups>
313  186   <grouping_sets> ::= GROUPING SETS LEFT_PAREN <grouping_sets_element_list> RIGHT_PAREN
314  187   <grouping_sets_element_list> ::= <grouping_sets_element>
315  188   <grouping_sets_element_list> ::= <grouping_sets_element_list> COMMA <grouping_sets_element>
316  191   <grouping_sets_element_exp> ::= <grouping>
317  192   <grouping_sets_element_exp_list> ::= <grouping_sets_element_exp>
318  193   <grouping_sets_element_exp_list> ::= <grouping_sets_element_exp_list> COMMA <grouping_sets_element_exp>
319  194   <grouping_spec> ::= <grouping>
320  195   <grouping_spec> ::= <grouping_sets>
321  196   <grouping_spec_list> ::= <grouping_spec>
322  197   <grouping_spec_list> ::= <grouping_spec_list> COMMA <grouping_spec>
323  207   <insert_row> ::= LEFT_PAREN <expression_commalist_multiple_elements> RIGHT_PAREN
324  208   <insert_row> ::= <expression>
325  209   <insert_row_commalist> ::= <insert_row>
326  210   <insert_row_commalist> ::= <insert_row_commalist> COMMA <insert_row>
327  284   <opt_target_column_list> ::= LEFT_PAREN <target_column_list> RIGHT_PAREN
328  285   <opt_target_column_list> ::=
329  256   <opt_escape> ::= ESCAPE CHAR_STRING_LITERAL
330  257   <opt_escape> ::=
331  227   <merge when matched clause> ::= WHEN MATCHED THEN <merge update specification>
332  228   <merge when not matched clause> ::= WHEN NOT MATCHED THEN <merge insert specification>
333  225   <merge when clause> ::= <merge when matched clause>
334  226   <merge when clause> ::= <merge when not matched clause>
335  223   <merge operation specification list> ::= <merge when clause>
336  224   <merge operation specification list> ::= <merge operation specification list> <merge when clause>
337  243   <opt_as_alias> ::= <as_alias>
338  244   <opt_as_alias> ::=
339  229   <merge update specification> ::= UPDATE SET <update_assignment_clause>
340  230   <merge insert specification> ::= INSERT <opt_target_column_list> VALUES <insert_row>
341  397   <update_assignment_expression> ::= <column_ref> EQUALS_OPERATOR <expression>
342  398   <update_assignment_expression> ::= LEFT_PAREN <target_column_list> RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN <query_exp> RIGHT_PAREN
343  399   <update_assignment_expression> ::= LEFT_PAREN <target_column_list> RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN <expression_commalist> RIGHT_PAREN
344  400   <update_assignment_expression_commalist> ::= <update_assignment_expression>
345  401   <update_assignment_expression_commalist> ::= <update_assignment_expression_commalist> COMMA <update_assignment_expression>
346  396   <update_assignment_clause> ::= <update_assignment_expression_commalist>
347  247   <opt_asc_desc> ::= ASC
348  248   <opt_asc_desc> ::= DESC
349  249   <opt_asc_desc> ::=
350  252   <opt_column_name_list> ::= LEFT_PAREN <column_name_list> RIGHT_PAREN
351  253   <opt_column_name_list> ::=
352  254   <opt_default_clause> ::= DEFAULT <default_option>
353  255   <opt_default_clause> ::=
354  260   <opt_fetch_first_clause> ::= <fetch_first_clause>
355  261   <opt_fetch_first_clause> ::=
356  262   <opt_group_by_clause> ::= GROUP BY <grouping_spec_list>
357  263   <opt_group_by_clause> ::= GROUP BY <super_groups_element_list> WITH CUBE
358  264   <opt_group_by_clause> ::= GROUP BY <super_groups_element_list> WITH ROLLUP
359  265   <opt_group_by_clause> ::=
360  368   <super_groups_element_list> ::= <super_groups_element>
361  369   <super_groups_element_list> ::= <super_groups_element_list> COMMA <super_groups_element>
362  266   <opt_having_clause> ::= HAVING <condition>
363  267   <opt_having_clause> ::=
364  268   <opt_join_type> ::= INNER
365  269   <opt_join_type> ::= LEFT <opt_join_type_outer>
366  270   <opt_join_type> ::= RIGHT <opt_join_type_outer>
367  271   <opt_join_type> ::= FULL <opt_join_type_outer>
368  272   <opt_join_type> ::=
369  273   <opt_join_type_outer> ::= OUTER
370  274   <opt_join_type_outer> ::=
371  275   <opt_null_order> ::= NULLS FIRST
372  276   <opt_null_order> ::= NULLS LAST
373  277   <opt_null_order> ::=
374  278   <opt_order_by_clause> ::= ORDER BY <ordering_spec_commalist>
375  279   <opt_order_by_clause> ::=
376  292   <ordering_spec> ::= <expression> <opt_asc_desc> <opt_null_order>
377  293   <ordering_spec_commalist> ::= <ordering_spec>
378  294   <ordering_spec_commalist> ::= <ordering_spec_commalist> COMMA <ordering_spec>
379  371   <table_correlation> ::= <as_alias> <opt_column_name_list>
380  282   <opt_table_correlation> ::= <table_correlation>
381  283   <opt_table_correlation> ::=
382  393   <updatability_expression> ::= FOR READ ONLY
383  394   <updatability_expression> ::= FOR UPDATE
384  395   <updatability_expression> ::= FOR UPDATE OF <column_name_list>
385  286   <opt_updatability_clause> ::= <updatability_expression>
386  287   <opt_updatability_clause> ::=
387  298   <project> ::= <expression> <opt_as_alias>
388  299   <project> ::= ASTERISK
389  300   <project> ::= <table> PERIOD ASTERISK
390  301   <project> ::= <schema> PERIOD <table> PERIOD ASTERISK
391  428   <project> ::= <expression> <opt_as_alias>
392  429   <project> ::= ASTERISK
393  430   <project> ::= <table> PERIOD ASTERISK
394  431   <project> ::= <table> SOLIDUS ASTERISK
395  432   <project> ::= <schema> PERIOD <table> PERIOD ASTERISK
396  433   <project> ::= <schema> SOLIDUS <table> SOLIDUS ASTERISK
397  302   <query_combined> ::= <query_exp> <query_combined_operator> <query_term> <opt_order_by_clause> <opt_fetch_first_clause>
398  303   <query_combined_operator> ::= UNION
399  304   <query_combined_operator> ::= UNION ALL
400  305   <query_combined_operator> ::= INTERSECT
401  306   <query_combined_operator> ::= INTERSECT ALL
402  307   <query_combined_operator> ::= EXCEPT
403  308   <query_combined_operator> ::= EXCEPT ALL
404  413   <query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> FROM <table_ref_commalist> <opt_where_clause> <opt_group_by_clause> <opt_having_clause> <opt_order_by_clause> <opt_fetch_first_clause> <opt_optimize_clause>
405  316   <query_values> ::= VALUES <values_row_commalist> <opt_order_by_clause> <opt_fetch_first_clause>
406  313   <query_term> ::= <query_select>
407  314   <query_term> ::= <query_values>
408  315   <query_term> ::= LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause> <opt_fetch_first_clause>
409  405   <values_row> ::= <expression>
410  406   <values_row_commalist> ::= <values_row>
411  407   <values_row_commalist> ::= <values_row_commalist> COMMA <values_row>
412  330   <schema_qualified_name> ::= <identifier>
413  331   <schema_qualified_name> ::= <schema> PERIOD <identifier>
414  332   <selection> ::= <project>
415  333   <selection> ::= <selection> COMMA <project>
416  392   <timestamp precision> ::= UNSIGNED_INTEGER
417  391   <time precision> ::= UNSIGNED_INTEGER
418  363   <super_groups_element_exp> ::= <grouping_exp>
419  364   <super_groups_element_exp_list> ::= <super_groups_element_exp>
420  365   <super_groups_element_exp_list> ::= <super_groups_element_exp_list> COMMA <super_groups_element_exp>
421  384   <table_ref_commalist> ::= <table_ref>
422  385   <table_ref_commalist> ::= <table_ref_commalist> COMMA <table_ref>
423  412   <with_table_spec> ::= <table> <opt_column_name_list> AS LEFT_PAREN <query_exp> RIGHT_PAREN
424  410   <with_table_spec_list> ::= <with_table_spec>
425  411   <with_table_spec_list> ::= <with_table_spec_list> COMMA <with_table_spec>
426  416   <into_clause> ::= INTO <into_list>
427  414   <opt_into_clause> ::= <into_clause>
428  415   <opt_into_clause> ::=
429  423   <optimize_clause> ::= OPTIMIZE FOR <opt_optimize_row_count> <row_or_rows>
430  421   <opt_optimize_clause> ::= <optimize_clause>
431  422   <opt_optimize_clause> ::=
432  420   <into_item> ::= HOSTVARIABLE
433  417   <into_list> ::= <into_item>
434  418   <into_list> ::= <into_list> COMMA <into_item>
435  419   <into_list> ::=
436  424   <opt_optimize_row_count> ::= UNSIGNED_INTEGER
437  425   <opt_optimize_row_count> ::=
*** The following Terminals are useless: 
        ACCESS  ACCTNG  ACTION  ACTIVATE  ADD  ADMIN  ADMINISTRATION  AFTER  AGE  
    ALIAS ALLOCATE  ALLOW  ALTER  ALTERIN  ALWAYS  APPEND  APPL_ID  APPL_NAME  
    APPLNAME ASCII  ASENSITIVE  ASSIGNMENT  ASSOCIATE  AST  ASUTIME  AT  ATOMIC  
    ATTRIBUTE ATTRIBUTES  AUTHORIZATION  AUTH_ID  AUTHID  AUTOMATIC  AUTOSTART  
    AVAILABLE B  BEFORE  BEGIN  BERNOULLI  BIND  BINDADD  BIT  BLOCKED  
    BLOCKSIZE BOTH  BUFFER  BUFFERPOOL  BUFFERPOOLS  BUFFERSIZE  BUILD  BYPASS  
    C CACHE  CACHING  CALLED  CALLER  CAPTURE  CARDINALITIES  CARDINALITY  
    CASCADE CASCADED  CCSID  CHANGE  CHANGED  CHANGES  CHECK  CHECKED  CLIENT  
    CLOSE CLR  CLUSTER  COBOL  COLLECT  COLLID  COLUMN  COLUMNS  COMM  COMMENT  
    COMMIT COMMITTED  COMPACT  COMPARE  COMPARISONS  COMPRESS  COMPRESSION  
    CONDITION CONN  CONNECT  CONNECTIONS  CONNECTOPT  CONNHEADER  CONNMEMUSE  
    CONSERVATIVE CONSTRAINT  CONSTRAINTS  CONSTRUCTOR  CONTAINERS  CONTAINS  
    CONTENT CONTINUE  CONTINUOUSLY  CONTROL  COPY  COUNT  COUNT_BIG  CPU  CREATE  
    CREATE_EXTERNAL_ROUTINE CREATEIN  CREATE_NOT_FENCED  
    CREATE_NOT_FENCED_ROUTINE CREATETAB  CS  CURRENT  CURRVAL  CURSOR  CURSORS  
    CYCLE DATA  DATABASE  DATALINK  DAY  DB  DBADM  DBINFO  DBMEMUSE  
    DBPARTITIONNUM DBPARTITIONNUMS  DB2DARI  DB2GENRL  DB2GENERAL  DB2OPTIONS  
    DB2SPL DB2SQL  DB2_RETURN_STATUS  DB2_TOKEN_STRING  DEACTIVATE  DEADLOCK  
    DEADLOCKS DECLARE  DEFAULTS  DEFINE  DEFINITION  DEGREE  DEFER  DEFERRED  
    DESCRIPTOR DETAILED  DETAILS  DETERMINED  DETERMINISTIC  DEVICE  DIAGNOSTICS  
    DIMENSIONS DIRTY  DISABLE  DISALLOW  DISPATCH  DISTRIBUTION  DLCONN  DLLOCK  
    DO DROP  DROPIN  DROPPED  DYNAMIC  EACH  ELEMENT  ELSEIF  EMPTY  ENABLE  
    ENCRYPTION ENDING  ENFORCED  ERASE  ESTIMATE  EUR  EVALUATE  EVENT  EXACT  
    EXCEPTION EXCLUDE  EXCLUDES  EXCLUDING  EXCLUSIVE  EXECNODE  EXECUTE  EXIT  
    EXPAND EXPLAIN  EXPRESSION  EXTEND  EXTENDED  EXTENSION  EXTENTSIZE  
    EXTERNAL FEDERATED  FEDERATED_TOOL  FENCED  FILE  FILTER  FINAL  FLUSH  
    FOLLOWING FORCE  FOREIGN  _FOREIGNKEY  FOUND  FREE  FREEPAGE  FS  FUNCTION  
    GBPCACHE GENERAL  GENERATE  GENERATED  GET  GLOBAL  GOTO  GRANT  HANDLER  
    HASHING HIDDEN  HIERARCHY  HIGH  HOLD  HOUR  HPJ  ID  IDENTITY  IF  IGNORE  
    IMMEDIATE IMPLICIT_SCHEMA  INCLUDE  INCLUDES  INCLUDING  INCREMENT  
    INCREMENTAL INDEX  INDEXES  INDICATOR  INFIX  INFO  INHERIT  INITIALLY  
    INITIAL_INSTS INITIAL_IOS  INLINE  INOUT  INPUT  INSENSITIVE  INSTANTIABLE  
    INSTEAD INSTS_PER_ARGBYTE  INSTS_PER_INVOC  INTEGRITY  IO  IOS_PER_ARGBYTE  
    IOS_PER_INVOC ISO  ITERATE  ISOLATION  JAVA  JIS  KEEP  KEY  KEYS  L  
    LANGUAGE LATERAL  LC_CTYPE  LEADING  LEAVE  LENGTH  LEVEL  LEVEL2  LIBRARY  
    LIBRARYADM LIMIT  LINK  LINKTYPE  LOAD  LOCAL  LOCALE  LOCATOR  LOCATORS  
    LOCK LOCKS  LOCKSIZE  LOG  LOGGED  LONG  LONGVAR  LOOP  LOW  MAIN_PROG  
    MANAGED MANUALSTART  MAPPING  MATERIALIZED  MAXFILES  MAXFILESIZE  MAXVALUE  
    MDC MESSAGE_TEXT  METHOD  METHODS  MICROSECOND  MINPCTUSED  MINUTE  MINVALUE  
    MIXED MODE  MODIFIES  MONITOR  MONTH  MOVEMENT  NAME  NEW  NEW_TABLE  NEXT  
    NEXTVAL NICKNAME  NO  NOCACHE  NOCYCLE  NODE  NODES  NODEGROUP  NOMAXVALUE  
    NOMINVALUE NONBLOCKED  NONE  NOORDER  NUM  NUMBLOCKPAGES  NUM_FREQVALUES  
    NUM_QUANTILES OFF  OLD  OLD_TABLE  OLE  OLEDB  ONCE  ONLINE  OPEN  
    OPTIMIZATION OPTION  OPTIONS  ORGANIZE  OUT  OVER  OVERFLOW  OVERHEAD  
    OVERRIDING P  PACKAGE  PAGE  PAGESIZE  PARALLEL  PARAMETER  PASSTHRU  
    PASSWORD PATH  PARTITION  PARTITIONING  PARTITIONINGS  PATROLLER  
    PCTDEACTIVATE PCTFREE  PENDING  PERCENT_ARGBYTES  PERMISSION  PIECESIZE  
    PIPE PLAN  PRECEDING  PREDICATES  PREFETCHSIZE  PREPARE  PRESERVE  PREVIOUS  
    PREVVAL PRIMARY  _PRIMARYKEY  PRIQTY  PRIVILEGES  PROCEDURE  PROFILE  
    PROGRAM PROPAGATE  PROTOCOL  PRUNE  PUBLIC  QUERY  QUERYNO  QUERYTAG  
    QUIESCE_CONNECT RANGE  RATE  RATIO  READS  RECOMMEND  RECONCILE  RECOVERY  
    RECREATE REDUCE  REF  REFERENCE  REFERENCES  REFERENCING  REFRESH  REGISTERS  
    REGULAR RELEASE  REMAIN  REMOTE  RENAME  REOPT  REPEATABLE  REPEAT  REPLACE  
    REPLICATED REQUIRING  RESET  RESIDENT  RESIGNAL  RESIZE  RESOLVE  RESTART  
    RESTORE RESTRICT  RESULT  RESULT_SET_LOCATOR  RETAIN  RETURN  RETURNS  
    RETURN_STATUS REVERSE  REVOKE  ROLLBACK  ROUTINE  ROW_COUNT  RR  RS  RUN  S  
    SAMPLED SAVEPOINT  SBCS  SCANS  SCHEMA  SCOPE  SCRATCHPAD  SCROLL  SEARCH  
    SECOND SECQTY  SECURITYADM  SELECTION  SELECTIVE  SELECTIVITY  SELF  
    SENSITIVE SEQUENCE  SERIALIZABLE  SERVER  SESSION  SETTING  SHARE  SHRLEVEL  
    SIGNAL SIMPLE  SIZE  SNAPSHOT  SOURCE  SPECIAL  SPECIFIC  SPECIFICATION  
    SPLIT SQL  SQLDATA  SQLERROR  SQLEXCEPTION  SQLWARNING  SQLID  SQLMACRO  
    SQLSTATE SSA  STABILITY  STAGING  START  STATE  STATEMENT  STATEMENTS  
    STATIC STATISTICS  STARTING  STAY  STMT  STOGROUP  STORAGE  STORED  STRIP  
    STRIPE STYLE  SUB  SUBSECTION  SUMMARY  SWITCH  SYMMETRIC  SYNONYM  SYSTEM  
    T TABLES  TABLESAMPLE  TABLESPACE  TABLESPACES  TARGET  TEMPLATE  TEMPORARY  
    THREADSAFE THROUGH  TIMEOUT  TIMEZONE  TO  TOKEN  TRAILING  TRANSACTIONS  
    TRANSFERRATE TRANSFORM  TRANSFORMS  TRANSLATE  TREAT  TRIGGER  TRUNC  
    TWOLEVEL TYPE  TYPES  UNBOUNDED  UNCHECKED  UNCOMMITTED  UNDER  UNDO  
    UNICODE UNIQUE  UNLINK  UNTIL  UR  URL  USA  USE  USAGE  USERID  VARIANT  
    VCAT VERSION  VIEW  VOLATILE  WAIT  WHILE  WITHOUT  WORK  WRAPPER  WRITE  
    WRKSTNNAME X  XACT  YEAR  YES  ABSENT  ACCORDING  BASE64  DOCUMENT  ENCODING  
    HEX LOCATION  NAMESPACE  NIL  ORDINALITY  PASSING  PI  RETURNING  URI  
    WHITESPACE XML  XMLAGG  XMLATTRIBUTES  XMLBINARY  XMLCAST  XMLCOMMENT  
    XMLCONCAT XMLDECLARATION  XMLDOCUMENT  XMLELEMENT  XMLEXISTS  XMLFOREST  
    XMLNAMESPACES XMLPARSE  XMLPI  XMLQUERY  XMLSCHEMA  XMLSERIALIZE  XMLTABLE  
    XMLTEXT XMLVALIDATE  DOUBLE_QUOTE  QUOTE  COLON  SEMICOLON  QUESTION_MARK  
    VERTICAL_BAR DOUBLE_PERIOD  RIGHT_ARROW  EMBEDDED_VARIABLE_NAME  
    SUFFIXED_UNSIGNED_INTEGER NATIONAL_CHAR_STRING_LITERAL  
    NATIONAL_HEX_STRING_LITERAL BIT_STRING_LITERAL  COMMENT_STRING  
    DELIMITED_TYPE_IDENTIFIER VERSION_IDENTIFIER  EOLN  
*** The following Non-Terminals are useless: 
        [AS] <default_option> <derived_column_list> <string_value_expression> 
    <func_ref> <opt_default_clause> <schema_qualified_name> 


 IBM LALR Parser Generator              1.00 (May 11 2006)


---------------------------------- CONFLICTS ----------------------------------



STATE 3 ------------------------------------------------------------------------
( 1 11 )

<call_statement> ::= CALL  .<procedure_object> <opt_argument_list> 

<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<procedure_object> ::= .<opt_schema_dot> <identifier> 
<schema> ::= .<identifier> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<procedure_object> ::= .<opt_schema_dot> <identifier> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<procedure_object> ::= .<opt_schema_dot> <identifier> 
<opt_schema_dot> ::= . (281)




STATE 19 -----------------------------------------------------------------------
( 6 15 16 21 )

<target_table> ::= <table> . (389)
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "REGULAR_IDENTIFIER" between rule 389 and 434

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "EOF" between rule 389 and 434

'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "STATEMENT_TERMINATOR" between rule 389 and 434

<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "DELIMITED_IDENTIFIER" between rule 389 and 434

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "LEFT_PAREN" between rule 389 and 434

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "WITH" between rule 389 and 434

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "WHERE" between rule 389 and 434

<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "VALUES" between rule 389 and 434

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "USING" between rule 389 and 434

<merge statement> ::= MERGE INTO  .<merge_target_table> USING 
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_target_table> ::= .<target_table> <opt_as_alias> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<merge statement> ::= MERGE INTO  .<merge_target_table> USING 
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_target_table> ::= .<target_table> <opt_as_alias> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "SET" between rule 389 and 434

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "SELECT" between rule 389 and 434

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <table> . (434)

*** Reduce/reduce conflict on "AS" between rule 389 and 434

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (389)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <table> . (434)

*** 7 Keyword/Identifier Reduce/reduce conflicts detected



STATE 23 -----------------------------------------------------------------------
( 8 24 58 119 164 178 180 199 326 360 )

<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<values_row> ::= .LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<values_row> ::= .<expression> 
<values_row_commalist> ::= .<values_row> 
<values_row_commalist> ::= .<values_row_commalist> COMMA <values_row> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 30 -----------------------------------------------------------------------
( 12 )

<argument_list> ::= LEFT_PAREN  .<opt_argument_list_body> RIGHT_PAREN 

<argument> ::= .<expression> 
<argument_list_body> ::= .<argument> 
<argument_list_body> ::= .<argument_list_body> COMMA <argument> 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_argument_list_body> ::= .<argument_list_body> 
<opt_argument_list_body> ::= . (240)
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 38 -----------------------------------------------------------------------
( 21 )

<insert_stmt> ::= INSERT INTO <target_table>  .<opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<insert_stmt> ::= INSERT INTO <target_table>  .<opt_target_column_list> 
                  <query_exp_root> 

<opt_target_column_list> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
<opt_target_column_list> ::= . (285)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 285

<insert_stmt> ::= INSERT INTO <target_table>  .<opt_target_column_list> 
                  <query_exp_root> 
<opt_target_column_list> ::= . (285)




STATE 39 -----------------------------------------------------------------------
( 22 )

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<project> ::= .<expression> <opt_as_alias> 
<project> ::= .ASTERISK 
<project> ::= .<table> PERIOD ASTERISK 
<project> ::= .<schema> PERIOD <table> PERIOD ASTERISK 
<schema> ::= .<identifier> 
<selection> ::= .<project> 
<selection> ::= .<selection> COMMA <project> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<table> ::= .<identifier> 
<project> ::= .<expression> <opt_as_alias> 
<project> ::= .ASTERISK 
<project> ::= .<table> PERIOD ASTERISK 
<project> ::= .<table> SOLIDUS ASTERISK 
<project> ::= .<schema> PERIOD <table> PERIOD ASTERISK 
<project> ::= .<schema> SOLIDUS <table> SOLIDUS ASTERISK 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 40 -----------------------------------------------------------------------
( 23 )

<query_values> ::= VALUES <values_row_commalist>  .<opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= <values_row_commalist>  .COMMA <values_row> 

<opt_order_by_clause> ::= .ORDER BY <ordering_spec_commalist> 
<opt_order_by_clause> ::= . (279)

*** Shift/reduce conflict on "ORDER" with rule 279

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES <values_row_commalist>  .<opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<opt_order_by_clause> ::= . (279)




STATE 41 -----------------------------------------------------------------------
( 23 30 39 41 42 44 56 66 68 84 86 88 96 97 98 99 100 101 114 121 127 130 142 
  144 147 153 161 167 169 182 186 196 197 205 206 209 211 212 215 231 259 262 
  266 267 268 276 288 315 319 324 325 326 353 360 362 363 390 402 403 404 406 
  415 417 419 420 421 424 426 428 )

<expression_factor> ::= MINUS_SIGN  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 42 -----------------------------------------------------------------------
( 23 30 39 41 42 44 56 66 68 84 86 88 96 97 98 99 100 101 114 121 127 130 142 
  144 147 153 161 167 169 182 186 196 197 205 206 209 211 212 215 231 259 262 
  266 267 268 276 288 315 319 324 325 326 353 360 362 363 390 402 403 404 406 
  415 417 419 420 421 424 426 428 )

<expression_factor> ::= PLUS_SIGN  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 44 -----------------------------------------------------------------------
( 23 30 39 41 42 44 56 66 68 84 86 88 96 97 98 99 100 101 114 121 127 130 142 
  144 147 153 161 167 169 182 186 196 197 205 206 209 211 212 215 231 259 262 
  266 267 268 276 288 315 319 324 325 326 353 360 362 363 390 402 403 404 406 
  415 417 419 420 421 424 426 428 )

<case_expression> ::= CASE  .<case_search_when_list> <opt_case_else> END 
<case_expression> ::= CASE  .<expression> <case_simple_when_list> 
                      <opt_case_else> END 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<case_search_when> ::= .WHEN <condition> THEN <expression> 
<case_search_when_list> ::= .<case_search_when> 
<case_search_when_list> ::= .<case_search_when_list> <case_search_when> 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected



STATE 45 -----------------------------------------------------------------------
( 23 30 39 41 42 44 56 66 68 84 86 88 96 97 98 99 100 101 114 121 127 130 142 
  144 147 153 161 167 169 182 186 196 197 205 206 209 211 212 215 231 259 262 
  266 267 268 276 288 315 319 324 325 326 353 360 362 363 390 402 403 404 406 
  415 417 419 420 421 424 426 428 )

<constant> ::= UNSIGNED_INTEGER . (61)
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "REGULAR_IDENTIFIER" between rule 61 and 62

<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "EOF" between rule 61 and 62

'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "STATEMENT_TERMINATOR" between rule 61 and 62

<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "DELIMITED_IDENTIFIER" between rule 61 and 62

<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "CONCAT_OPERATOR" between rule 61 and 62

<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "LESS_THAN_OR_EQUALS_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "GREATER_THAN_OR_EQUALS_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "NOT_EQUALS_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "GREATER_THAN_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "EQUALS_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "LESS_THAN_OPERATOR" between rule 61 and 62

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "SOLIDUS" between rule 61 and 62

<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "MINUS_SIGN" between rule 61 and 62

<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "COMMA" between rule 61 and 62

<values_row_commalist> ::= .<values_row_commalist> COMMA <values_row> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<values_row_commalist> ::= .<values_row_commalist> COMMA <values_row> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "PLUS_SIGN" between rule 61 and 62

<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ASTERISK" between rule 61 and 62

<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "RIGHT_PAREN" between rule 61 and 62

<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "YEARS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "WITH" between rule 61 and 62

<opt_group_by_clause> ::= GROUP BY  .<super_groups_element_list> WITH CUBE 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_exp> ::= .<grouping_exp> 
<grouping_exp> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<opt_group_by_clause> ::= GROUP BY  .<super_groups_element_list> WITH CUBE 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_exp> ::= .<grouping_exp> 
<grouping_exp> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "WHERE" between rule 61 and 62

<update_stmt> ::= UPDATE <target_table> <opt_as_target_table> SET  .
                  <update_assignment_clause> <opt_where_clause> 
<update_assignment_clause> -> .<update_assignment_expression_commalist> 
<update_assignment_expression_commalist> ::= .<update_assignment_expression> 
<update_assignment_expression> ::= <column_ref> EQUALS_OPERATOR  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE <target_table> <opt_as_target_table> SET  .
                  <update_assignment_clause> <opt_where_clause> 
<update_assignment_clause> -> .<update_assignment_expression_commalist> 
<update_assignment_expression_commalist> ::= .<update_assignment_expression> 
<update_assignment_expression> ::= <column_ref> EQUALS_OPERATOR  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "WHEN" between rule 61 and 62

<case_expression> ::= CASE  .<expression> <case_simple_when_list> 
                      <opt_case_else> END 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<case_expression> ::= CASE  .<expression> <case_simple_when_list> 
                      <opt_case_else> END 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "UNION" between rule 61 and 62

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "THEN" between rule 61 and 62

<case_simple_when> ::= WHEN  .<expression> THEN <expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<case_simple_when> ::= WHEN  .<expression> THEN <expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "SECONDS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "RIGHT" between rule 61 and 62

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ORDER" between rule 61 and 62

<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "OR" between rule 61 and 62

<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "OPTIMIZE" between rule 61 and 62

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause>  .
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_order_by_clause> ::= ORDER BY  .<ordering_spec_commalist> 
<ordering_spec_commalist> ::= .<ordering_spec> 
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause>  .
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_order_by_clause> ::= ORDER BY  .<ordering_spec_commalist> 
<ordering_spec_commalist> ::= .<ordering_spec> 
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ON" between rule 61 and 62

<merge statement> ::= MERGE INTO <merge_target_table> USING  .
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_source_table> ::= .<table_ref> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<merge statement> ::= MERGE INTO <merge_target_table> USING  .
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_source_table> ::= .<table_ref> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "NULLS" between rule 61 and 62

<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "NOT" between rule 61 and 62

<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "MONTHS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "MINUTES" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "MICROSECONDS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "LIKE" between rule 61 and 62

<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "LEFT" between rule 61 and 62

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "JOIN" between rule 61 and 62

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "IS" between rule 61 and 62

<nulltest> ::= .<expression> IS NOT NULL 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<nulltest> ::= .<expression> IS NOT NULL 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "INTO" between rule 61 and 62

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "INTERSECT" between rule 61 and 62

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "INNER" between rule 61 and 62

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "IN" between rule 61 and 62

<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "HOURS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "HAVING" between rule 61 and 62

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist>  .<opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_where_clause> ::= WHERE  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist>  .<opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_where_clause> ::= WHERE  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "GROUP" between rule 61 and 62

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist>  .<opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_where_clause> ::= WHERE  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist>  .<opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_where_clause> ::= WHERE  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "FULL" between rule 61 and 62

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_join> 
<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 
<condition> -> .<boolean_expression> 
<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= NOT  .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "FROM" between rule 61 and 62

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "FOR" between rule 61 and 62

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "FETCH" between rule 61 and 62

<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "EXCEPT" between rule 61 and 62

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES  .<values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<values_row_commalist> ::= .<values_row> 
<values_row> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ESCAPE" between rule 61 and 62

<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "END" between rule 61 and 62

<case_expression> ::= CASE <case_search_when_list>  .<opt_case_else> END 
<opt_case_else> ::= ELSE  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<case_expression> ::= CASE <case_search_when_list>  .<opt_case_else> END 
<opt_case_else> ::= ELSE  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ELSE" between rule 61 and 62

<case_expression> ::= CASE  .<case_search_when_list> <opt_case_else> END 
<case_search_when_list> ::= .<case_search_when> 
<case_search_when> ::= WHEN <condition> THEN  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<case_expression> ::= CASE  .<case_search_when_list> <opt_case_else> END 
<case_search_when_list> ::= .<case_search_when> 
<case_search_when> ::= WHEN <condition> THEN  .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "DESC" between rule 61 and 62

<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "DAYS" between rule 61 and 62

<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "CONCAT" between rule 61 and 62

<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "BETWEEN" between rule 61 and 62

<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "ASC" between rule 61 and 62

<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "AS" between rule 61 and 62

<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<project> ::= .<expression> <opt_as_alias> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** Reduce/reduce conflict on "AND" between rule 61 and 62

<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (61)
------------------------------------------------------------------------------
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_term> ::= .<boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_primary> ::= .<simplecomp> 
<simplecomp> -> .<liketest> 
<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 
<expression> ::= .<expression_term> 
<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 
<expression_factor> ::= PLUS_SIGN  .<expression_factor> 
<expression_factor> ::= MINUS_SIGN  .<expression_factor> 
<expression_factor> ::= .<constant> 
<constant> ::= UNSIGNED_INTEGER . (62)

*** 43 Keyword/Identifier Reduce/reduce conflicts detected



STATE 50 -----------------------------------------------------------------------
( 23 30 39 41 42 44 56 66 68 84 86 88 96 97 98 99 100 101 114 121 127 130 142 
  144 147 153 161 167 169 182 186 196 197 205 206 209 211 212 215 231 259 262 
  266 267 268 276 288 315 319 324 325 326 353 360 362 363 390 402 403 404 406 
  415 417 419 420 421 424 426 428 )

<special_register> ::= CURRENT_TRANSFORM_GROUP_FOR_TYPE  .
                       <datatype_path-resolved_user-defined_type_name> 

<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<opt_schema_dot> ::= . (281)




STATE 56 -----------------------------------------------------------------------
( 23 84 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<values_row> ::= LEFT_PAREN  .<expression_commalist> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 66 -----------------------------------------------------------------------
( 29 )

<opt_order_by_clause> ::= ORDER BY  .<ordering_spec_commalist> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<ordering_spec_commalist> ::= .<ordering_spec> 
<ordering_spec_commalist> ::= .<ordering_spec_commalist> COMMA <ordering_spec> 
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 68 -----------------------------------------------------------------------
( 30 39 41 42 44 56 66 68 86 96 97 98 99 100 101 114 130 142 153 161 167 182 
  186 196 205 206 209 215 259 262 266 267 268 276 288 315 319 325 353 390 415 
  417 420 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 74 -----------------------------------------------------------------------
( 34 )

<update_stmt> ::= UPDATE <target_table> <opt_as_target_table> SET  .
                  <update_assignment_clause> <opt_where_clause> 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 
<update_assignment_clause> -> .<update_assignment_expression_commalist> 
<update_assignment_expression> ::= .<column_ref> EQUALS_OPERATOR <expression> 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN <query_exp> 
                                   RIGHT_PAREN 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN 
                                   <expression_commalist> RIGHT_PAREN 
<update_assignment_expression_commalist> ::= .<update_assignment_expression> 
<update_assignment_expression_commalist> ::= .
                                        <update_assignment_expression_commalist> 
                                        COMMA <update_assignment_expression> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 75 -----------------------------------------------------------------------
( 37 )

<target_table> ::= <schema> PERIOD <table> . (390)
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "REGULAR_IDENTIFIER" between rule 390 and 435

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "EOF" between rule 390 and 435

'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "STATEMENT_TERMINATOR" between rule 390 and 435

<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<delete_stmt> 
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "DELIMITED_IDENTIFIER" between rule 390 and 435

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "LEFT_PAREN" between rule 390 and 435

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "WITH" between rule 390 and 435

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "WHERE" between rule 390 and 435

<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<delete_stmt> ::= DELETE FROM  .<target_table> <opt_as_target_table> 
                  <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "VALUES" between rule 390 and 435

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> VALUES 
                  <insert_row_commalist> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "USING" between rule 390 and 435

<merge statement> ::= MERGE INTO  .<merge_target_table> USING 
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_target_table> ::= .<target_table> <opt_as_alias> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<merge statement> ::= MERGE INTO  .<merge_target_table> USING 
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_target_table> ::= .<target_table> <opt_as_alias> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "SET" between rule 390 and 435

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "SELECT" between rule 390 and 435

<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<insert_stmt> ::= INSERT INTO  .<target_table> <opt_target_column_list> 
                  <query_exp_root> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** Reduce/reduce conflict on "AS" between rule 390 and 435

<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (390)
------------------------------------------------------------------------------
<update_stmt> ::= UPDATE  .<target_table> <opt_as_target_table> SET 
                  <update_assignment_clause> <opt_where_clause> 
<target_table> ::= <schema> PERIOD <table> . (435)

*** 7 Keyword/Identifier Reduce/reduce conflicts detected



STATE 76 -----------------------------------------------------------------------
( 38 )

<insert_stmt> ::= INSERT INTO <target_table> <opt_target_column_list>  .VALUES 
                  <insert_row_commalist> 
<insert_stmt> ::= INSERT INTO <target_table> <opt_target_column_list>  .
                  <query_exp_root> 

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "VALUES" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)




STATE 77 -----------------------------------------------------------------------
( 38 398 )

<opt_target_column_list> ::= LEFT_PAREN  .<target_column_list> RIGHT_PAREN 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 
<target_column_list> ::= .<column_ref> 
<target_column_list> ::= .<target_column_list> COMMA <column_ref> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 79 -----------------------------------------------------------------------
( 39 130 )

<column> -> <identifier> . (50)
<schema> ::= <identifier> . (329)
<table> ::= <identifier> . (370)

*** Reduce/reduce conflict on "SOLIDUS" between rule 50 and 370

<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<column_ref> 
<column_ref> ::= .<column> 
<column> -> <identifier> . (50)
------------------------------------------------------------------------------
<project> ::= .<table> SOLIDUS ASTERISK 
<table> ::= <identifier> . (370)

*** Reduce/reduce conflict on "SOLIDUS" between rule 50 and 329

<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= .<column_ref> 
<column_ref> ::= .<column> 
<column> -> <identifier> . (50)
------------------------------------------------------------------------------
<project> ::= .<schema> SOLIDUS <table> SOLIDUS ASTERISK 
<schema> ::= <identifier> . (329)

*** Reduce/reduce conflict on "PERIOD" between rule 329 and 370

<opt_schema_dot> ::= .<schema> PERIOD 
<schema> ::= <identifier> . (329)
------------------------------------------------------------------------------
<project> ::= .<table> PERIOD ASTERISK 
<table> ::= <identifier> . (370)




STATE 82 -----------------------------------------------------------------------
( 39 130 )

<project> ::= ASTERISK . (299)
<project> ::= ASTERISK . (429)

*** Reduce/reduce conflict on "COMMA" between rule 299 and 429

<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (299)
------------------------------------------------------------------------------
<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (429)

*** Reduce/reduce conflict on "INTO" between rule 299 and 429

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (299)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (429)

*** Reduce/reduce conflict on "FROM" between rule 299 and 429

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (299)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= ASTERISK . (429)




STATE 84 -----------------------------------------------------------------------
( 40 )

<values_row_commalist> ::= <values_row_commalist> COMMA  .<values_row> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<values_row> ::= .LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<values_row> ::= .<expression> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 85 -----------------------------------------------------------------------
( 40 )

<query_values> ::= VALUES <values_row_commalist> <opt_order_by_clause>  .
                   <opt_fetch_first_clause> 

<fetch_first_clause> ::= .FETCH FIRST <opt_fetch_first_row_count> <row_or_rows> 
                         ONLY 
<opt_fetch_first_clause> ::= .<fetch_first_clause> 
<opt_fetch_first_clause> ::= . (261)

*** Shift/reduce conflict on "FETCH" with rule 261

<query_combined> ::= <query_exp> <query_combined_operator>  .<query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_term> ::= .<query_values> 
<query_values> ::= VALUES <values_row_commalist> <opt_order_by_clause>  .
                   <opt_fetch_first_clause> 
<opt_fetch_first_clause> ::= . (261)




STATE 86 -----------------------------------------------------------------------
( 43 )

<cast_expression> ::= CAST LEFT_PAREN  .<cast_operand> AS <cast_target> 
                      RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<cast_operand> ::= .<expression> 
<cast_operand> ::= .<implicitly_typed_value_specification> 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<implicitly_typed_value_specification> ::= .<null_specification> 
<null_specification> ::= .NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 88 -----------------------------------------------------------------------
( 44 87 )

<case_search_when> ::= WHEN  .<condition> THEN <expression> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<condition> -> .<boolean_expression> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 96 -----------------------------------------------------------------------
( 54 159 160 )

<expression_term> ::= <expression_term> CONCAT_OPERATOR  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 97 -----------------------------------------------------------------------
( 54 159 160 )

<expression_term> ::= <expression_term> CONCAT  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 98 -----------------------------------------------------------------------
( 54 159 160 )

<expression_term> ::= <expression_term> SOLIDUS  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 99 -----------------------------------------------------------------------
( 54 159 160 )

<expression_term> ::= <expression_term> ASTERISK  .<expression_factor> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 100 ----------------------------------------------------------------------
( 55 69 83 89 104 112 113 140 148 185 195 203 214 217 230 257 264 265 273 279 
  313 317 318 321 327 352 378 386 409 )

<expression> ::= <expression> MINUS_SIGN  .<expression_term> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 101 ----------------------------------------------------------------------
( 55 69 83 89 104 112 113 140 148 185 195 203 214 217 230 257 264 265 273 279 
  313 317 318 321 327 352 378 386 409 )

<expression> ::= <expression> PLUS_SIGN  .<expression_term> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 104 ----------------------------------------------------------------------
( 56 186 )

<expression> ::= <expression>  .PLUS_SIGN <expression_term> 
<expression> ::= <expression>  .MINUS_SIGN <expression_term> 
<expression_commalist> ::= <expression> . (154)
<expression_factor> ::= LEFT_PAREN <expression>  .RIGHT_PAREN 

*** Shift/reduce conflict on "RIGHT_PAREN" with rule 154

<values_row> ::= LEFT_PAREN  .<expression_commalist> RIGHT_PAREN 
<expression_commalist> ::= <expression> . (154)




STATE 105 ----------------------------------------------------------------------
( 57 )

<query_term> ::= LEFT_PAREN <query_exp> RIGHT_PAREN  .<opt_order_by_clause> 
                 <opt_fetch_first_clause> 

<opt_order_by_clause> ::= .ORDER BY <ordering_spec_commalist> 
<opt_order_by_clause> ::= . (279)

*** Shift/reduce conflict on "ORDER" with rule 279

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= LEFT_PAREN <query_exp> RIGHT_PAREN  .<opt_order_by_clause> 
                 <opt_fetch_first_clause> 
<opt_order_by_clause> ::= . (279)




STATE 106 ----------------------------------------------------------------------
( 58 )

<query_combined> ::= <query_exp> <query_combined_operator> <query_term>  .
                     <opt_order_by_clause> <opt_fetch_first_clause> 

<opt_order_by_clause> ::= .ORDER BY <ordering_spec_commalist> 
<opt_order_by_clause> ::= . (279)

*** Shift/reduce conflict on "ORDER" with rule 279

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_combined> 
<query_combined> ::= <query_exp> <query_combined_operator> <query_term>  .
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<opt_order_by_clause> ::= . (279)




STATE 114 ----------------------------------------------------------------------
( 70 )

<argument_list_body> ::= <argument_list_body> COMMA  .<argument> 

<argument> ::= .<expression> 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 121 ----------------------------------------------------------------------
( 73 122 234 )

<opt_where_clause> ::= WHERE  .<condition> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<condition> -> .<boolean_expression> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 123 ----------------------------------------------------------------------
( 74 183 399 )

<update_assignment_expression> ::= LEFT_PAREN  .<target_column_list> 
                                   RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN 
                                   <query_exp> RIGHT_PAREN 
<update_assignment_expression> ::= LEFT_PAREN  .<target_column_list> 
                                   RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN 
                                   <expression_commalist> RIGHT_PAREN 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 
<target_column_list> ::= .<column_ref> 
<target_column_list> ::= .<target_column_list> COMMA <column_ref> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 127 ----------------------------------------------------------------------
( 76 )

<insert_stmt> ::= INSERT INTO <target_table> <opt_target_column_list> VALUES  .
                  <insert_row_commalist> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<insert_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                 RIGHT_PAREN 
<insert_row> ::= .<expression> 
<insert_row_commalist> ::= .<insert_row> 
<insert_row_commalist> ::= .<insert_row_commalist> COMMA <insert_row> 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 130 ----------------------------------------------------------------------
( 78 )

<selection> ::= <selection> COMMA  .<project> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<project> ::= .<expression> <opt_as_alias> 
<project> ::= .ASTERISK 
<project> ::= .<table> PERIOD ASTERISK 
<project> ::= .<schema> PERIOD <table> PERIOD ASTERISK 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<table> ::= .<identifier> 
<project> ::= .<expression> <opt_as_alias> 
<project> ::= .ASTERISK 
<project> ::= .<table> PERIOD ASTERISK 
<project> ::= .<table> SOLIDUS ASTERISK 
<project> ::= .<schema> PERIOD <table> PERIOD ASTERISK 
<project> ::= .<schema> SOLIDUS <table> SOLIDUS ASTERISK 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 133 ----------------------------------------------------------------------
( 80 )

<opt_schema_dot> ::= <schema> PERIOD . (280)
<project> ::= <schema> PERIOD  .<table> PERIOD ASTERISK 
<project> ::= <schema> PERIOD  .<table> PERIOD ASTERISK 

<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<table> ::= .<identifier> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 280

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= <schema> PERIOD . (280)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 280

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= <schema> PERIOD . (280)




STATE 136 ----------------------------------------------------------------------
( 83 )

<project> ::= <expression> <opt_as_alias> . (298)
<project> ::= <expression> <opt_as_alias> . (428)

*** Reduce/reduce conflict on "COMMA" between rule 298 and 428

<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (298)
------------------------------------------------------------------------------
<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (428)

*** Reduce/reduce conflict on "INTO" between rule 298 and 428

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (298)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (428)

*** Reduce/reduce conflict on "FROM" between rule 298 and 428

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (298)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <expression> <opt_as_alias> . (428)




STATE 139 ----------------------------------------------------------------------
( 86 )

<expression_factor> ::= NULL . (170)
<null_specification> ::= NULL . (233)

*** Reduce/reduce conflict on "AS" between rule 170 and 233

<cast_expression> ::= CAST LEFT_PAREN  .<cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<cast_operand> ::= .<expression> 
<expression> ::= .<expression_term> 
<expression_term> ::= .<expression_factor> 
<expression_factor> ::= NULL . (170)
------------------------------------------------------------------------------
<cast_expression> ::= CAST LEFT_PAREN  .<cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<cast_operand> ::= .<implicitly_typed_value_specification> 
<implicitly_typed_value_specification> ::= .<null_specification> 
<null_specification> ::= NULL . (233)




STATE 142 ----------------------------------------------------------------------
( 87 152 )

<opt_case_else> ::= ELSE  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 144 ----------------------------------------------------------------------
( 88 121 147 169 197 211 212 324 362 )

<boolean_primary> ::= NOT  .<simplecomp> 
<boolean_primary> ::= NOT  .LEFT_PAREN <boolean_expression> RIGHT_PAREN 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected



STATE 147 ----------------------------------------------------------------------
( 88 121 147 169 197 211 212 324 362 )

<all_or_any_cond> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_primary> ::= LEFT_PAREN  .<boolean_expression> RIGHT_PAREN 
<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<in_cond> ::= LEFT_PAREN  .<expression_commalist> COMMA <expression> 
              RIGHT_PAREN NOT IN <subquery> 
<in_cond> ::= LEFT_PAREN  .<expression_commalist> COMMA <expression> 
              RIGHT_PAREN IN <subquery> 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_commalist_multiple_elements> ::= . (156)
<expression_commalist_multiple_elements> ::= .<expression_commalist> COMMA 
                                        <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 153 ----------------------------------------------------------------------
( 89 152 )

<case_simple_when> ::= WHEN  .<expression> THEN <expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 161 ----------------------------------------------------------------------
( 103 278 316 354 359 )

<expression_commalist> ::= <expression_commalist> COMMA  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 162 ----------------------------------------------------------------------
( 105 284 )

<query_term> ::= LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause>  .
                 <opt_fetch_first_clause> 

<fetch_first_clause> ::= .FETCH FIRST <opt_fetch_first_row_count> <row_or_rows> 
                         ONLY 
<opt_fetch_first_clause> ::= .<fetch_first_clause> 
<opt_fetch_first_clause> ::= . (261)

*** Shift/reduce conflict on "FETCH" with rule 261

<query_combined> ::= <query_exp> <query_combined_operator>  .<query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_term> ::= LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause>  .
                 <opt_fetch_first_clause> 
<opt_fetch_first_clause> ::= . (261)




STATE 167 ----------------------------------------------------------------------
( 111 )

<ordering_spec_commalist> ::= <ordering_spec_commalist> COMMA  .<ordering_spec> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<ordering_spec> ::= .<expression> <opt_asc_desc> <opt_null_order> 
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 169 ----------------------------------------------------------------------
( 115 )

<merge statement> ::= MERGE INTO <merge_target_table> USING 
                      <merge_source_table> ON  .<merge_on_condition> 
                      <merge operation specification list> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<condition> -> .<boolean_expression> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<merge_on_condition> ::= .<condition> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 180 ----------------------------------------------------------------------
( 120 )

<table_func> ::= TABLE LEFT_PAREN  .<opt_schema_dot> <identifier> LEFT_PAREN 
                 <opt_expression_commalist> RIGHT_PAREN RIGHT_PAREN 
                 <table_correlation> 
<table_query> ::= TABLE LEFT_PAREN  .<query_exp> RIGHT_PAREN 
                  <table_correlation> 

<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_combined> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_term> ::= .<query_values> 
<query_term> ::= .LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause> 
                 <opt_fetch_first_clause> 
<query_values> ::= .VALUES <values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<schema> ::= .<identifier> 
<query_select> ::= .SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<table_func> ::= TABLE LEFT_PAREN  .<opt_schema_dot> <identifier> LEFT_PAREN 
                 <opt_expression_commalist> RIGHT_PAREN RIGHT_PAREN 
                 <table_correlation> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<table_func> ::= TABLE LEFT_PAREN  .<opt_schema_dot> <identifier> LEFT_PAREN 
                 <opt_expression_commalist> RIGHT_PAREN RIGHT_PAREN 
                 <table_correlation> 
<opt_schema_dot> ::= . (281)

*** 2 Keyword/Identifier Shift/shift conflicts detected



STATE 182 ----------------------------------------------------------------------
( 124 )

<update_assignment_expression> ::= <column_ref> EQUALS_OPERATOR  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 183 ----------------------------------------------------------------------
( 126 )

<update_assignment_expression_commalist> ::= 
<update_assignment_expression_commalist>
                                         COMMA  .<update_assignment_expression> 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 
<update_assignment_expression> ::= .<column_ref> EQUALS_OPERATOR <expression> 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN <query_exp> 
                                   RIGHT_PAREN 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN 
                                   <expression_commalist> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 186 ----------------------------------------------------------------------
( 127 231 421 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<insert_row> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                 RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_commalist_multiple_elements> ::= . (156)
<expression_commalist_multiple_elements> ::= .<expression_commalist> COMMA 
                                        <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 187 ----------------------------------------------------------------------
( 128 181 )

<target_column_list> ::= <target_column_list> COMMA  .<column_ref> 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 192 ----------------------------------------------------------------------
( 135 )

<project> ::= <table> PERIOD ASTERISK . (300)
<project> ::= <table> PERIOD ASTERISK . (430)

*** Reduce/reduce conflict on "COMMA" between rule 300 and 430

<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (300)
------------------------------------------------------------------------------
<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (430)

*** Reduce/reduce conflict on "INTO" between rule 300 and 430

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (300)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (430)

*** Reduce/reduce conflict on "FROM" between rule 300 and 430

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (300)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <table> PERIOD ASTERISK . (430)




STATE 194 ----------------------------------------------------------------------
( 138 )

<cast_expression> ::= CAST LEFT_PAREN <cast_operand> AS  .<cast_target> 
                      RIGHT_PAREN 

<cast_target> ::= .<datatype> 
<datatype> ::= .<datatype_predefined> 
<datatype> ::= .<datatype_user_defined_distinct> 
<datatype> ::= .<datatype_path-resolved_user-defined_type_name> 
<datatype> ::= .<datatype_collection_type> 
<datatype_collection_type> ::= .<datatype_array_type> 
<datatype_collection_type> ::= .<datatype_multiset_type> 
<datatype_array_type> ::= .<datatype> ARRAY 
<datatype_array_type> ::= .<datatype> ARRAY <left_bracket_or_trigraph> 
                          UNSIGNED_INTEGER <right_bracket_or_trigraph> 
<datatype_multiset_type> ::= .<datatype> MULTISET 
<datatype_predefined> ::= .<datatype_numerical> 
<datatype_predefined> ::= .<datatype_character> 
<datatype_predefined> ::= .<datatype_character_national> 
<datatype_predefined> ::= .<datatype_binary> 
<datatype_predefined> ::= .<datatype_time> 
<datatype_predefined> ::= .<datatype_date> 
<datatype_date> ::= .DATE 
<datatype_time> ::= .TIME 
<datatype_time> ::= .TIMESTAMP 
<datatype_numerical> -> .<datatype_numerical_exact> 
<datatype_numerical> -> .<datatype_numerical_approximate> 
<datatype_numerical_exact> -> .<datatype_numerical_fixed_precision> 
<datatype_numerical_exact> -> .<datatype_numerical_integer> 
<datatype_numerical_approximate> ::= .FLOAT 
<datatype_numerical_approximate> ::= .FLOAT LEFT_PAREN UNSIGNED_INTEGER 
                                     RIGHT_PAREN 
<datatype_numerical_approximate> ::= .REAL 
<datatype_numerical_approximate> ::= .DOUBLE 
<datatype_numerical_approximate> ::= .DOUBLE PRECISION 
<datatype_numerical_fixed_precision> ::= .NUMERIC 
<datatype_numerical_fixed_precision> ::= .DECIMAL 
<datatype_numerical_fixed_precision> ::= .DEC 
<datatype_numerical_fixed_precision> ::= .NUMERIC LEFT_PAREN UNSIGNED_INTEGER 
                                        RIGHT_PAREN 
<datatype_numerical_fixed_precision> ::= .DECIMAL LEFT_PAREN UNSIGNED_INTEGER 
                                        RIGHT_PAREN 
<datatype_numerical_fixed_precision> ::= .DEC LEFT_PAREN UNSIGNED_INTEGER 
                                        RIGHT_PAREN 
<datatype_numerical_fixed_precision> ::= .NUMERIC LEFT_PAREN UNSIGNED_INTEGER 
                                        COMMA UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_numerical_fixed_precision> ::= .DECIMAL LEFT_PAREN UNSIGNED_INTEGER 
                                        COMMA UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_numerical_fixed_precision> ::= .DEC LEFT_PAREN UNSIGNED_INTEGER COMMA 
                                        UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_numerical_integer> ::= .INTEGER 
<datatype_numerical_integer> ::= .INT 
<datatype_numerical_integer> ::= .SMALLINT 
<datatype_numerical_integer> ::= .BIGINT 
<datatype_binary> ::= .BLOB 
<datatype_binary> ::= .BLOB LEFT_PAREN UNSIGNED_INTEGER 
                      <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_binary> ::= .BINARY LARGE OBJECT 
<datatype_binary> ::= .BINARY LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER 
                      <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_character> ::= .CHARACTER 
<datatype_character> ::= .CHAR 
<datatype_character> ::= .CHARACTER LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_character> ::= .CHAR LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_character> ::= .CHARACTER VARYING LEFT_PAREN UNSIGNED_INTEGER 
                         RIGHT_PAREN 
<datatype_character> ::= .CHAR VARYING LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_character> ::= .VARCHAR LEFT_PAREN UNSIGNED_INTEGER RIGHT_PAREN 
<datatype_character> ::= .CLOB 
<datatype_character> ::= .CLOB LEFT_PAREN UNSIGNED_INTEGER 
                         <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_character> ::= .CHARACTER LARGE OBJECT 
<datatype_character> ::= .CHARACTER LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER 
                         <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_character> ::= .CHAR LARGE OBJECT 
<datatype_character> ::= .CHAR LARGE OBJECT LEFT_PAREN UNSIGNED_INTEGER 
                         <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_character_national> ::= .GRAPHIC 
<datatype_character_national> ::= .GRAPHIC LEFT_PAREN UNSIGNED_INTEGER 
                                  RIGHT_PAREN 
<datatype_character_national> ::= .VARGRAPHIC LEFT_PAREN UNSIGNED_INTEGER 
                                  RIGHT_PAREN 
<datatype_character_national> ::= .DBCLOB 
<datatype_character_national> ::= .DBCLOB LEFT_PAREN UNSIGNED_INTEGER 
                                  <datatype_opt_size_unit> RIGHT_PAREN 
<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<datatype_user_defined_distinct> ::= .<identifier> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<datatype_path-resolved_user-defined_type_name> ::= .<opt_schema_dot> 
                                        <identifier> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 196 ----------------------------------------------------------------------
( 143 )

<case_search_when> ::= WHEN <condition> THEN  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 197 ----------------------------------------------------------------------
( 144 )

<all_or_any_cond> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_primary> ::= NOT LEFT_PAREN  .<boolean_expression> RIGHT_PAREN 
<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<in_cond> ::= LEFT_PAREN  .<expression_commalist> COMMA <expression> 
              RIGHT_PAREN NOT IN <subquery> 
<in_cond> ::= LEFT_PAREN  .<expression_commalist> COMMA <expression> 
              RIGHT_PAREN IN <subquery> 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_commalist_multiple_elements> ::= . (156)
<expression_commalist_multiple_elements> ::= .<expression_commalist> COMMA 
                                        <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 205 ----------------------------------------------------------------------
( 148 203 )

<liketest> ::= <expression> LIKE  .<expression> <opt_escape> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 206 ----------------------------------------------------------------------
( 148 203 )

<intervaltest> ::= <expression> BETWEEN  .<expression> AND <expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 209 ----------------------------------------------------------------------
( 148 203 )

<all_or_any_cond> ::= <expression> <relop>  .ANY <subquery> 
<all_or_any_cond> ::= <expression> <relop>  .SOME <subquery> 
<all_or_any_cond> ::= <expression> <relop>  .ALL <subquery> 
<scalar_comparison> ::= <expression> <relop>  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected



STATE 211 ----------------------------------------------------------------------
( 150 202 258 )

<boolean_expression> ::= <boolean_expression> OR  .<boolean_term> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 212 ----------------------------------------------------------------------
( 151 275 )

<boolean_term> ::= <boolean_term> AND  .<boolean_factor> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 215 ----------------------------------------------------------------------
( 155 )

<function> ::= <opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct>  .
               <opt_expression_commalist> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_expression_commalist> ::= .<expression_commalist> 
<opt_expression_commalist> ::= . (259)
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 231 ----------------------------------------------------------------------
( 184 )

<insert_row_commalist> ::= <insert_row_commalist> COMMA  .<insert_row> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<insert_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                 RIGHT_PAREN 
<insert_row> ::= .<expression> 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 259 ----------------------------------------------------------------------
( 198 )

<value_expr_row> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_commalist_multiple_elements> ::= . (156)
<expression_commalist_multiple_elements> ::= .<expression_commalist> COMMA 
                                        <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 261 ----------------------------------------------------------------------
( 200 )

<all_or_any_cond> ::= LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN  .EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN  .EQUALS_OPERATOR SOME <subquery> 
<value_expr_row> ::= LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN . (403)

*** Shift/reduce conflict on "EQUALS_OPERATOR" with rule 403

<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<value_expr_row> ::= LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN . (403)




STATE 262 ----------------------------------------------------------------------
( 201 )

<expression_commalist> ::= <expression_commalist> COMMA  .<expression> 
<expression_commalist_multiple_elements> ::= <expression_commalist> COMMA  .
                                        <expression> 
<in_cond> ::= LEFT_PAREN <expression_commalist> COMMA  .<expression> 
              RIGHT_PAREN NOT IN <subquery> 
<in_cond> ::= LEFT_PAREN <expression_commalist> COMMA  .<expression> 
              RIGHT_PAREN IN <subquery> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 266 ----------------------------------------------------------------------
( 207 )

<in_cond> ::= <expression> IN LEFT_PAREN  .<expression_commalist> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 267 ----------------------------------------------------------------------
( 208 )

<liketest> ::= <expression> NOT LIKE  .<expression> <opt_escape> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 268 ----------------------------------------------------------------------
( 208 )

<intervaltest> ::= <expression> NOT BETWEEN  .<expression> AND <expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 276 ----------------------------------------------------------------------
( 214 )

<case_simple_when> ::= WHEN <expression> THEN  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 282 ----------------------------------------------------------------------
( 223 )

<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "EOF" between rule 375 and 426

'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
'$accept' ::= .<sql_dml_stmt_list> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "STATEMENT_TERMINATOR" between rule 375 and 426

<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<sql_dml_stmt_list> ::= .<sql_dml_stmt_list> STATEMENT_TERMINATOR 
                        <sql_dml_stmt_xspan> 
<sql_dml_stmt_list> ::= .<sql_dml_stmt_xspan> 
<sql_dml_stmt_xspan> ::= .<sql_dml_stmt> 
<sql_dml_stmt> -> .<query_stmt> 
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "COMMA" between rule 375 and 426

<table_ref_commalist> ::= .<table_ref_commalist> COMMA <table_ref> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_ref_commalist> ::= .<table_ref_commalist> COMMA <table_ref> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "RIGHT_PAREN" between rule 375 and 426

<table_nested> ::= LEFT_PAREN  .<table_ref> RIGHT_PAREN 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_nested> ::= LEFT_PAREN  .<table_ref> RIGHT_PAREN 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "WHERE" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "UNION" between rule 375 and 426

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "RIGHT" between rule 375 and 426

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "ORDER" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "OPTIMIZE" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "ON" between rule 375 and 426

<merge statement> ::= MERGE INTO <merge_target_table> USING  .
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_source_table> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<merge statement> ::= MERGE INTO <merge_target_table> USING  .
                      <merge_source_table> ON <merge_on_condition> 
                      <merge operation specification list> 
<merge_source_table> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "LEFT" between rule 375 and 426

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "JOIN" between rule 375 and 426

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "INTERSECT" between rule 375 and 426

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "INNER" between rule 375 and 426

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "HAVING" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "GROUP" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "FULL" between rule 375 and 426

<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<table_join> ::= .<table_ref> <opt_join_type> JOIN <table_ref> ON <condition> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "FOR" between rule 375 and 426

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "FETCH" between rule 375 and 426

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)

*** Reduce/reduce conflict on "EXCEPT" between rule 375 and 426

<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (375)
------------------------------------------------------------------------------
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM  .<table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<table_ref_commalist> ::= .<table_ref> 
<table_ref> ::= .<table_qualified> 
<table_qualified> ::= <schema> PERIOD <table> <opt_table_correlation> . (426)




STATE 288 ----------------------------------------------------------------------
( 233 )

<expression_commalist> ::= <expression_commalist> COMMA  .<expression> 
<expression_commalist_multiple_elements> ::= <expression_commalist> COMMA  .
                                        <expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 291 ----------------------------------------------------------------------
( 238 )

<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (301)
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (432)

*** Reduce/reduce conflict on "COMMA" between rule 301 and 432

<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (301)
------------------------------------------------------------------------------
<selection> ::= .<selection> COMMA <project> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (432)

*** Reduce/reduce conflict on "INTO" between rule 301 and 432

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (301)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (432)

*** Reduce/reduce conflict on "FROM" between rule 301 and 432

<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (301)
------------------------------------------------------------------------------
<query_select> ::= SELECT <opt_all_distinct>  .<selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<selection> ::= .<project> 
<project> ::= <schema> PERIOD <table> PERIOD ASTERISK . (432)




STATE 313 ----------------------------------------------------------------------
( 262 )

<expression> ::= <expression>  .PLUS_SIGN <expression_term> 
<expression> ::= <expression>  .MINUS_SIGN <expression_term> 
<expression_commalist> ::= <expression_commalist> COMMA <expression> . (155)
<expression_commalist_multiple_elements> ::= <expression_commalist> COMMA 
                                        <expression> . (157)
<in_cond> ::= LEFT_PAREN <expression_commalist> COMMA <expression>  .
              RIGHT_PAREN NOT IN <subquery> 
<in_cond> ::= LEFT_PAREN <expression_commalist> COMMA <expression>  .
              RIGHT_PAREN IN <subquery> 

*** Shift/reduce conflict on "RIGHT_PAREN" with rule 157

<all_or_any_cond> ::= LEFT_PAREN  .<expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<expression_commalist_multiple_elements> ::= <expression_commalist> COMMA 
                                        <expression> . (157)




STATE 315 ----------------------------------------------------------------------
( 265 )

<intervaltest> ::= <expression> BETWEEN <expression> AND  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 319 ----------------------------------------------------------------------
( 269 )

<in_cond> ::= <expression> NOT IN LEFT_PAREN  .<expression_commalist> 
              RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 324 ----------------------------------------------------------------------
( 283 )

<table_join> ::= <table_ref> <opt_join_type> JOIN <table_ref> ON  .<condition> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<condition> -> .<boolean_expression> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 325 ----------------------------------------------------------------------
( 285 )

<table_func> ::= TABLE LEFT_PAREN <opt_schema_dot> <identifier> LEFT_PAREN  .
                 <opt_expression_commalist> RIGHT_PAREN RIGHT_PAREN 
                 <table_correlation> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_expression_commalist> ::= .<expression_commalist> 
<opt_expression_commalist> ::= . (259)
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 326 ----------------------------------------------------------------------
( 287 )

<update_assignment_expression> ::= LEFT_PAREN <target_column_list> 
                                   RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN  .
                                   <query_exp> RIGHT_PAREN 
<update_assignment_expression> ::= LEFT_PAREN <target_column_list> 
                                   RIGHT_PAREN EQUALS_OPERATOR LEFT_PAREN  .
                                   <expression_commalist> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_commalist> ::= .<expression> 
<expression_commalist> ::= .<expression_commalist> COMMA <expression> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_combined> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_term> ::= .<query_values> 
<query_term> ::= .LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause> 
                 <opt_fetch_first_clause> 
<query_values> ::= .VALUES <values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<query_select> ::= .SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 353 ----------------------------------------------------------------------
( 318 )

<intervaltest> ::= <expression> NOT BETWEEN <expression> AND  .<expression> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 360 ----------------------------------------------------------------------
( 326 360 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<query_term> ::= LEFT_PAREN  .<query_exp> RIGHT_PAREN <opt_order_by_clause> 
                 <opt_fetch_first_clause> 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_combined> ::= .<query_exp> <query_combined_operator> <query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_exp> ::= .<query_combined> 
<query_exp> ::= .<query_term> 
<query_exp_root> ::= .<with_clause> <query_exp> 
<query_term> ::= .<query_select> 
<query_term> ::= .<query_values> 
<query_term> ::= .LEFT_PAREN <query_exp> RIGHT_PAREN <opt_order_by_clause> 
                 <opt_fetch_first_clause> 
<query_values> ::= .VALUES <values_row_commalist> <opt_order_by_clause> 
                   <opt_fetch_first_clause> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)
<query_select> ::= .SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "SELECT" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "VALUES" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** 23 Keyword/Identifier Shift/shift conflicts detected



STATE 361 ----------------------------------------------------------------------
( 328 )

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause>  .
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 

<opt_order_by_clause> ::= .ORDER BY <ordering_spec_commalist> 
<opt_order_by_clause> ::= . (279)

*** Shift/reduce conflict on "ORDER" with rule 279

<query_stmt> ::= .<query_exp_root> <opt_order_by_clause> 
                 <opt_updatability_clause> 
<query_exp_root> ::= <with_clause>  .<query_exp> 
<query_exp> ::= .<query_term> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause>  .
                   <opt_order_by_clause> <opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_order_by_clause> ::= . (279)




STATE 362 ----------------------------------------------------------------------
( 328 )

<opt_having_clause> ::= HAVING  .<condition> 

<all_or_any_cond> ::= .<expression> <relop> ANY <subquery> 
<all_or_any_cond> ::= .<expression> <relop> SOME <subquery> 
<all_or_any_cond> ::= .<expression> <relop> ALL <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR ANY <subquery> 
<all_or_any_cond> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                      RIGHT_PAREN EQUALS_OPERATOR SOME <subquery> 
<boolean_expression> ::= .<boolean_term> 
<boolean_expression> ::= .<boolean_expression> OR <boolean_term> 
<boolean_term> ::= .<boolean_factor> 
<boolean_term> ::= .<boolean_term> AND <boolean_factor> 
<boolean_factor> ::= .<boolean_primary> 
<boolean_factor> ::= .<boolean_primary> IS <boolean_values> 
<boolean_factor> ::= .<boolean_primary> IS NOT <boolean_values> 
<boolean_primary> ::= .<simplecomp> 
<boolean_primary> ::= .NOT <simplecomp> 
<boolean_primary> ::= .LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<boolean_primary> ::= .NOT LEFT_PAREN <boolean_expression> RIGHT_PAREN 
<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<condition> -> .<boolean_expression> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<exists> ::= .EXISTS LEFT_PAREN <query_exp> RIGHT_PAREN 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<in_cond> ::= .<expression> NOT IN LEFT_PAREN <expression_commalist> 
              RIGHT_PAREN 
<in_cond> ::= .<expression> IN LEFT_PAREN <expression_commalist> RIGHT_PAREN 
<in_cond> ::= .<expression> NOT IN <subquery> 
<in_cond> ::= .<expression> IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              NOT IN <subquery> 
<in_cond> ::= .LEFT_PAREN <expression_commalist> COMMA <expression> RIGHT_PAREN 
              IN <subquery> 
<intervaltest> ::= .<expression> NOT BETWEEN <expression> AND <expression> 
<intervaltest> ::= .<expression> BETWEEN <expression> AND <expression> 
<liketest> ::= .<expression> NOT LIKE <expression> <opt_escape> 
<liketest> ::= .<expression> LIKE <expression> <opt_escape> 
<nulltest> ::= .<expression> IS NOT NULL 
<nulltest> ::= .<expression> IS NULL 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<row_comparison> ::= .<value_expr_row> <relop> <value_expr_row> 
<scalar_comparison> ::= .<expression> <relop> <expression> 
<schema> ::= .<identifier> 
<simplecomp> -> .<scalar_comparison> 
<simplecomp> -> .<row_comparison> 
<simplecomp> -> .<intervaltest> 
<simplecomp> -> .<nulltest> 
<simplecomp> -> .<liketest> 
<simplecomp> -> .<in_cond> 
<simplecomp> -> .<exists> 
<simplecomp> -> .<all_or_any_cond> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<value_expr_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                     RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 363 ----------------------------------------------------------------------
( 329 )

<opt_group_by_clause> ::= GROUP BY  .<grouping_spec_list> 
<opt_group_by_clause> ::= GROUP BY  .<super_groups_element_list> WITH CUBE 
<opt_group_by_clause> ::= GROUP BY  .<super_groups_element_list> WITH ROLLUP 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets> ::= .GROUPING SETS LEFT_PAREN <grouping_sets_element_list> 
                    RIGHT_PAREN 
<grouping_spec> -> .<grouping> 
<grouping_spec> -> .<grouping_sets> 
<grouping_spec_list> ::= .<grouping_spec> 
<grouping_spec_list> ::= .<grouping_spec_list> COMMA <grouping_spec> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element> ::= .LEFT_PAREN <super_groups_element_exp_list> 
                           RIGHT_PAREN 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element_list> ::= .<super_groups_element_list> COMMA 
                                <super_groups_element> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected



STATE 382 ----------------------------------------------------------------------
( 361 )

<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause>  .<opt_fetch_first_clause> 
                   <opt_optimize_clause> 

<fetch_first_clause> ::= .FETCH FIRST <opt_fetch_first_row_count> <row_or_rows> 
                         ONLY 
<opt_fetch_first_clause> ::= .<fetch_first_clause> 
<opt_fetch_first_clause> ::= . (261)

*** Shift/reduce conflict on "FETCH" with rule 261

<query_combined> ::= <query_exp> <query_combined_operator>  .<query_term> 
                     <opt_order_by_clause> <opt_fetch_first_clause> 
<query_term> ::= .<query_select> 
<query_select> ::= SELECT <opt_all_distinct> <selection> <opt_into_clause> 
                   FROM <table_ref_commalist> <opt_where_clause> 
                   <opt_group_by_clause> <opt_having_clause> 
                   <opt_order_by_clause>  .<opt_fetch_first_clause> 
                   <opt_optimize_clause> 
<opt_fetch_first_clause> ::= . (261)




STATE 389 ----------------------------------------------------------------------
( 363 )

<grouping> -> <grouping_exp> . (183)
<super_groups_element_exp> ::= <grouping_exp> . (363)

*** Reduce/reduce conflict on "COMMA" between rule 183 and 363

<grouping_spec_list> ::= .<grouping_spec_list> COMMA <grouping_spec> 
<grouping_spec_list> ::= .<grouping_spec> 
<grouping_spec> -> .<grouping> 
<grouping> -> <grouping_exp> . (183)
------------------------------------------------------------------------------
<super_groups_element_list> ::= .<super_groups_element_list> COMMA 
                                <super_groups_element> 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_exp> ::= <grouping_exp> . (363)




STATE 390 ----------------------------------------------------------------------
( 363 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<super_groups> ::= LEFT_PAREN  .RIGHT_PAREN 
<super_groups_element> ::= LEFT_PAREN  .<super_groups_element_exp_list> 
                           RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element_exp_list> ::= .<super_groups_element_exp> 
<super_groups_element_exp_list> ::= .<super_groups_element_exp_list> COMMA 
                                    <super_groups_element_exp> 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 399 ----------------------------------------------------------------------
( 380 )

<merge update specification> ::= UPDATE SET  .<update_assignment_clause> 

<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<schema> ::= .<identifier> 
<update_assignment_clause> -> .<update_assignment_expression_commalist> 
<update_assignment_expression> ::= .<column_ref> EQUALS_OPERATOR <expression> 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN <query_exp> 
                                   RIGHT_PAREN 
<update_assignment_expression> ::= .LEFT_PAREN <target_column_list> RIGHT_PAREN 
                                   EQUALS_OPERATOR LEFT_PAREN 
                                   <expression_commalist> RIGHT_PAREN 
<update_assignment_expression_commalist> ::= .<update_assignment_expression> 
<update_assignment_expression_commalist> ::= .
                                        <update_assignment_expression_commalist> 
                                        COMMA <update_assignment_expression> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)




STATE 402 ----------------------------------------------------------------------
( 383 )

<grouping_spec_list> ::= <grouping_spec_list> COMMA  .<grouping_spec> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets> ::= .GROUPING SETS LEFT_PAREN <grouping_sets_element_list> 
                    RIGHT_PAREN 
<grouping_spec> -> .<grouping> 
<grouping_spec> -> .<grouping_sets> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected



STATE 403 ----------------------------------------------------------------------
( 384 )

<super_groups> ::= ROLLUP LEFT_PAREN  .<super_groups_element_list> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element> ::= .LEFT_PAREN <super_groups_element_exp_list> 
                           RIGHT_PAREN 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element_list> ::= .<super_groups_element_list> COMMA 
                                <super_groups_element> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 404 ----------------------------------------------------------------------
( 385 )

<super_groups> ::= CUBE LEFT_PAREN  .<super_groups_element_list> RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element> ::= .LEFT_PAREN <super_groups_element_exp_list> 
                           RIGHT_PAREN 
<super_groups_element> ::= .<super_groups_element_exp> 
<super_groups_element_list> ::= .<super_groups_element> 
<super_groups_element_list> ::= .<super_groups_element_list> COMMA 
                                <super_groups_element> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 406 ----------------------------------------------------------------------
( 388 416 418 )

<super_groups_element_list> ::= <super_groups_element_list> COMMA  .
                                <super_groups_element> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element> ::= .LEFT_PAREN <super_groups_element_exp_list> 
                           RIGHT_PAREN 
<super_groups_element> ::= .<super_groups_element_exp> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 409 ----------------------------------------------------------------------
( 390 417 424 )

<expression> ::= <expression>  .PLUS_SIGN <expression_term> 
<expression> ::= <expression>  .MINUS_SIGN <expression_term> 
<expression_factor> ::= LEFT_PAREN <expression>  .RIGHT_PAREN 
<grouping_exp> ::= <expression> . (185)

*** Shift/reduce conflict on "RIGHT_PAREN" with rule 185

<super_groups_element> ::= LEFT_PAREN  .<super_groups_element_exp_list> 
                           RIGHT_PAREN 
<super_groups_element_exp_list> ::= .<super_groups_element_exp> 
<super_groups_element_exp> ::= .<grouping_exp> 
<grouping_exp> ::= <expression> . (185)




STATE 415 ----------------------------------------------------------------------
( 402 424 428 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<super_groups> ::= LEFT_PAREN  .RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 417 ----------------------------------------------------------------------
( 403 404 406 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<super_groups_element> ::= LEFT_PAREN  .<super_groups_element_exp_list> 
                           RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 
<super_groups_element_exp_list> ::= .<super_groups_element_exp> 
<super_groups_element_exp_list> ::= .<super_groups_element_exp_list> COMMA 
                                    <super_groups_element_exp> 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 21 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 419 ----------------------------------------------------------------------
( 405 )

<grouping_sets> ::= GROUPING SETS LEFT_PAREN  .<grouping_sets_element_list> 
                    RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets_element_list> ::= .<grouping_sets_element> 
<grouping_sets_element_list> ::= .<grouping_sets_element_list> COMMA 
                                 <grouping_sets_element> 
<grouping_sets_element> ::= .LEFT_PAREN <grouping_sets_element_exp_list> 
                            RIGHT_PAREN 
<grouping_sets_element> ::= .<grouping_sets_element_exp> 
<grouping_sets_element_exp> ::= .<grouping> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 420 ----------------------------------------------------------------------
( 408 )

<super_groups_element_exp_list> ::= <super_groups_element_exp_list> COMMA  .
                                    <super_groups_element_exp> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping_exp> ::= .<expression> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups_element_exp> ::= .<grouping_exp> 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 421 ----------------------------------------------------------------------
( 413 )

<merge insert specification> ::= INSERT <opt_target_column_list> VALUES  .
                                 <insert_row> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<insert_row> ::= .LEFT_PAREN <expression_commalist_multiple_elements> 
                 RIGHT_PAREN 
<insert_row> ::= .<expression> 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 20 Keyword/Identifier Shift/shift conflicts detected



STATE 424 ----------------------------------------------------------------------
( 419 426 )

<expression_factor> ::= LEFT_PAREN  .<expression> RIGHT_PAREN 
<grouping_sets_element> ::= LEFT_PAREN  .<grouping_sets_element_exp_list> 
                            RIGHT_PAREN 
<subquery> ::= LEFT_PAREN  .<query_exp_root> RIGHT_PAREN 
<super_groups> ::= LEFT_PAREN  .RIGHT_PAREN 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets_element_exp> ::= .<grouping> 
<grouping_sets_element_exp_list> ::= .<grouping_sets_element_exp> 
<grouping_sets_element_exp_list> ::= .<grouping_sets_element_exp_list> COMMA 
                                     <grouping_sets_element_exp> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<query_exp_root> ::= .<with_clause> <query_exp> 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 
<with_clause> ::= .WITH <with_table_spec_list> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "LEFT_PAREN" with rule 409

<query_exp_root> ::= .<with_clause> <query_exp> 
<with_clause> ::= . (409)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 23 Keyword/Identifier Shift/shift conflicts detected
*** 2 Keyword/Identifier Shift/reduce conflicts detected



STATE 426 ----------------------------------------------------------------------
( 423 )

<grouping_sets_element_list> ::= <grouping_sets_element_list> COMMA  .
                                 <grouping_sets_element> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets_element> ::= .LEFT_PAREN <grouping_sets_element_exp_list> 
                            RIGHT_PAREN 
<grouping_sets_element> ::= .<grouping_sets_element_exp> 
<grouping_sets_element_exp> ::= .<grouping> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



STATE 428 ----------------------------------------------------------------------
( 427 )

<grouping_sets_element_exp_list> ::= <grouping_sets_element_exp_list> COMMA  .
                                     <grouping_sets_element_exp> 

<case_expression> ::= .CASE <case_search_when_list> <opt_case_else> END 
<case_expression> ::= .CASE <expression> <case_simple_when_list> 
                      <opt_case_else> END 
<cast_expression> ::= .CAST LEFT_PAREN <cast_operand> AS <cast_target> 
                      RIGHT_PAREN 
<column> -> .<identifier> 
<column_ref> ::= .<column> 
<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<constant> ::= .CHAR_STRING_LITERAL 
<constant> ::= .G CHAR_STRING_LITERAL 
<constant> ::= .N CHAR_STRING_LITERAL 
<constant> ::= .HEX_STRING_LITERAL 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .UNSIGNED_INTEGER 
<constant> ::= .EXACT_NUMERIC_LITERAL 
<constant> ::= .APPROXIMATE_NUMERIC_LITERAL 
<expression> ::= .<expression> PLUS_SIGN <expression_term> 
<expression> ::= .<expression> MINUS_SIGN <expression_term> 
<expression> ::= .<expression_term> 
<expression_factor> ::= .LEFT_PAREN <expression> RIGHT_PAREN 
<expression_factor> ::= .<subquery> 
<expression_factor> ::= .<special_register> 
<expression_factor> ::= .<column_ref> 
<expression_factor> ::= .<constant> 
<expression_factor> ::= .<parameter> 
<expression_factor> ::= .<function> 
<expression_factor> ::= .<case_expression> 
<expression_factor> ::= .<cast_expression> 
<expression_factor> ::= .PLUS_SIGN <expression_factor> 
<expression_factor> ::= .MINUS_SIGN <expression_factor> 
<expression_factor> ::= .DEFAULT 
<expression_factor> ::= .NULL 
<expression_term> ::= .<expression_term> ASTERISK <expression_factor> 
<expression_term> ::= .<expression_term> SOLIDUS <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT <expression_factor> 
<expression_term> ::= .<expression_term> CONCAT_OPERATOR <expression_factor> 
<expression_term> ::= .<expression_term> <duration> 
<expression_term> ::= .<expression_factor> 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN ASTERISK RIGHT_PAREN 
<function> ::= .<opt_schema_dot> <identifier> LEFT_PAREN <opt_all_distinct> 
               <opt_expression_commalist> RIGHT_PAREN 
<grouping> -> .<grouping_exp> 
<grouping> -> .<super_groups> 
<grouping_exp> ::= .<expression> 
<grouping_sets_element_exp> ::= .<grouping> 
<identifier> ::= .REGULAR_IDENTIFIER 
<identifier> ::= .DELIMITED_IDENTIFIER 
<opt_schema_dot> ::= .<schema> PERIOD 
<opt_schema_dot> ::= . (281)
<parameter> ::= .HOSTVARIABLE 
<parameter> ::= .PARAMETER_MARKER 
<schema> ::= .<identifier> 
<special_register> ::= .CURRENT_DATE 
<special_register> ::= .CURRENT_TIME 
<special_register> ::= .CURRENT_TIMESTAMP 
<special_register> ::= .CURRENT_TIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .LOCALTIME 
<special_register> ::= .LOCALTIME LEFT_PAREN <time precision> RIGHT_PAREN 
<special_register> ::= .LOCALTIMESTAMP 
<special_register> ::= .LOCALTIMESTAMP LEFT_PAREN <timestamp precision> 
                       RIGHT_PAREN 
<special_register> ::= .CURRENT_DEFAULT_TRANSFORM_GROUP 
<special_register> ::= .CURRENT_PATH 
<special_register> ::= .CURRENT_ROLE 
<special_register> ::= .CURRENT_TRANSFORM_GROUP_FOR_TYPE 
                       <datatype_path-resolved_user-defined_type_name> 
<special_register> ::= .CURRENT_USER 
<special_register> ::= .SESSION_USER 
<special_register> ::= .SYSTEM_USER 
<special_register> ::= .USER 
<special_register> ::= .VALUE 
<subquery> ::= .LEFT_PAREN <query_exp_root> RIGHT_PAREN 
<super_groups> ::= .CUBE LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .ROLLUP LEFT_PAREN <super_groups_element_list> RIGHT_PAREN 
<super_groups> ::= .LEFT_PAREN RIGHT_PAREN 

*** Shift/reduce conflict on "DELIMITED_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** Shift/reduce conflict on "REGULAR_IDENTIFIER" with rule 281

<column_ref> ::= .<opt_schema_dot> <table> PERIOD <column> 
<opt_schema_dot> ::= . (281)

*** 22 Keyword/Identifier Shift/shift conflicts detected



C:\Users\dario.foresti\git\asup_0_5_3\org.asup.db.syntax.ibmi\src\org\asup\db\syntax\ibmi\parser\dml\sqlIBMiQueryParser.lpg is not LALR(1).


Number of Terminals: 779
Number of Nonterminals: 178
Number of Productions: 437
Number of Items: 1349
Number of Scopes: 56
Number of States: 428
Number of Shift actions: 57570
Number of Goto actions: 612
Number of Shift/Reduce actions: 23566
Number of Goto/Reduce actions: 1066
Number of Reduce actions: 38785
Number of Shift-Reduce conflicts: 187
Number of Reduce-Reduce conflicts: 121
Number of Keyword/Identifier Shift conflicts: 1467
Number of Keyword/Identifier Shift-Reduce conflicts: 62
Number of Keyword/Identifier Reduce-Reduce conflicts: 114

Number of Shift entries saved by default: 257
Number of Shift/Reduce entries saved by default: 440
Number of conflict entries saved by default: 48834

Number of entries in base Action Table: 2106
Additional space required for compaction of Action Table: 3.2%

Number of entries in Shift Check Table: 5476
Additional space required for compaction of Shift Check Table: 13.9%

Number of unique terminal states: 339
Number of Shift actions saved by merging: 16177
Number of Conflict points saved by merging: 5274
Number of Reduce actions saved by merging: 2239
Number of Reduce saved by default: 14560

Number of entries in Terminal Action Table: 11381
Additional space required for compaction of Terminal Table: 6.1%

Actions in Compressed Tables:
     Number of Shifts: 339
     Number of Shift/Reduces: 4496
     Number of conflict points: 6187
     Number of Gotos: 612
     Number of Goto/Reduces: 1066
     Number of Reduces: 20
     Number of Defaults: 119

Parsing Tables storage:
    Storage required for BASE_CHECK: 5224 Bytes
    Storage required for BASE_ACTION: 6246 Bytes
    Storage required for TERM_CHECK: 24240 Bytes
    Storage required for TERM_ACTION: 24160 Bytes
    Storage required for DEFAULT_REDUCE: 680 Bytes
    Storage required for SHIFT_STATE: 680 Bytes
    Storage required for SHIFT_CHECK: 12592 Bytes
    Storage required for DEFAULT_SHIFT: 1560 Bytes

Error maps storage:
    Storage required for ACTION_SYMBOLS_BASE map: 858 Bytes
    Storage required for ACTION_SYMBOLS_RANGE map: 9506 Bytes
    Storage required for NACTION_SYMBOLS_BASE map: 858 Bytes
    Storage required for NACTION_SYMBOLS_RANGE map: 324 Bytes
    Storage required for TERMINAL_INDEX map: 1560 Bytes
    Storage required for NON_TERMINAL_INDEX map: 360 Bytes

    Storage required for SCOPE_PREFIX map: 112 Bytes
    Storage required for SCOPE_SUFFIX map: 112 Bytes
    Storage required for SCOPE_LHS_SYMBOL map: 112 Bytes
    Storage required for SCOPE_LOOK_AHEAD map: 112 Bytes
    Storage required for SCOPE_STATE_SET map: 112 Bytes
    Storage required for SCOPE_RIGHT_SIDE map: 576 Bytes
    Storage required for SCOPE_STATE map: 322 Bytes
    Storage required for IN_SYMB map: 858 Bytes

    Number of names: 865
    Number of characters in name: 7411
