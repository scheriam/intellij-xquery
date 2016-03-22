// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.search.SearchScope;

public interface XQueryVarName extends XQueryNamedElement {

  @Nullable
  XQueryPrefix getPrefix();

  @Nullable
  XQueryVarLocalName getVarLocalName();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  int getTextOffset();

  SearchScope getUseScope();

  ItemPresentation getPresentation();

  void delete();

}
