package com.jetbrains.typoscript.lang;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * @author lene
 *         Date: 03.04.12
 */
public interface TypoScriptTokenTypes extends TokenType {
  IElementType C_STYLE_COMMENT = new TypoScriptTokenType("C_STYLE_COMMENT");
  IElementType ONE_LINE_COMMENT = new TypoScriptTokenType("ONE_LINE_COMMENT");
  IElementType IGNORED_TEXT = new TypoScriptTokenType("IGNORED_TEXT");
  IElementType WHITE_SPACE_WITH_NEW_LINE = new TypoScriptTokenType("WHITE_SPACE_WITH_NEW_LINE");

  IElementType ASSIGNMENT_OPERATOR = new TypoScriptTokenType("=");
  IElementType ASSIGNMENT_VALUE = new TypoScriptTokenType("assignment value");

  IElementType MULTILINE_VALUE_OPERATOR_BEGIN = new TypoScriptTokenType("(");
  IElementType MULTILINE_VALUE_OPERATOR_END = new TypoScriptTokenType(")");
  IElementType MULTILINE_VALUE = new TypoScriptTokenType("multiline value");

  IElementType CODE_BLOCK_OPERATOR_BEGIN = new TypoScriptTokenType("{");
  IElementType CODE_BLOCK_OPERATOR_END = new TypoScriptTokenType("}");

  IElementType UNSETTING_OPERATOR = new TypoScriptTokenType(">");
  IElementType COPYING_OPERATOR = new TypoScriptTokenType("<");

  IElementType MODIFICATION_OPERATOR = new TypoScriptTokenType(":=");
  IElementType MODIFICATION_OPERATOR_FUNCTION = new TypoScriptTokenType("modification function");
  IElementType MODIFICATION_OPERATOR_FUNCTION_PARAM_BEGIN = new TypoScriptTokenType("(");
  IElementType MODIFICATION_OPERATOR_FUNCTION_PARAM_END = new TypoScriptTokenType(")");
  IElementType MODIFICATION_OPERATOR_FUNCTION_ARGUMENT = new TypoScriptTokenType("modification value");

  IElementType OBJECT_PATH_ENTITY = new TypoScriptTokenType("object path entity");
  IElementType OBJECT_PATH_SEPARATOR = new TypoScriptTokenType(".");

  IElementType INCLUDE_STATEMENT = new TypoScriptTokenType("INCLUDE");
  IElementType CONDITION = new TypoScriptTokenType("CONDITION");

  TokenSet OPERATORS = TokenSet.create(MODIFICATION_OPERATOR, ASSIGNMENT_OPERATOR,
                                       MULTILINE_VALUE_OPERATOR_BEGIN, MULTILINE_VALUE_OPERATOR_END,
                                       CODE_BLOCK_OPERATOR_BEGIN, CODE_BLOCK_OPERATOR_END,
                                       UNSETTING_OPERATOR, COPYING_OPERATOR);

  TokenSet WHITESPACES = TokenSet.create(WHITE_SPACE , WHITE_SPACE_WITH_NEW_LINE);
  TokenSet COMMENTS = TokenSet.create(ONE_LINE_COMMENT, C_STYLE_COMMENT, IGNORED_TEXT);
  TokenSet STRING_LITERALS = TokenSet.create(ASSIGNMENT_VALUE, MULTILINE_VALUE);
}
