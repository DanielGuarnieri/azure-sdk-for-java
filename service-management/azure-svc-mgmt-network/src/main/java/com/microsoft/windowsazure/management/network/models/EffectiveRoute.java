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

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* An effective route within an effective route table.
*/
public class EffectiveRoute {
    private ArrayList<String> addressPrefixes;
    
    /**
    * Optional. Gets or sets the address prefixes that apply to this route, in
    * CIDR format.
    * @return The AddressPrefixes value.
    */
    public ArrayList<String> getAddressPrefixes() {
        return this.addressPrefixes;
    }
    
    /**
    * Optional. Gets or sets the address prefixes that apply to this route, in
    * CIDR format.
    * @param addressPrefixesValue The AddressPrefixes value.
    */
    public void setAddressPrefixes(final ArrayList<String> addressPrefixesValue) {
        this.addressPrefixes = addressPrefixesValue;
    }
    
    private EffectiveNextHop effectiveNextHop;
    
    /**
    * Required. Gets or sets the effective next hop for this route.
    * @return The EffectiveNextHop value.
    */
    public EffectiveNextHop getEffectiveNextHop() {
        return this.effectiveNextHop;
    }
    
    /**
    * Required. Gets or sets the effective next hop for this route.
    * @param effectiveNextHopValue The EffectiveNextHop value.
    */
    public void setEffectiveNextHop(final EffectiveNextHop effectiveNextHopValue) {
        this.effectiveNextHop = effectiveNextHopValue;
    }
    
    private String name;
    
    /**
    * Required. Gets or sets the name of the Route.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets the name of the Route.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String source;
    
    /**
    * Required. Gets or sets the ource of this route.
    * @return The Source value.
    */
    public String getSource() {
        return this.source;
    }
    
    /**
    * Required. Gets or sets the ource of this route.
    * @param sourceValue The Source value.
    */
    public void setSource(final String sourceValue) {
        this.source = sourceValue;
    }
    
    private String status;
    
    /**
    * Required. Gets or sets the status of this route.
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Required. Gets or sets the status of this route.
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    /**
    * Initializes a new instance of the EffectiveRoute class.
    *
    */
    public EffectiveRoute() {
        this.setAddressPrefixes(new LazyArrayList<String>());
    }
}
