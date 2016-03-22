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

public class XQueryWindowClauseImpl extends XQueryPsiElementImpl implements XQueryWindowClause {

  public XQueryWindowClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitWindowClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XQueryCurrentItem> getCurrentItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryCurrentItem.class);
  }

  @Override
  @NotNull
  public List<XQueryExprSingle> getExprSingleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryExprSingle.class);
  }

  @Override
  @NotNull
  public List<XQueryNextItem> getNextItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryNextItem.class);
  }

  @Override
  @NotNull
  public List<XQueryPositionalVar> getPositionalVarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryPositionalVar.class);
  }

  @Override
  @NotNull
  public List<XQueryPreviousItem> getPreviousItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryPreviousItem.class);
  }

  @Override
  @Nullable
  public XQueryTypeDeclaration getTypeDeclaration() {
    return findChildByClass(XQueryTypeDeclaration.class);
  }

  @Override
  @Nullable
  public XQueryVarName getVarName() {
    return findChildByClass(XQueryVarName.class);
  }

}
