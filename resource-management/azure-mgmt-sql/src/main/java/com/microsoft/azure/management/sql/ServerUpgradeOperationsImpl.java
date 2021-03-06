/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.RecommendedDatabaseProperties;
import com.microsoft.azure.management.sql.models.ServerUpgradeGetResponse;
import com.microsoft.azure.management.sql.models.ServerUpgradeStartParameters;
import com.microsoft.azure.management.sql.models.UpgradeRecommendedElasticPoolProperties;
import com.microsoft.windowsazure.core.LazyCollection;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.pipeline.apache.CustomHttpDelete;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.ObjectNode;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
* Represents all the operations for Azure SQL Database Server Upgrade
*/
public class ServerUpgradeOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, ServerUpgradeOperations {
    /**
    * Initializes a new instance of the ServerUpgradeOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    ServerUpgradeOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.azure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Cancel a pending upgrade for the Azure SQL Database server.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * cancel upgrade.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> cancelAsync(final String resourceGroupName, final String serverName) {
        return this.getClient().getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception {
                return cancel(resourceGroupName, serverName);
            }
         });
    }
    
    /**
    * Cancel a pending upgrade for the Azure SQL Database server.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * cancel upgrade.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse cancel(String resourceGroupName, String serverName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            CloudTracing.enter(invocationId, this, "cancelAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/operationResults/versionUpgrade";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        CustomHttpDelete httpRequest = new CustomHttpDelete(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_ACCEPTED) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationResponse result = null;
            // Deserialize Response
            result = new OperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Returns information about Upgrade status of an Azure SQL Database Server.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * upgrade.
    * @return Represents the response to a Get request for Upgrade status of an
    * Azure SQL Database Server.
    */
    @Override
    public Future<ServerUpgradeGetResponse> getAsync(final String resourceGroupName, final String serverName) {
        return this.getClient().getExecutorService().submit(new Callable<ServerUpgradeGetResponse>() { 
            @Override
            public ServerUpgradeGetResponse call() throws Exception {
                return get(resourceGroupName, serverName);
            }
         });
    }
    
    /**
    * Returns information about Upgrade status of an Azure SQL Database Server.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * upgrade.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get request for Upgrade status of an
    * Azure SQL Database Server.
    */
    @Override
    public ServerUpgradeGetResponse get(String resourceGroupName, String serverName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/operationResults/versionUpgrade";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK && statusCode != HttpStatus.SC_ACCEPTED) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            ServerUpgradeGetResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_ACCEPTED) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new ServerUpgradeGetResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                String responseDocContent = IOUtils.toString(responseContent);
                if (responseDocContent == null == false && responseDocContent.length() > 0) {
                    responseDoc = objectMapper.readTree(responseDocContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    JsonNode statusValue = responseDoc.get("status");
                    if (statusValue != null && statusValue instanceof NullNode == false) {
                        String statusInstance;
                        statusInstance = statusValue.getTextValue();
                        result.setStatus(statusInstance);
                    }
                    
                    JsonNode scheduleUpgradeAfterTimeValue = responseDoc.get("scheduleUpgradeAfterTime");
                    if (scheduleUpgradeAfterTimeValue != null && scheduleUpgradeAfterTimeValue instanceof NullNode == false) {
                        Calendar scheduleUpgradeAfterTimeInstance;
                        scheduleUpgradeAfterTimeInstance = DatatypeConverter.parseDateTime(scheduleUpgradeAfterTimeValue.getTextValue());
                        result.setScheduleUpgradeAfterTime(scheduleUpgradeAfterTimeInstance);
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Start an Azure SQL Database Server Upgrade.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * upgrade.
    * @param parameters Required. The required parameters for the Azure SQL
    * Database Server Upgrade.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> startAsync(final String resourceGroupName, final String serverName, final ServerUpgradeStartParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception {
                return start(resourceGroupName, serverName, parameters);
            }
         });
    }
    
    /**
    * Start an Azure SQL Database Server Upgrade.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server to
    * upgrade.
    * @param parameters Required. The required parameters for the Azure SQL
    * Database Server Upgrade.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse start(String resourceGroupName, String serverName, ServerUpgradeStartParameters parameters) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        if (parameters.getProperties() == null) {
            throw new NullPointerException("parameters.Properties");
        }
        if (parameters.getProperties().getVersion() == null) {
            throw new NullPointerException("parameters.Properties.Version");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "startAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/upgrade";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPost httpRequest = new HttpPost(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Serialize Request
        String requestContent = null;
        JsonNode requestDoc = null;
        
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode serverUpgradeStartParametersValue = objectMapper.createObjectNode();
        requestDoc = serverUpgradeStartParametersValue;
        
        ObjectNode serverUpgradePropertiesValue = objectMapper.createObjectNode();
        ((ObjectNode) serverUpgradeStartParametersValue).put("serverUpgradeProperties", serverUpgradePropertiesValue);
        
        ((ObjectNode) serverUpgradePropertiesValue).put("Version", parameters.getProperties().getVersion());
        
        if (parameters.getProperties().getScheduleUpgradeAfterUtcDateTime() != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            ((ObjectNode) serverUpgradePropertiesValue).put("ScheduleUpgradeAfterUtcDateTime", simpleDateFormat.format(parameters.getProperties().getScheduleUpgradeAfterUtcDateTime().getTime()));
        }
        
        if (parameters.getProperties().getDatabaseCollection() != null) {
            if (parameters.getProperties().getDatabaseCollection() instanceof LazyCollection == false || ((LazyCollection) parameters.getProperties().getDatabaseCollection()).isInitialized()) {
                ArrayNode databaseCollectionArray = objectMapper.createArrayNode();
                for (RecommendedDatabaseProperties databaseCollectionItem : parameters.getProperties().getDatabaseCollection()) {
                    ObjectNode recommendedDatabasePropertiesValue = objectMapper.createObjectNode();
                    databaseCollectionArray.add(recommendedDatabasePropertiesValue);
                    
                    if (databaseCollectionItem.getName() != null) {
                        ((ObjectNode) recommendedDatabasePropertiesValue).put("Name", databaseCollectionItem.getName());
                    }
                    
                    if (databaseCollectionItem.getTargetEdition() != null) {
                        ((ObjectNode) recommendedDatabasePropertiesValue).put("TargetEdition", databaseCollectionItem.getTargetEdition());
                    }
                    
                    if (databaseCollectionItem.getTargetServiceLevelObjective() != null) {
                        ((ObjectNode) recommendedDatabasePropertiesValue).put("TargetServiceLevelObjective", databaseCollectionItem.getTargetServiceLevelObjective());
                    }
                }
                ((ObjectNode) serverUpgradePropertiesValue).put("DatabaseCollection", databaseCollectionArray);
            }
        }
        
        if (parameters.getProperties().getElasticPoolCollection() != null) {
            if (parameters.getProperties().getElasticPoolCollection() instanceof LazyCollection == false || ((LazyCollection) parameters.getProperties().getElasticPoolCollection()).isInitialized()) {
                ArrayNode elasticPoolCollectionArray = objectMapper.createArrayNode();
                for (UpgradeRecommendedElasticPoolProperties elasticPoolCollectionItem : parameters.getProperties().getElasticPoolCollection()) {
                    ObjectNode upgradeRecommendedElasticPoolPropertiesValue = objectMapper.createObjectNode();
                    elasticPoolCollectionArray.add(upgradeRecommendedElasticPoolPropertiesValue);
                    
                    if (elasticPoolCollectionItem.getName() != null) {
                        ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("Name", elasticPoolCollectionItem.getName());
                    }
                    
                    if (elasticPoolCollectionItem.getEdition() != null) {
                        ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("Edition", elasticPoolCollectionItem.getEdition());
                    }
                    
                    ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("Dtu", elasticPoolCollectionItem.getDtu());
                    
                    ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("StorageMb", elasticPoolCollectionItem.getStorageMb());
                    
                    ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("DatabaseDtuMin", elasticPoolCollectionItem.getDatabaseDtuMin());
                    
                    ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("DatabaseDtuMax", elasticPoolCollectionItem.getDatabaseDtuMax());
                    
                    if (elasticPoolCollectionItem.getDatabaseCollection() != null) {
                        if (elasticPoolCollectionItem.getDatabaseCollection() instanceof LazyCollection == false || ((LazyCollection) elasticPoolCollectionItem.getDatabaseCollection()).isInitialized()) {
                            ArrayNode databaseCollectionArray2 = objectMapper.createArrayNode();
                            for (String databaseCollectionItem2 : elasticPoolCollectionItem.getDatabaseCollection()) {
                                databaseCollectionArray2.add(databaseCollectionItem2);
                            }
                            ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("DatabaseCollection", databaseCollectionArray2);
                        }
                    }
                    
                    if (elasticPoolCollectionItem.isIncludeAllDatabases() != null) {
                        ((ObjectNode) upgradeRecommendedElasticPoolPropertiesValue).put("IncludeAllDatabases", elasticPoolCollectionItem.isIncludeAllDatabases());
                    }
                }
                ((ObjectNode) serverUpgradePropertiesValue).put("ElasticPoolCollection", elasticPoolCollectionArray);
            }
        }
        
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, requestDoc);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_ACCEPTED) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationResponse result = null;
            // Deserialize Response
            result = new OperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
