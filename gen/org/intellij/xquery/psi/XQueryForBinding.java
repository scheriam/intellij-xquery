// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;

public interface XQueryForBinding extends XQueryPsiElement {

  @Nullable
  XQueryAllowingEmpty getAllowingEmpty();

  @Nullable
  XQueryExprSingle getExprSingle();

  @Nullable
  XQueryPositionalVar getPositionalVar();

  @Nullable
  XQueryTypeDeclaration getTypeDeclaration();

  @Nullable
  XQueryVarName getVarName();

  boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place);

}
