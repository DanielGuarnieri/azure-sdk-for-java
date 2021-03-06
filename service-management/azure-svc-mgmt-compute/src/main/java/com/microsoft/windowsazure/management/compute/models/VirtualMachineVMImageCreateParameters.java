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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;

/**
* Parameters supplied to the Create Virtual Machine VM Image operation.
*/
public class VirtualMachineVMImageCreateParameters {
    private ArrayList<DataDiskConfigurationCreateParameters> dataDiskConfigurations;
    
    /**
    * Optional. Specifies configuration information for the data disks that are
    * associated with the image. A VM Image might not have data disks
    * associated with it.
    * @return The DataDiskConfigurations value.
    */
    public ArrayList<DataDiskConfigurationCreateParameters> getDataDiskConfigurations() {
        return this.dataDiskConfigurations;
    }
    
    /**
    * Optional. Specifies configuration information for the data disks that are
    * associated with the image. A VM Image might not have data disks
    * associated with it.
    * @param dataDiskConfigurationsValue The DataDiskConfigurations value.
    */
    public void setDataDiskConfigurations(final ArrayList<DataDiskConfigurationCreateParameters> dataDiskConfigurationsValue) {
        this.dataDiskConfigurations = dataDiskConfigurationsValue;
    }
    
    private String description;
    
    /**
    * Optional. Gets or sets the description of the image.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. Gets or sets the description of the image.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private String eula;
    
    /**
    * Optional. Gets or sets the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    * @return The Eula value.
    */
    public String getEula() {
        return this.eula;
    }
    
    /**
    * Optional. Gets or sets the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    * @param eulaValue The Eula value.
    */
    public void setEula(final String eulaValue) {
        this.eula = eulaValue;
    }
    
    private String iconUri;
    
    /**
    * Optional. Gets or sets the URI to the icon that is displayed for the
    * image in the Management Portal.
    * @return The IconUri value.
    */
    public String getIconUri() {
        return this.iconUri;
    }
    
    /**
    * Optional. Gets or sets the URI to the icon that is displayed for the
    * image in the Management Portal.
    * @param iconUriValue The IconUri value.
    */
    public void setIconUri(final String iconUriValue) {
        this.iconUri = iconUriValue;
    }
    
    private String imageFamily;
    
    /**
    * Optional. Gets or sets a value that can be used to group VM Images.
    * @return The ImageFamily value.
    */
    public String getImageFamily() {
        return this.imageFamily;
    }
    
    /**
    * Optional. Gets or sets a value that can be used to group VM Images.
    * @param imageFamilyValue The ImageFamily value.
    */
    public void setImageFamily(final String imageFamilyValue) {
        this.imageFamily = imageFamilyValue;
    }
    
    private String label;
    
    /**
    * Required. Gets or sets an identifier for the image.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Required. Gets or sets an identifier for the image.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String language;
    
    /**
    * Optional. Gets or sets the language of the image.
    * @return The Language value.
    */
    public String getLanguage() {
        return this.language;
    }
    
    /**
    * Optional. Gets or sets the language of the image.
    * @param languageValue The Language value.
    */
    public void setLanguage(final String languageValue) {
        this.language = languageValue;
    }
    
    private String name;
    
    /**
    * Required. Gets or sets the name of the image.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets the name of the image.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private OSDiskConfigurationCreateParameters oSDiskConfiguration;
    
    /**
    * Required. Gets or sets configuration information for the operating system
    * disk that is associated with the image.
    * @return The OSDiskConfiguration value.
    */
    public OSDiskConfigurationCreateParameters getOSDiskConfiguration() {
        return this.oSDiskConfiguration;
    }
    
    /**
    * Required. Gets or sets configuration information for the operating system
    * disk that is associated with the image.
    * @param oSDiskConfigurationValue The OSDiskConfiguration value.
    */
    public void setOSDiskConfiguration(final OSDiskConfigurationCreateParameters oSDiskConfigurationValue) {
        this.oSDiskConfiguration = oSDiskConfigurationValue;
    }
    
    private URI privacyUri;
    
    /**
    * Optional. Gets or sets the URI that points to a document that contains
    * the privacy policy related to the image.
    * @return The PrivacyUri value.
    */
    public URI getPrivacyUri() {
        return this.privacyUri;
    }
    
    /**
    * Optional. Gets or sets the URI that points to a document that contains
    * the privacy policy related to the image.
    * @param privacyUriValue The PrivacyUri value.
    */
    public void setPrivacyUri(final URI privacyUriValue) {
        this.privacyUri = privacyUriValue;
    }
    
    private Calendar publishedDate;
    
    /**
    * Optional. Gets or sets the date when the image was added to the image
    * repository.
    * @return The PublishedDate value.
    */
    public Calendar getPublishedDate() {
        return this.publishedDate;
    }
    
    /**
    * Optional. Gets or sets the date when the image was added to the image
    * repository.
    * @param publishedDateValue The PublishedDate value.
    */
    public void setPublishedDate(final Calendar publishedDateValue) {
        this.publishedDate = publishedDateValue;
    }
    
    private String recommendedVMSize;
    
    /**
    * Optional. Gets or sets the size to use for the Virtual Machine that is
    * created from the VM Image.
    * @return The RecommendedVMSize value.
    */
    public String getRecommendedVMSize() {
        return this.recommendedVMSize;
    }
    
    /**
    * Optional. Gets or sets the size to use for the Virtual Machine that is
    * created from the VM Image.
    * @param recommendedVMSizeValue The RecommendedVMSize value.
    */
    public void setRecommendedVMSize(final String recommendedVMSizeValue) {
        this.recommendedVMSize = recommendedVMSizeValue;
    }
    
    private Boolean showInGui;
    
    /**
    * Optional. Gets or sets whether the VM Images should be listed in the
    * portal.
    * @return The ShowInGui value.
    */
    public Boolean isShowInGui() {
        return this.showInGui;
    }
    
    /**
    * Optional. Gets or sets whether the VM Images should be listed in the
    * portal.
    * @param showInGuiValue The ShowInGui value.
    */
    public void setShowInGui(final Boolean showInGuiValue) {
        this.showInGui = showInGuiValue;
    }
    
    private String smallIconUri;
    
    /**
    * Optional. Gets or sets the URI to the small icon that is displayed for
    * the image in the Management Portal.
    * @return The SmallIconUri value.
    */
    public String getSmallIconUri() {
        return this.smallIconUri;
    }
    
    /**
    * Optional. Gets or sets the URI to the small icon that is displayed for
    * the image in the Management Portal.
    * @param smallIconUriValue The SmallIconUri value.
    */
    public void setSmallIconUri(final String smallIconUriValue) {
        this.smallIconUri = smallIconUriValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineVMImageCreateParameters
    * class.
    *
    */
    public VirtualMachineVMImageCreateParameters() {
        this.setDataDiskConfigurations(new LazyArrayList<DataDiskConfigurationCreateParameters>());
    }
    
    /**
    * Initializes a new instance of the VirtualMachineVMImageCreateParameters
    * class with required arguments.
    *
    * @param name Gets or sets the name of the image.
    * @param label Gets or sets an identifier for the image.
    * @param oSDiskConfiguration Gets or sets configuration information for the
    * operating system disk that is associated with the image.
    */
    public VirtualMachineVMImageCreateParameters(String name, String label, OSDiskConfigurationCreateParameters oSDiskConfiguration) {
        this();
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (label == null) {
            throw new NullPointerException("label");
        }
        if (oSDiskConfiguration == null) {
            throw new NullPointerException("oSDiskConfiguration");
        }
        this.setName(name);
        this.setLabel(label);
        this.setOSDiskConfiguration(oSDiskConfiguration);
    }
}
