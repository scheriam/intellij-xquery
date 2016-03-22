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

public class XQueryModuleImportImpl extends XQueryPsiElementImpl implements XQueryModuleImport {

  public XQueryModuleImportImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitModuleImport(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryModuleImportNamespace getModuleImportNamespace() {
    return findChildByClass(XQueryModuleImportNamespace.class);
  }

  @Override
  @NotNull
  public List<XQueryModuleImportPath> getModuleImportPathList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryModuleImportPath.class);
  }

  @Override
  @Nullable
  public XQueryNamespacePrefix getNamespacePrefix() {
    return findChildByClass(XQueryNamespacePrefix.class);
  }

  @Override
  @Nullable
  public XQuerySeparator getSeparator() {
    return findChildByClass(XQuerySeparator.class);
  }

  public String getNamespace() {
    return XQueryPsiImplUtil.getNamespace(this);
  }

}
