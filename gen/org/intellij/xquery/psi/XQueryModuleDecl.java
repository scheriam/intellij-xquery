// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryModuleDecl extends XQueryNamespaceSource {

  @Nullable
  XQueryNamespacePrefix getNamespacePrefix();

  @Nullable
  XQuerySeparator getSeparator();

  @Nullable
  XQueryURILiteral getURILiteral();

  String getNamespace();

}
