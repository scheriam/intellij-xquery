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

public class XQueryComparisonExprImpl extends XQueryExprSingleImpl implements XQueryComparisonExpr {

  public XQueryComparisonExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<XQueryExprSingle> getExprSingleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryExprSingle.class);
  }

  @Override
  @Nullable
  public XQueryGeneralComp getGeneralComp() {
    return findChildByClass(XQueryGeneralComp.class);
  }

  @Override
  @Nullable
  public XQueryNodeComp getNodeComp() {
    return findChildByClass(XQueryNodeComp.class);
  }

  @Override
  @Nullable
  public XQueryValueComp getValueComp() {
    return findChildByClass(XQueryValueComp.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) ((XQueryVisitor)visitor).visitComparisonExpr(this);
    else super.accept(visitor);
  }

}
