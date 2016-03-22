// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface XQueryVarDecl extends XQueryPsiElement {

  @NotNull
  List<XQueryAnnotation> getAnnotationList();

  @NotNull
  List<XQueryCompatibilityAnnotation> getCompatibilityAnnotationList();

  @Nullable
  XQueryExternalVarPart getExternalVarPart();

  @NotNull
  List<XQueryMarklogicAnnotation> getMarklogicAnnotationList();

  @Nullable
  XQuerySeparator getSeparator();

  @Nullable
  XQueryTypeDeclaration getTypeDeclaration();

  @Nullable
  XQueryVarName getVarName();

  @Nullable
  XQueryVarValue getVarValue();

  ItemPresentation getPresentation();

  boolean isExternal();

  int getTextOffset();

  boolean isPublic();

}
