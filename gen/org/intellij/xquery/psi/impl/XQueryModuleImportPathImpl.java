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

public class XQueryModuleImportPathImpl extends XQueryPsiElementImpl implements XQueryModuleImportPath {

  public XQueryModuleImportPathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitModuleImportPath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XQueryURILiteral getURILiteral() {
    return findNotNullChildByClass(XQueryURILiteral.class);
  }

  public PsiReference getReference() {
    return XQueryPsiImplUtil.getReference(this);
  }

}
