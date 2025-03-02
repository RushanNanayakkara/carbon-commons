/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.logging.service;

import org.apache.commons.configuration.ConfigurationException;
import org.wso2.carbon.logging.service.data.RemoteServerLoggerData;

import java.io.IOException;

/**
 * This is the interface used for configuring the remote server logging configurations.
 */
public interface RemoteLoggingConfigService {

    /**
     * This method is used to add a remote server configuration.
     *
     * @param data                      RemoteServerLoggerData object that contains the remote server configuration.
     * @throws IOException              If an error occurs while writing to the log4j2.properties file.
     * @throws ConfigurationException   If an error occurs while loading the log4j2.properties file.
     */
    void addRemoteServerConfig(RemoteServerLoggerData data) throws IOException, ConfigurationException;

    /**
     * This method is used to reset the remote server configurations to the defaults.
     *
     * @param data                      RemoteServerLoggerData object that contains the remote server configuration.
     * @throws IOException              If an error occurs while writing to the log4j2.properties file.
     * @throws ConfigurationException   If an error occurs while loading the log4j2.properties file.
     */
    void resetRemoteServerConfig(RemoteServerLoggerData data) throws IOException, ConfigurationException;
}
