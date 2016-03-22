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

public class XQueryVarDeclImpl extends XQueryPsiElementImpl implements XQueryVarDecl {

  public XQueryVarDeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitVarDecl(this);
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
  public XQueryExternalVarPart getExternalVarPart() {
    return findChildByClass(XQueryExternalVarPart.class);
  }

  @Override
  @NotNull
  public List<XQueryMarklogicAnnotation> getMarklogicAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryMarklogicAnnotation.class);
  }

  @Override
  @Nullable
  public XQuerySeparator getSeparator() {
    return findChildByClass(XQuerySeparator.class);
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

  @Override
  @Nullable
  public XQueryVarValue getVarValue() {
    return findChildByClass(XQueryVarValue.class);
  }

  public ItemPresentation getPresentation() {
    return XQueryPsiImplUtil.getPresentation(this);
  }

  public boolean isExternal() {
    return XQueryPsiImplUtil.isExternal(this);
  }

  public int getTextOffset() {
    return XQueryPsiImplUtil.getTextOffset(this);
  }

  public boolean isPublic() {
    return XQueryPsiImplUtil.isPublic(this);
  }

}
