package com.github.suzuki0keiichi.php_parser


object Tokens {
  /**
   * <a href="language.oop5.abstract.php" class="xref">クラスの抽象化</a> (PHP 5.0.0 以降で使用可能)
   * 構文: abstract
   */
  val T_ABSTRACT = "abstract"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: &amp;=
   */
  val T_AND_EQUAL = "&="

  /**
   * <span class="function"><a href="function.array.php" class="function">array()</a></span>, <a href="language.types.array.php#language.types.array.syntax" class="link">array 構文</a>
   * 構文: array()
   */
  val T_ARRAY = "array"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (array)
   */
  val T_ARRAY_CAST = "\\(array\\)"

  /**
   * <a href="control-structures.foreach.php" class="link">foreach</a>
   * 構文: as
   */
  val T_AS = "as"

  /*
   * ASCII 32以下の全ての文字。\t (0x09), \n (0x0a) , \r (0x0d) は除く
   */
  // val T_BAD_CHARACTER = ""

  /**
   * <a href="language.operators.logical.php" class="link">論理演算子</a>
   * 構文: &amp;&amp;
   */
  val T_BOOLEAN_AND = "&&"

  /**
   * <a href="language.operators.logical.php" class="link">論理演算子</a>
   * 構文: ||
   */
  val T_BOOLEAN_OR = "||"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (bool) or (boolean)
   */
  val T_BOOL_CAST = "\\((bool|boolean)\\)"

  /**
   * <a href="control-structures.break.php" class="link">break</a>
   * 構文: break;
   */
  val T_BREAK = "break"

  /**
   * <a href="language.types.callable.php" class="link">callable</a>
   * 構文: callable
   */
  val T_CALLABLE = "callable"

  /**
   * <a href="control-structures.switch.php" class="link">switch</a>
   * 構文: case
   */
  val T_CASE = "case"

  /**
   * <a href="language.exceptions.php" class="xref">例外(exceptions)</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: catch
   */
  val T_CATCH = "catch"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * 構文: class
   */
  val T_CLASS = "class"

  /**
   * <a href="language.constants.predefined.php" class="link">マジック定数</a>
   * (PHP 4.3.0 以降で使用可能)
   * 構文: __CLASS__
   */
  val T_CLASS_C = "__CLASS__"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: clone
   */
  val T_CLONE = "clone"

  /**
   * <a href="language.basic-syntax.phpmode.php" class="link">HTML からの脱出</a>
   * 構文: ?&gt; or %&gt;
   */
  val T_CLOSE_TAG = "(?|%)>"

  /**
   * <a href="language.basic-syntax.comments.php" class="link">コメント</a>
   * 構文: // or #, and /* */ in PHP 5
   */
  val T_COMMENT = "(//|#)"
  val T_COMMENT_BEGIN = "/*"
  val T_COMMENT_END = "*/"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: .=
   */
  val T_CONCAT_EQUAL = "\\.="

  /**
   * <a href="language.constants.php" class="link">クラス定数</a>
   * 構文: const
   */
  val T_CONST = "const"

  /**
   * <a href="language.types.string.php#language.types.string.syntax" class="link">文字列構文</a>
   * 構文: &quot;foo&quot or &#039;bar&#039;
   */
  val T_CONSTANT_ENCAPSED_STRING1 = "\""
  val T_CONSTANT_ENCAPSED_STRING2 = "'"

  /**
   * <a href="control-structures.continue.php" class="link">continue</a>
   * 構文: continue
   */
  val T_CONTINUE = "continue"

  /**
   * <a href="language.types.string.php#language.types.string.parsing.complex" class="link">複雑な構文</a>
   * 構文: {$
   */
  val T_CURLY_OPEN = "{$"
  val T_CURLY_CLOSE = "}"

  /**
   * <a href="language.operators.increment.php" class="link">可算/減算演算子</a>
   * 構文: --
   */
  val T_DEC = "--"

  /**
   * <a href="control-structures.declare.php" class="link">declare</a>
   * 構文: declare
   */
  val T_DECLARE = "declare"

  /**
   * <a href="control-structures.switch.php" class="link">switch</a>
   * 構文: default
   */
  val T_DEFAULT = "default"

  /**
   * <a href="language.constants.predefined.php" class="link">マジック定数</a>
   * (PHP 5.3.0 以降で使用可能)</td>
   * 構文: __DIR__
   */
  val T_DIR = "__DIR__"


  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: /=
   */
  val T_DIV_EQUAL = "/="

  /**
   * <a href="language.types.float.php" class="link">浮動小数点数</a>
   * 構文: 0.12, etc
   */
  val T_DNUMBER = "."

  /**
   * <a href="language.basic-syntax.comments.php" class="link">PHPDoc 形式のコメント</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: /** */
   */
  val T_DOC_COMMENT_BEGIN = "/**"
  val T_DOC_COMMENT_END = "*/"

  /**
   * <a href="control-structures.do.while.php" class="link">do..while</a>
   * 構文: do
   */
  val T_DO = "do"

  /**
   * <a href="language.types.string.php#language.types.string.parsing.complex" class="link">complex variable parsed syntax</a>
   * 構文: ${
   */
  val T_DOLLAR_OPEN_CURLY_BRACES = "${"

  /**
   * <a href="language.types.array.php#language.types.array.syntax" class="link">array 構文</a>
   * 構文: =&gt;
   */
  val T_DOUBLE_ARROW = "=>"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (real), (double) or (float)
   */
  val T_DOUBLE_CAST = "\\((real|double|float)\\)"

  /**
   * 下の <strong><code>T_PAAMAYIM_NEKUDOTAYIM</code></strong> を参照ください。
   * 構文: ::
   */
  val T_DOUBLE_COLON = "::"

  /**
   * <span class="function"><a href="function.echo.php" class="function">echo</a></span>
   * 構文: echo
   */
  val T_ECHO = "echo"

  /**
   * <a href="control-structures.else.php" class="link">else</a>
   * 構文: else
   */
  val T_ELSE = "else"

  /**
   * <a href="control-structures.elseif.php" class="link">elseif</a>
   * 構文: elseif
   */
  val T_ELSEIF = "elseif"

  /**
   * <span class="function"><a href="function.empty.php" class="function">empty()</a></span>
   * 構文: empty
   */
  val T_EMPTY = "empty"

  /**
   * <a href="language.types.string.php#language.types.string.parsing" class="link">文字列のパース</a>
   * 構文: &quot;$a&quot;
   */
  val T_ENCAPSED_AND_WHITESPACE = "$"

  /**
   * <a href="control-structures.declare.php" class="link">declare</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: enddeclare
   */
  val T_ENDDECLARE = "enddeclare"

  /**
   * <a href="control-structures.for.php" class="link">for</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: endfor
   */
  val T_ENDFOR = "endfor"

  /**
   * <a href="control-structures.foreach.php" class="link">foreach</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: endforeach
   */
  val T_ENDFOREACH = "endforeach"

  /**
   * <a href="control-structures.if.php" class="link">if</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: endif
   */
  val T_ENDIF = "endif"

  /**
   * <a href="control-structures.switch.php" class="link">switch</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: endswitch
   */
  val T_ENDSWITCH = "endswitch"

  /**
   * <a href="control-structures.while.php" class="link">while</a>, <a href="control-structures.alternative-syntax.php" class="link">別の構文</a>
   * 構文: endwhile
   */
  val T_ENDWHILE = "endwhile"

  /*
   * <a href="language.types.string.php#language.types.string.syntax.heredoc" class="link">heredoc 構文</a>
   * 構文: &nbsp;
   */
  // val T_END_HEREDOC = ""

  /**
   * <span class="function"><a href="function.eval.php" class="function">eval()</a></span>
   * 構文: eval()
   */
  val T_EVAL = "eval"

  /**
   * <span class="function"><a href="function.exit.php" class="function">exit()</a></span>,  <span class="function"><a href="function.die.php" class="function">die()</a></span>
   * 構文: exit or die
   */
  val T_EXIT = "(exit|die)"

  /**
   * <a href="language.oop5.basic.php#language.oop5.basic.extends" class="link">extends</a>, <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * 構文: extends
   */
  val T_EXTENDS = "extends"

  /**
   * <a href="language.constants.predefined.php" class="link">定数</a>
   * 構文: __FILE__
   */
  val T_FILE = "__FILE__"

  /**
   * <a href="language.oop5.final.php" class="xref">finalキーワード</a> (PHP 5.0.0 以降で使用可能)
   * 構文: final
   */
  val T_FINAL = "final"

  /**
   * <a href="language.exceptions.php" class="xref">例外(exceptions)</a> (PHP 5.5.0 以降で使用可能)
   * 構文: finally
   */
  val T_FINALLY = "finally"

  /**
   * <a href="control-structures.for.php" class="link">for</a>
   * 構文: for
   */
  val T_FOR = "for"

  /**
   * <a href="control-structures.foreach.php" class="link">foreach</a>
   * 構文: foreach
   */
  val T_FOREACH = "foreach"

  /**
   * <a href="language.functions.php" class="link">関数</a>
   * 構文: function or cfunction
   */
  val T_FUNCTION = "(function|cfunction)"

  /**
   * <a href="language.constants.predefined.php" class="link">定数</a>
   * (PHP 4.3.0 以降で使用可能)
   * 構文: __FUNCTION__
   */
  val T_FUNC_C = "__FUNCTION__"

  /**
   * <a href="language.variables.scope.php" class="link">変数のスコープ</a>
   * 構文: global
   */
  val T_GLOBAL = "global"

  /**
   * <a href="control-structures.goto.php" class="link">(PHP 5.3.0 以降で使用可能)</a>
   * 構文: goto
   */
  val T_GOTO = "goto"

  /**
   * <a href="function.halt-compiler.php" class="xref">__halt_compiler</a>
   * (PHP 5.1.0 以降で使用可能)
   * 構文: __halt_compiler()
   */
  val T_HALT_COMPILER = "__halt_compiler"

  /**
   * <a href="control-structures.if.php" class="link">if</a>
   * 構文: if
   */
  val T_IF = "if"

  /**
   * <a href="language.oop5.interfaces.php" class="xref">オブジェクト インターフェイス</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: implements
   */
  val T_IMPLEMENTS = "implements"

  /**
   * <a href="language.operators.increment.php" class="link">加算/減算演算子
   * </a>
   * 構文: ++
   */
  val T_INC = "++"

  /**
   * <span class="function">
   * <a href="function.include.php" class="function">include</a>
   * </span>
   * 構文: include()
   */
  val T_INCLUDE = "include"

  /**
   * <span class="function">
   * <a href="function.include-once.php" class="function">include_once</a>
   * </span>
   * 構文: include_once()
   */
  val T_INCLUDE_ONCE = "include_once"

  /*
   * <a href="language.basic-syntax.phpmode.php" class="link">PHP の外部のテキスト</a>
   */
  // val T_INLINE_HTML = ""

  /**
   * <a href="language.operators.type.php" class="link">型演算子</a>
   * (PHP 5.0.0 以降で使用可能)
   * instanceof
   */
  val T_INSTANCEOF = "instanceof"

  /**
   * <a href="language.oop5.traits.php" class="xref">トレイト</a>
   * (PHP 5.4.0 以降で使用可能)
   * 構文: insteadof
   */
  val T_INSTEADOF = "insteadof"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (int) or (integer)
   */
  val T_INT_CAST = "\\((int|integer)\\)"

  /**
   * <a href="language.oop5.interfaces.php" class="xref">オブジェクト インターフェイス</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: interface
   */
  val T_INTERFACE = "interface"

  /**
   * <span class="function">
   * <a href="function.isset.php" class="function">isset()</a>
   * </span>
   * 構文: isset()
   */
  val T_ISSET = "isset"

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: ==
   */
  val T_IS_EQUAL = "=="

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: &gt;=
   */
  val T_IS_GREATER_OR_EQUAL = ">="

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: ===
   */
  val T_IS_IDENTICAL = "==="

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: != or &lt;&gt;
   */
  val T_IS_NOT_EQUAL = "(!=|<>)"

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: !==
   */
  val T_IS_NOT_IDENTICAL = "!=="

  /**
   * <a href="language.operators.comparison.php" class="link">比較演算子</a>
   * 構文: &lt;=
   */
  val T_IS_SMALLER_OR_EQUAL = "<="

  /**
   * <a href="language.constants.predefined.php" class="link">定数</a>
   * 構文: __LINE__
   */
  val T_LINE = "__LINE__"

  /**
   * <span class="function">
   * <a href="function.list.php" class="function">list()</a>
   * </span>
   * 構文: list()
   */
  val T_LIST = "list"

  /**
   * <a href="language.types.integer.php" class="link">整数</a>
   * 構文: 123, 012, 0x1ac, etc
   */
  val T_LNUMBER = "[0-9a-fA-Fx]+"

  /**
   * <a href="language.operators.logical.php" class="link">論理演算子</a>
   * 構文: and
   */
  val T_LOGICAL_AND = "and"

  /**
   * <a href="language.operators.logical.php" class="link">論理演算子</a>
   * 構文: or
   */
  val T_LOGICAL_OR = "or"

  /**
   * <a href="language.operators.logical.php" class="link">論理演算子</a>
   * 構文: xor
   */
  val T_LOGICAL_XOR = "xor"

  /**
   * <a href="language.constants.predefined.php" class="link">マジック定数</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: __METHOD__
   */
  val T_METHOD_C = "__METHOD_"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: -=
   */
  val T_MINUS_EQUAL = "-="

  /*
   * <a href="language.basic-syntax.comments.php" class="link">コメント</a>
   * (PHP 4 のみ)
   * 構文: /* and */
   */
  // val T_ML_COMMENT = ""

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: %=
   */
  val T_MOD_EQUAL = "%="

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: *=
   */
  val T_MUL_EQUAL = "\\*="

  /**
   * <a href="language.namespaces.php" class="link">名前空間</a>
   * (PHP 5.3.0 以降で使用可能)
   * 構文: namespace
   */
  val T_NAMESPACE = "namespace"

  /**
   * <a href="language.namespaces.php" class="link">名前空間</a>
   * (PHP 5.3.0 以降で使用可能)
   * 構文: __NAMESPACE__
   */
  val T_NS_C = "__NAMESPACE__"

  /**
   * <a href="language.namespaces.php" class="link">名前空間</a>
   * (PHP 5.3.0 以降で使用可能)
   * 構文: \
   */
  val T_NS_SEPARATOR = "\\"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * 構文: new
   */
  val T_NEW = "new"

  /*
   * <a href="language.types.string.php#language.types.string.parsing" class="link">文字列内の配列の添字</a>
   * 構文: &quot;$a[0]&quot;
   */
  // val T_NUM_STRING = ""

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (object)
   */
  val T_OBJECT_CAST = "\\(object\\)"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * 構文: -&gt;
   */
  val T_OBJECT_OPERATOR = "->"

  /*
   * (PHP 4 のみ)
   * 構文: old_function
   */
  // val T_OLD_FUNCTION = ""

  /**
   * <a href="language.basic-syntax.phpmode.php" class="link">HTMLからのエスケープ</a>
   * 構文: &lt;?php,&lt;? or &lt;%
   */
  val T_OPEN_TAG = "<(?php|%)"

  /**
   * <a href="language.basic-syntax.phpmode.php" class="link">HTMLからのエスケープ</a>
   * 構文: &lt;?= or &lt;%=
   */
  val T_OPEN_TAG_WITH_ECHO = "<(?=|%=)"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: |=
   */
  val T_OR_EQUAL = "|="

  /**
   * <a href="language.oop5.paamayim-nekudotayim.php" class="link">::</a>
   * <strong>
   * <code>T_DOUBLE_COLON</code>
   * </strong>
   * としても定義されています。
   * 構文: ::
   */
  val T_PAAMAYIM_NEKUDOTAYIM = "::"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: +=
   */
  val T_PLUS_EQUAL = "\\+="

  /**
   * <span class="function">
   * <a href="function.print.php" class="function">print</a>
   * </span>
   * 構文: print()
   */
  val T_PRINT = "print"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: private
   */
  val T_PRIVATE = "private"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: public
   */
  val T_PUBLIC = "public"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * (PHP 5.0.0 以降で使用可能)
   * 構文: protected
   */
  val T_PROTECTED = "protected"

  /**
   * <span class="function">
   * <a href="function.require.php" class="function">require</a>
   * </span>
   * 構文: require()
   */
  val T_REQUIRE = "require"

  /**
   * <span class="function">
   * <a href="function.require-once.php" class="function">require_once</a>
   * </span>
   * 構文: require_once()
   */
  val T_REQUIRE_ONCE = "require_once"

  /**
   * <a href="functions.returning-values.php" class="link">値を返す</a>
   * 構文: return
   */
  val T_RETURN = "return"

  /**
   * <a href="language.operators.bitwise.php" class="link">ビット演算子</a>
   * 構文: &lt;&lt;
   */
  val T_SL = "<<"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: &lt;&lt;=
   */
  val T_SL_EQUAL = "<<="

  /**
   * <a href="language.operators.bitwise.php" class="link">ビット演算子</a>
   * 構文:  &gt;&gt;
   */
  val T_SR = ">>"

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: &gt;&gt;=
   */
  val T_SR_EQUAL = ">>="

  /**
   * <a href="language.types.string.php#language.types.string.syntax.heredoc" class="link">heredoc構文</a>
   * 構文: &lt;&lt;&lt;
   */
  val T_START_HEREDOC = ">>>"

  /**
   * <a href="language.variables.scope.php" class="link">変数スコープ</a>
   * 構文: static
   */
  val T_STATIC = "static"

  /**
   * 識別子。たとえば
   * <em>parent</em>
   * や
   * <em>self</em>
   * といったオブジェクト指向のキーワード、そして関数名やクラス名などにマッチします。
   * 構文: parent、true など
   */
  val T_STRING = "[a-zA-Z_][a-zA-Z0-9_]*"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>
   * 構文: (string)
   */
  val T_STRING_CAST = "\\(string\\)"

  /**
   * <a href="language.types.string.php#language.types.string.parsing.complex" class="link">複雑な構文</a>
   * 構文: &quot;${a
   */
  val T_STRING_VARNAME = "${(" + T_STRING + ")}"

  /**
   * <a href="control-structures.switch.php" class="link">switch</a>
   * 構文: switch
   */
  val T_SWITCH = "switch"

  /**
   * <a href="language.exceptions.php" class="xref">例外(exceptions)</a> (PHP 5.0.0 以降で使用可能)
   * 構文: throw
   */
  val T_THROW = "throw"

  /**
   * <a href="language.oop5.traits.php" class="xref">トレイト</a> (PHP 5.4.0 以降で使用可能)
   * 構文: trait
   */
  val T_TRAIT = "trait"

  /**
   * <a href="" class="link">__TRAIT__</a> (PHP 5.4.0 以降で使用可能)
   * 構文: __TRAIT__
   */
  val T_TRAIT_C = "__TRAIT__"

  /**
   * <a href="language.exceptions.php" class="xref">例外(exceptions)</a> (PHP 5.0.0 以降で使用可能)
   * 構文: try
   */
  val T_TRY = "try"

  /**
   * <span class="function"><a href="function.unset.php" class="function">unset()</a></span>
   * 構文: unset()
   */
  val T_UNSET = "unset"

  /**
   * <a href="language.types.type-juggling.php#language.types.typecasting" class="link">型キャスト</a>(PHP 5.0.0 以降で使用可能)
   * 構文: (unset)
   */
  val T_UNSET_CAST = "\\(unset\\)"

  /**
   * <a href="language.namespaces.php" class="link">名前空間</a>(PHP 5.3.0 以降で使用可能、PHP 4.0.0 以降で予約済み)
   * 構文: use
   */
  val T_USE = "use"

  /**
   * <a href="language.oop5.php" class="link">クラスとオブジェクト</a>
   * 構文: var
   */
  val T_VAR = "var"

  /**
   * <a href="language.variables.php" class="link">変数</a>
   * 構文: $foo
   */
  val T_VARIABLE = "\\$" + T_STRING

  /**
   * <a href="control-structures.while.php" class="link">while</a>, <a href="control-structures.do.while.php" class="link">do..while</a>
   * 構文: while
   */
  val T_WHILE = "while"

  /*
   * &nbsp;
   * 構文: \t \r\n
   */
  // val T_WHITESPACE = ""

  /**
   * <a href="language.operators.assignment.php" class="link">代入演算子</a>
   * 構文: ^=
   */
  val T_XOR_EQUAL = "^="

  /**
   * <a href="language.generators.syntax.php#control-structures.yield" class="link">ジェネレータ</a> (PHP 5.5.0 以降で使用可能)
   * 構文: yield
   */
  val T_YIELD = "yield"

}
