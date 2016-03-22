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

public class XQueryConstructorImpl extends XQueryPsiElementImpl implements XQueryConstructor {

  public XQueryConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitConstructor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryComputedConstructor getComputedConstructor() {
    return findChildByClass(XQueryComputedConstructor.class);
  }

  @Override
  @Nullable
  public XQueryDirectConstructor getDirectConstructor() {
    return findChildByClass(XQueryDirectConstructor.class);
  }

}
