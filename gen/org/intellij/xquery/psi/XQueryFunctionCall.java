// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface XQueryFunctionCall extends XQueryFunctionInvocation {

  @NotNull
  XQueryArgumentList getArgumentList();

  @NotNull
  XQueryFunctionName getFunctionName();

  PsiReference getReference();

  int getArity();

}
