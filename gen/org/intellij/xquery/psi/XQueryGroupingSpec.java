// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryGroupingSpec extends XQueryPsiElement {

  @Nullable
  XQueryExprSingle getExprSingle();

  @NotNull
  XQueryGroupingVariable getGroupingVariable();

  @Nullable
  XQueryTypeDeclaration getTypeDeclaration();

  @Nullable
  XQueryURILiteral getURILiteral();

}
