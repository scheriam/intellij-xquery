// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface XQueryXmlTagName extends XQueryNamedElement {

  @NotNull
  XQueryXmlTagLocalName getXmlTagLocalName();

  @Nullable
  XQueryXmlTagNamespace getXmlTagNamespace();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  PsiReference getReference();

  int getTextOffset();

}
