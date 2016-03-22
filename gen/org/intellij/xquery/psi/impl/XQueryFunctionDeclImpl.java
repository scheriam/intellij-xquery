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
import com.intellij.navigation.ItemPresentation;

public class XQueryFunctionDeclImpl extends XQueryPsiElementImpl implements XQueryFunctionDecl {

  public XQueryFunctionDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitFunctionDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XQueryAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryAnnotation.class);
  }

  @Override
  @NotNull
  public List<XQueryCompatibilityAnnotation> getCompatibilityAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryCompatibilityAnnotation.class);
  }

  @Override
  @Nullable
  public XQueryFunctionBody getFunctionBody() {
    return findChildByClass(XQueryFunctionBody.class);
  }

  @Override
  @Nullable
  public XQueryFunctionName getFunctionName() {
    return findChildByClass(XQueryFunctionName.class);
  }

  @Override
  @NotNull
  public List<XQueryMarklogicAnnotation> getMarklogicAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryMarklogicAnnotation.class);
  }

  @Override
  @Nullable
  public XQueryParamList getParamList() {
    return findChildByClass(XQueryParamList.class);
  }

  @Override
  @Nullable
  public XQuerySeparator getSeparator() {
    return findChildByClass(XQuerySeparator.class);
  }

  @Override
  @Nullable
  public XQuerySequenceType getSequenceType() {
    return findChildByClass(XQuerySequenceType.class);
  }

  public ItemPresentation getPresentation() {
    return XQueryPsiImplUtil.getPresentation(this);
  }

  public int getArity() {
    return XQueryPsiImplUtil.getArity(this);
  }

  public boolean hasValidFunctionName() {
    return XQueryPsiImplUtil.hasValidFunctionName(this);
  }

  public boolean isPublic() {
    return XQueryPsiImplUtil.isPublic(this);
  }

  public int getTextOffset() {
    return XQueryPsiImplUtil.getTextOffset(this);
  }

}
