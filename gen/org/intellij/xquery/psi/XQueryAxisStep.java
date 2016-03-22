// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryAxisStep extends XQueryPsiElement {

  @Nullable
  XQueryForwardStep getForwardStep();

  @Nullable
  XQueryMarklogicNamespaceAxis getMarklogicNamespaceAxis();

  @NotNull
  XQueryPredicateList getPredicateList();

  @Nullable
  XQueryReverseStep getReverseStep();

}
