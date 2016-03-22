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

public class XQueryDirectConstructorImpl extends XQueryPsiElementImpl implements XQueryDirectConstructor {

  public XQueryDirectConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitDirectConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryDirCommentConstructor getDirCommentConstructor() {
    return findChildByClass(XQueryDirCommentConstructor.class);
  }

  @Override
  @Nullable
  public XQueryDirPIConstructor getDirPIConstructor() {
    return findChildByClass(XQueryDirPIConstructor.class);
  }

  @Override
  @Nullable
  public XQueryXmlEmptyTag getXmlEmptyTag() {
    return findChildByClass(XQueryXmlEmptyTag.class);
  }

  @Override
  @Nullable
  public XQueryXmlFullTag getXmlFullTag() {
    return findChildByClass(XQueryXmlFullTag.class);
  }

}
