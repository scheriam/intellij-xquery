// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface XQueryFunctionName extends XQueryNamedElement {

  @Nullable
  XQueryFunctionLocalName getFunctionLocalName();

  @Nullable
  XQueryPrefix getPrefix();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  int getTextOffset();

  ItemPresentation getPresentation();

  void delete();

  String getPrefixText();

  String getLocalNameText();

  boolean isEquivalentTo(PsiElement another);

}
