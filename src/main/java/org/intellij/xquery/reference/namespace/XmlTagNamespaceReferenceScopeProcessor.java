/*
 * Copyright 2013-2014 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
 * (see the CONTRIBUTORS file).
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

package org.intellij.xquery.reference.namespace;

import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.BaseScopeProcessor;
import org.intellij.xquery.psi.XQueryAttrLocalName;
import org.intellij.xquery.psi.XQueryDirAttributeName;
import org.intellij.xquery.psi.XQueryXmlTagNamespace;
import org.jetbrains.annotations.NotNull;

public class XmlTagNamespaceReferenceScopeProcessor extends BaseScopeProcessor {
    private XQueryAttrLocalName result;
    private XQueryXmlTagNamespace myElement;

    public XmlTagNamespaceReferenceScopeProcessor(XQueryXmlTagNamespace myElement) {
        this.myElement = myElement;
    }

    public XQueryAttrLocalName getResult() {
        return result;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, ResolveState state) {
        if (element instanceof XQueryDirAttributeName) {
            XQueryDirAttributeName attributeName = (XQueryDirAttributeName) element;
            if (attributeName.getAttrNamespace() != null
                    && "xmlns".equals(attributeName.getAttrNamespace().getText())
                    && myElement.getText().equals(attributeName.getAttrLocalName().getText())) {
                result = attributeName.getAttrLocalName();
                return false;
            }
        }
        return true;
    }
}