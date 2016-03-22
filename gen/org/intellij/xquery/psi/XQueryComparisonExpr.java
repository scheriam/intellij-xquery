// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryComparisonExpr extends XQueryExprSingle {

  @Nullable
  XQueryEqualityComp getEqualityComp();

  @NotNull
  List<XQueryExprSingle> getExprSingleList();

  @Nullable
  XQueryNodeComp getNodeComp();

  @Nullable
  XQueryRelationalComp getRelationalComp();

  @Nullable
  XQueryValueComp getValueComp();

}
