
/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.analytics.apim.integration.tests.apim.analytics.utils;

import java.io.File;

public class APIMAnalyticsIntegrationTestConstants {

    public static final String RELATIVE_PATH_TO_TEST_ARTIFACTS = "analytics" + File.separator + "apim" +
            File.separator + "artifacts" + File.separator;
    public static final int TCP_PORT = 8461;

    //constants related to RequestPatternChange Tests
    public static final String REQUEST_COUNT_TABLE = "ORG_WSO2_ANALYTICS_APIM_REQUESTCOUNTTABLE";
    public static final String FIRST_COUNT_TABLE = "ORG_WSO2_ANALYTICS_APIM_FIRSTCOUNTTABLE";
    public static final String MARKOV_MODEL_TABLE = "ORG_WSO2_ANALYTICS_APIM_MARKOVMODELTABLE";

}