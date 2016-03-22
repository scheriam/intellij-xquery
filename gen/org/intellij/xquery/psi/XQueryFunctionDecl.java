// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface XQueryFunctionDecl extends XQueryPsiElement {

  @NotNull
  List<XQueryAnnotation> getAnnotationList();

  @NotNull
  List<XQueryCompatibilityAnnotation> getCompatibilityAnnotationList();

  @Nullable
  XQueryFunctionBody getFunctionBody();

  @Nullable
  XQueryFunctionName getFunctionName();

  @NotNull
  List<XQueryMarklogicAnnotation> getMarklogicAnnotationList();

  @Nullable
  XQueryParamList getParamList();

  @Nullable
  XQuerySeparator getSeparator();

  @Nullable
  XQuerySequenceType getSequenceType();

  ItemPresentation getPresentation();

  int getArity();

  boolean hasValidFunctionName();

  boolean isPublic();

  int getTextOffset();

}
