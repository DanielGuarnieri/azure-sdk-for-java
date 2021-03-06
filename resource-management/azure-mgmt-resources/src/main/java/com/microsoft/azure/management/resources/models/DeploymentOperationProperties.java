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

package com.microsoft.azure.management.resources.models;

import java.util.Calendar;

/**
* Deployment operation properties.
*/
public class DeploymentOperationProperties {
    private String provisioningState;
    
    /**
    * Optional. Gets or sets the state of the provisioning.
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets the state of the provisioning.
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private String statusCode;
    
    /**
    * Optional. Gets or sets operation status code.
    * @return The StatusCode value.
    */
    public String getStatusCode() {
        return this.statusCode;
    }
    
    /**
    * Optional. Gets or sets operation status code.
    * @param statusCodeValue The StatusCode value.
    */
    public void setStatusCode(final String statusCodeValue) {
        this.statusCode = statusCodeValue;
    }
    
    private String statusMessage;
    
    /**
    * Optional. Gets or sets operation status message.
    * @return The StatusMessage value.
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    
    /**
    * Optional. Gets or sets operation status message.
    * @param statusMessageValue The StatusMessage value.
    */
    public void setStatusMessage(final String statusMessageValue) {
        this.statusMessage = statusMessageValue;
    }
    
    private TargetResource targetResource;
    
    /**
    * Optional. Gets or sets the target resource.
    * @return The TargetResource value.
    */
    public TargetResource getTargetResource() {
        return this.targetResource;
    }
    
    /**
    * Optional. Gets or sets the target resource.
    * @param targetResourceValue The TargetResource value.
    */
    public void setTargetResource(final TargetResource targetResourceValue) {
        this.targetResource = targetResourceValue;
    }
    
    private Calendar timestamp;
    
    /**
    * Optional. Gets or sets the date and time of the operation.
    * @return The Timestamp value.
    */
    public Calendar getTimestamp() {
        return this.timestamp;
    }
    
    /**
    * Optional. Gets or sets the date and time of the operation.
    * @param timestampValue The Timestamp value.
    */
    public void setTimestamp(final Calendar timestampValue) {
        this.timestamp = timestampValue;
    }
}
