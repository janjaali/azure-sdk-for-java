/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation;

import com.microsoft.azure.management.machinelearningservices.v2019_05_01.AmlComputeNodesInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.AmlComputeNodeInformation;

class AmlComputeNodesInformationImpl extends WrapperImpl<AmlComputeNodesInformationInner> implements AmlComputeNodesInformation {
    private final MachineLearningServicesManager manager;
    AmlComputeNodesInformationImpl(AmlComputeNodesInformationInner inner, MachineLearningServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MachineLearningServicesManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<AmlComputeNodeInformation> nodes() {
        return this.inner().nodes();
    }

}
