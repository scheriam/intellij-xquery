/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.xquery.formatter;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.TokenType;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import org.intellij.xquery.psi.XQueryExprSingle;
import org.intellij.xquery.psi.XQueryTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ligasgr
 * Date: 21/08/13
 * Time: 19:37
 */
public class XQueryFormattingBlock extends AbstractBlock {

    private final SpacingBuilder spacingBuilder;
    private final CommonCodeStyleSettings settings;

    public XQueryFormattingBlock(@NotNull ASTNode node, @Nullable Wrap wrap, @Nullable Alignment alignment,
                                 @NotNull CommonCodeStyleSettings settings, @NotNull SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
        this.settings = settings;
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<Block>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if (child.getElementType() != TokenType.WHITE_SPACE && child.getTextRange().getLength() != 0) {
                Block block = new XQueryFormattingBlock(child, Wrap.createWrap(WrapType.NONE, false), null, settings,
                        spacingBuilder);
                blocks.add(block);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public Indent getIndent() {
        IElementType type = myNode.getElementType();
        ASTNode parent = myNode.getTreeParent();
        IElementType parentType = parent != null ? parent.getElementType() : null;

        if (parent == null)
            return Indent.getNoneIndent();
        if (type == XQueryTypes.EXPR && parentType == XQueryTypes.ENCLOSED_EXPR)
            return Indent.getNormalIndent(false);
        if (type == XQueryTypes.DIR_ELEM_CONTENT)
            return Indent.getNormalIndent(false);
        if (myNode.getPsi() instanceof XQueryExprSingle) {
            if (parentType == XQueryTypes.IF_EXPR) {
                return Indent.getNormalIndent(false);
            }
            if (parentType == XQueryTypes.LET_BINDING || parentType == XQueryTypes.VAR_VALUE) {
                return Indent.getContinuationIndent(false);
            }
        }
        if (parentType == XQueryTypes.PARAM_LIST || parentType == XQueryTypes.ARGUMENT_LIST) {
            if (type == XQueryTypes.L_PAR || type == XQueryTypes.R_PAR) {
                return Indent.getNoneIndent();
            }
            return Indent.getContinuationIndent(false);
        }

        return Indent.getNoneIndent();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }
}