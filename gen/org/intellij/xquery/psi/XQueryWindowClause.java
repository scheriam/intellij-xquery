// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryWindowClause extends XQueryPsiElement {

  @NotNull
  List<XQueryCurrentItem> getCurrentItemList();

  @NotNull
  List<XQueryExprSingle> getExprSingleList();

  @NotNull
  List<XQueryNextItem> getNextItemList();

  @NotNull
  List<XQueryPositionalVar> getPositionalVarList();

  @NotNull
  List<XQueryPreviousItem> getPreviousItemList();

  @Nullable
  XQueryTypeDeclaration getTypeDeclaration();

  @Nullable
  XQueryVarName getVarName();

}
