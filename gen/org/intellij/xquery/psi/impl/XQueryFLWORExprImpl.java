// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.xquery.psi.XQueryTypes.*;
import org.intellij.xquery.psi.*;

public class XQueryFLWORExprImpl extends XQueryExprSingleImpl implements XQueryFLWORExpr {

  public XQueryFLWORExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitFLWORExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XQueryCountClause> getCountClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryCountClause.class);
  }

  @Override
  @NotNull
  public List<XQueryForClause> getForClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryForClause.class);
  }

  @Override
  @NotNull
  public List<XQueryGroupByClause> getGroupByClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryGroupByClause.class);
  }

  @Override
  @NotNull
  public List<XQueryLetClause> getLetClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryLetClause.class);
  }

  @Override
  @NotNull
  public List<XQueryOrderByClause> getOrderByClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryOrderByClause.class);
  }

  @Override
  @Nullable
  public XQueryReturnClause getReturnClause() {
    return findChildByClass(XQueryReturnClause.class);
  }

  @Override
  @NotNull
  public List<XQueryWhereClause> getWhereClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryWhereClause.class);
  }

  @Override
  @NotNull
  public List<XQueryWindowClause> getWindowClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryWindowClause.class);
  }

}
