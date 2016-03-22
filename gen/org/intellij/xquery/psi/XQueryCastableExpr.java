// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryCastableExpr extends XQueryExprSingle {

  @Nullable
  XQueryCastableOperator getCastableOperator();

  @NotNull
  XQueryExprSingle getExprSingle();

  @Nullable
  XQuerySingleType getSingleType();

}
