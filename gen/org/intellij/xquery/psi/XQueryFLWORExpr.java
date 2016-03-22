// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryFLWORExpr extends XQueryExprSingle {

  @NotNull
  List<XQueryCountClause> getCountClauseList();

  @NotNull
  List<XQueryForClause> getForClauseList();

  @NotNull
  List<XQueryGroupByClause> getGroupByClauseList();

  @NotNull
  List<XQueryLetClause> getLetClauseList();

  @NotNull
  List<XQueryOrderByClause> getOrderByClauseList();

  @Nullable
  XQueryReturnClause getReturnClause();

  @NotNull
  List<XQueryWhereClause> getWhereClauseList();

  @NotNull
  List<XQueryWindowClause> getWindowClauseList();

}
