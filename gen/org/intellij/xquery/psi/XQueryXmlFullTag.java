// This is a generated file. Not intended for manual editing.
package org.intellij.xquery.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XQueryXmlFullTag extends XQueryPsiElement {

  @Nullable
  XQueryDirAttributeList getDirAttributeList();

  @NotNull
  List<XQueryDirElemContent> getDirElemContentList();

  @NotNull
  List<XQueryMisplacedComment> getMisplacedCommentList();

  @NotNull
  List<XQueryXmlTagName> getXmlTagNameList();

}
