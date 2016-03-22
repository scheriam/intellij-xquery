// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface XQueryNamedFunctionRef extends XQueryFunctionInvocation {

  @NotNull
  XQueryFunctionArity getFunctionArity();

  @NotNull
  XQueryFunctionName getFunctionName();

  int getArity();

  PsiReference getReference();

}
