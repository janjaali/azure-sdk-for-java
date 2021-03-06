/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_09_30;

import rx.Observable;

/**
 * Type representing ContainerServices.
 */
public interface ContainerServices {
    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including verison and available upgrades.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OrchestratorVersionProfileListResult> listOrchestratorsAsync(String location);

}
