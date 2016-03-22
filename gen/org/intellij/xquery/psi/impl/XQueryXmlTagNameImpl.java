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

public class XQueryXmlTagNameImpl extends XQueryNamedElementImpl implements XQueryXmlTagName {

  public XQueryXmlTagNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitXmlTagName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XQueryXmlTagLocalName getXmlTagLocalName() {
    return findNotNullChildByClass(XQueryXmlTagLocalName.class);
  }

  @Override
  @Nullable
  public XQueryXmlTagNamespace getXmlTagNamespace() {
    return findChildByClass(XQueryXmlTagNamespace.class);
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

  public int getTextOffset() {
    return XQueryPsiImplUtil.getTextOffset(this);
  }

}
