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
import com.intellij.psi.PsiReference;

public class XQueryFunctionCallImpl extends XQueryPsiElementImpl implements XQueryFunctionCall {

  public XQueryFunctionCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XQueryArgumentList getArgumentList() {
    return findNotNullChildByClass(XQueryArgumentList.class);
  }

  @Override
  @NotNull
  public XQueryFunctionName getFunctionName() {
    return findNotNullChildByClass(XQueryFunctionName.class);
  }

  public PsiReference getReference() {
    return XQueryPsiImplUtil.getReference(this);
  }

  public int getArity() {
    return XQueryPsiImplUtil.getArity(this);
  }

}
