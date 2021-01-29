/*
 * Copyright 2013-2016 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
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

package org.intellij.xquery.runner.rt.vendor.basex;

import org.basex.BaseXServer;
import org.intellij.xquery.runner.rt.RunnerAppTest;
import org.intellij.xquery.runner.rt.XQueryDataSourceType;
import org.intellij.xquery.runner.rt.XQueryRunConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.theories.DataPoints;

import java.io.File;

import static org.intellij.xquery.runner.rt.FileTestUtil.createFileWithContents;
import static org.intellij.xquery.runner.rt.XQueryItemType.TEXT;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_BYTE;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_DURATION;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_LANGUAGE;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_NORMALIZED_STRING;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_TOKEN;
import static org.intellij.xquery.runner.rt.XQueryItemType.XS_UNTYPED_ATOMIC;
import static org.intellij.xquery.runner.rt.XQueryRunConfigBuilder.runConfig;

public class BaseXNativeRunnerAppTest extends RunnerAppTest {

    private static final String SERIALIZATION_OPTION = "declare option output:method 'xml';\n";

    private static BaseXServer server;

    @BeforeClass
    public static void startServer() throws Exception {
        server = new BaseXServer();
    }

    @AfterClass
    public static void stopServer() throws Exception {
        server.stop();
    }

    @DataPoints
    public static DataPair[] getBaseXCompatibleData() {
        return new DataPair[]{
                DataPair.pair(XS_DURATION, "P3Y6M4DT12H30M5S"),
                DataPair.pair(XS_BYTE, "32"),
                DataPair.pair(XS_NORMALIZED_STRING, VALUE),
                DataPair.pair(XS_TOKEN, VALUE),
                DataPair.pair(XS_LANGUAGE, VALUE),
                DataPair.pair(XS_UNTYPED_ATOMIC, VALUE),
                DataPair.pair(TEXT, VALUE),
        };
    }

    @Override
    protected String getDataSourceType() {
        return XQueryDataSourceType.BASEX_NATIVE.toString();
    }

    protected String prepareConfigurationForMainFile(File xqueryMainFile) {
        return runConfig()
                .withTypeName(getDataSourceType())
                .withMainFileName(xqueryMainFile.getAbsolutePath())
                .withConnectionData("localhost", "1984", "admin", "admin")
                .build();
    }

    protected String prepareConfigurationWithContextItemForMainFile(File xqueryMainFile, String contextItemValue,
                                                                    String contextItemType) {
        return runConfig()
                .withTypeName(getDataSourceType())
                .withMainFileName(xqueryMainFile.getAbsolutePath())
                .withContextItemType(contextItemType)
                .withContextItemValue(contextItemValue)
                .withConnectionData("localhost", "1984", "admin", "admin")
                .build();
    }

    protected String prepareConfigurationWithVariableForMainFile(File xqueryMainFile, String value, String type) {
        return runConfig()
                .withTypeName(getDataSourceType())
                .withMainFileName(xqueryMainFile.getAbsolutePath())
                .withVariable("v", value, type)
                .withConnectionData("localhost", "1984", "admin", "admin")
                .build();
    }


    protected XQueryRunConfig prepareConfigForVariable(String type, String value) throws Exception {
        File xqueryMainFile = createFileWithContents(SERIALIZATION_OPTION + RETURN_VARIABLE_XQUERY);
        return new XQueryRunConfig(prepareConfigurationWithVariableForMainFile(xqueryMainFile, value, type));
    }

    protected XQueryRunConfig prepareConfigForContextItem(String type, String value) throws Exception {
        File xqueryMainFile = createFileWithContents(SERIALIZATION_OPTION + RETURN_CONTEXT_ITEM_XQUERY);
        return new XQueryRunConfig(prepareConfigurationWithContextItemForMainFile(xqueryMainFile, value, type));
    }
}
