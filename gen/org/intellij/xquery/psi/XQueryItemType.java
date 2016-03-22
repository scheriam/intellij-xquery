// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryItemType extends XQueryPsiElement {

  @Nullable
  XQueryAtomicOrUnionType getAtomicOrUnionType();

  @Nullable
  XQueryFunctionTest getFunctionTest();

  @Nullable
  XQueryGeneralItemType getGeneralItemType();

  @Nullable
  XQueryKindTest getKindTest();

  @Nullable
  XQueryParenthesizedItemType getParenthesizedItemType();

}
