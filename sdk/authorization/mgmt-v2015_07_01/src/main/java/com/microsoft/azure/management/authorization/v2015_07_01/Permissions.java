/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import rx.Observable;

/**
 * Type representing Permissions.
 */
public interface Permissions {
    /**
     * Gets all permissions the caller has for a resource.
     *
     * @param resourceGroupName The name of the resource group containing the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get the permissions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Permission> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName);

    /**
     * Gets all permissions the caller has for a resource group.
     *
     * @param resourceGroupName The name of the resource group to get the permissions for. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Permission> listByResourceGroupAsync(final String resourceGroupName);

}
