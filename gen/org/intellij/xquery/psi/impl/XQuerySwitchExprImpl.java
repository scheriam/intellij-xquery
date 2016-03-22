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

public class XQuerySwitchExprImpl extends XQueryExprSingleImpl implements XQuerySwitchExpr {

  public XQuerySwitchExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitSwitchExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryExpr getExpr() {
    return findChildByClass(XQueryExpr.class);
  }

  @Override
  @NotNull
  public List<XQuerySwitchCaseClause> getSwitchCaseClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQuerySwitchCaseClause.class);
  }

  @Override
  @Nullable
  public XQuerySwitchDefaultReturnClause getSwitchDefaultReturnClause() {
    return findChildByClass(XQuerySwitchDefaultReturnClause.class);
  }

}
