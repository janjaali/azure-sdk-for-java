/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PatchCluster request parameters.
 */
public class ClusterPatchParameters {
    /**
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the resource tags.
     *
     * @param tags the tags value to set
     * @return the ClusterPatchParameters object itself.
     */
    public ClusterPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
