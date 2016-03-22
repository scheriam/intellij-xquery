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

public class XQueryAttrNamespaceImpl extends XQueryNamedElementImpl implements XQueryAttrNamespace {

  public XQueryAttrNamespaceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitAttrNamespace(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  public String getName() {
    return XQueryPsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return XQueryPsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return XQueryPsiImplUtil.getNameIdentifier(this);
  }

  public PsiReference getReference() {
    return XQueryPsiImplUtil.getReference(this);
  }

  public boolean isEquivalentTo(PsiElement another) {
    return XQueryPsiImplUtil.isEquivalentTo(this, another);
  }

}
