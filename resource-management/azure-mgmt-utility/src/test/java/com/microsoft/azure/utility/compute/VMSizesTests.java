/**
 * Copyright Microsoft Corporation
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.azure.utility.compute;

import com.microsoft.azure.management.compute.models.VirtualMachineSizeListResponse;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VMSizesTests extends ComputeTestBase {
    static {
        log = LogFactory.getLog(VMSizesTests.class);
    }

    @BeforeClass
    public static void setup() throws Exception {
        ensureClientsInitialized();
    }

    @Before
    public void beforeTest() throws Exception {
        setupTest();
    }

    @After
    public void afterTest() throws Exception {
        resetTest();
    }

    @Test
    public void testListVMSizes() throws Exception {
        log.info("start test, in mock: " + IS_MOCKED);
        VirtualMachineSizeListResponse sizeListResponse = computeManagementClient.getVirtualMachineSizesOperations()
                .list(m_location.replace(" ", ""));
        Assert.assertEquals(HttpStatus.SC_OK, sizeListResponse.getStatusCode());
        ComputeTestHelper.validateVirtualMachineSizeListResponse(sizeListResponse);
    }
}
