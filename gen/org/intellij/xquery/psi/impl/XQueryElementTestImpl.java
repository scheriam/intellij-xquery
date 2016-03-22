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

public class XQueryElementTestImpl extends XQueryPsiElementImpl implements XQueryElementTest {

  public XQueryElementTestImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitElementTest(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XQueryElementNameOrWildcard getElementNameOrWildcard() {
    return findChildByClass(XQueryElementNameOrWildcard.class);
  }

  @Override
  @Nullable
  public XQueryTypeName getTypeName() {
    return findChildByClass(XQueryTypeName.class);
  }

}
