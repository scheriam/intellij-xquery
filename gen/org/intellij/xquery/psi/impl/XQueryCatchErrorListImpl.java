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

public class XQueryCatchErrorListImpl extends XQueryElementImpl implements XQueryCatchErrorList {

  public XQueryCatchErrorListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<XQueryNameTest> getNameTestList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryNameTest.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) ((XQueryVisitor)visitor).visitCatchErrorList(this);
    else super.accept(visitor);
  }

}
