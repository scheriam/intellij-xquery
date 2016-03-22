// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryModuleImport extends XQueryNamespaceSource {

  @Nullable
  XQueryModuleImportNamespace getModuleImportNamespace();

  @NotNull
  List<XQueryModuleImportPath> getModuleImportPathList();

  @Nullable
  XQueryNamespacePrefix getNamespacePrefix();

  @Nullable
  XQuerySeparator getSeparator();

  String getNamespace();

}
