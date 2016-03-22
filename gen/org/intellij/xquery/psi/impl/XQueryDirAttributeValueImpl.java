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

public class XQueryDirAttributeValueImpl extends XQueryPsiElementImpl implements XQueryDirAttributeValue {

  public XQueryDirAttributeValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XQueryVisitor visitor) {
    visitor.visitDirAttributeValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XQueryVisitor) accept((XQueryVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XQueryAposAttrValueContent> getAposAttrValueContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryAposAttrValueContent.class);
  }

  @Override
  @NotNull
  public List<XQueryEscapeApos> getEscapeAposList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryEscapeApos.class);
  }

  @Override
  @NotNull
  public List<XQueryEscapeQuot> getEscapeQuotList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryEscapeQuot.class);
  }

  @Override
  @NotNull
  public List<XQueryQuotAttrValueContent> getQuotAttrValueContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XQueryQuotAttrValueContent.class);
  }

}
