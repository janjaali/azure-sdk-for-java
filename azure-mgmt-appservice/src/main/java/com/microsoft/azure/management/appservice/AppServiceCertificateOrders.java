/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.appservice;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.appservice.implementation.AppServiceCertificateOrdersInner;
import com.microsoft.azure.management.appservice.implementation.AppServiceManager;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import rx.Observable;

/**
 * Entry point for app service certificate order management API.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.AppService.Fluent")
@Beta
public interface AppServiceCertificateOrders extends
        SupportsCreating<AppServiceCertificateOrder.DefinitionStages.Blank>,
        SupportsDeletingById,
        SupportsListingByResourceGroup<AppServiceCertificateOrder>,
        SupportsGettingByResourceGroup<AppServiceCertificateOrder>,
        SupportsListing<AppServiceCertificateOrder>,
        SupportsGettingById<AppServiceCertificateOrder>,
        SupportsDeletingByResourceGroup,
        HasManager<AppServiceManager>,
        HasInner<AppServiceCertificateOrdersInner> {
    /**
     * Gets the information about a resource from Azure based on the resource name and the name of its resource group.
     *
     * @param resourceGroupName the name of the resource group the resource is in
     * @param name the name of the resource. (Note, this is not the ID)
     * @return an immutable representation of the resource
     */
    Observable<AppServiceCertificateOrder> getByResourceGroupAsync(String resourceGroupName, String name);
}