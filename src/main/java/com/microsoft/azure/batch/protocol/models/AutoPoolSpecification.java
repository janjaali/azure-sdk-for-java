/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies characteristics for a temporary 'auto pool'. The Batch service
 * will create this auto pool when the job is submitted.
 */
public class AutoPoolSpecification {
    /**
     * A prefix to be added to the unique identifier when a pool is
     * automatically created.
     * The Batch service assigns each auto pool a unique identifier on
     * creation. To distinguish between pools created for different purposes,
     * you can specify this element to add a prefix to the id that is assigned.
     * The prefix can be up to 20 characters long.
     */
    @JsonProperty(value = "autoPoolIdPrefix")
    private String autoPoolIdPrefix;

    /**
     * The minimum lifetime of created auto pools, and how multiple jobs on a
     * schedule are assigned to pools.
     * When the pool lifetime scope is jobSchedule level, the Batch service
     * keeps track of the last autopool created for the job schedule, and
     * deletes that pool when the job schedule completes. Batch will also
     * delete this pool if the user updates the auto pool specification in a
     * way that changes this lifetime. Possible values include: 'jobSchedule',
     * 'job', 'unmapped'.
     */
    @JsonProperty(value = "poolLifetimeOption", required = true)
    private PoolLifetimeOption poolLifetimeOption;

    /**
     * Whether to keep an auto pool alive after its lifetime expires.
     * If false, the Batch service deletes the pool once its lifetime (as
     * determined by the poolLifetimeOption setting) expires; that is, when the
     * job or job schedule completes. If true, the Batch service does not
     * delete the pool automatically. It is up to the user to delete auto pools
     * created with this option.
     */
    @JsonProperty(value = "keepAlive")
    private Boolean keepAlive;

    /**
     * The pool specification for the auto pool.
     */
    @JsonProperty(value = "pool")
    private PoolSpecification pool;

    /**
     * Get the autoPoolIdPrefix value.
     *
     * @return the autoPoolIdPrefix value
     */
    public String autoPoolIdPrefix() {
        return this.autoPoolIdPrefix;
    }

    /**
     * Set the autoPoolIdPrefix value.
     *
     * @param autoPoolIdPrefix the autoPoolIdPrefix value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withAutoPoolIdPrefix(String autoPoolIdPrefix) {
        this.autoPoolIdPrefix = autoPoolIdPrefix;
        return this;
    }

    /**
     * Get the poolLifetimeOption value.
     *
     * @return the poolLifetimeOption value
     */
    public PoolLifetimeOption poolLifetimeOption() {
        return this.poolLifetimeOption;
    }

    /**
     * Set the poolLifetimeOption value.
     *
     * @param poolLifetimeOption the poolLifetimeOption value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withPoolLifetimeOption(PoolLifetimeOption poolLifetimeOption) {
        this.poolLifetimeOption = poolLifetimeOption;
        return this;
    }

    /**
     * Get the keepAlive value.
     *
     * @return the keepAlive value
     */
    public Boolean keepAlive() {
        return this.keepAlive;
    }

    /**
     * Set the keepAlive value.
     *
     * @param keepAlive the keepAlive value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * Get the pool value.
     *
     * @return the pool value
     */
    public PoolSpecification pool() {
        return this.pool;
    }

    /**
     * Set the pool value.
     *
     * @param pool the pool value to set
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification withPool(PoolSpecification pool) {
        this.pool = pool;
        return this;
    }

}