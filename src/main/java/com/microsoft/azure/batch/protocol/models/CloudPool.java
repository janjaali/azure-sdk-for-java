/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A pool in the Azure Batch service.
 */
public class CloudPool {
    /**
     * A string that uniquely identifies the pool within the account.
     * The ID can contain any combination of alphanumeric characters including
     * hyphens and underscores, and cannot contain more than 64 characters. It
     * is common to use a GUID for the id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The display name for the pool.
     * The display name need not be unique and can contain any Unicode
     * characters up to a maximum length of 1024.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The URL of the pool.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The ETag of the pool.
     * This is an opaque string. You can use it to detect whether the pool has
     * changed between requests. In particular, you can be pass the ETag when
     * updating a pool to specify that your changes should take effect only if
     * nobody else has modified the pool in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the pool.
     * This is the last time at which the pool level data, such as the
     * targetDedicatedNodes or enableAutoscale settings, changed. It does not
     * factor in node-level changes such as a compute node changing state.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The creation time of the pool.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * The current state of the pool.
     * active - The pool is available to run tasks subject to the availability
     * of compute nodes. deleting - The user has requested that the pool be
     * deleted, but the delete operation has not yet completed. upgrading - The
     * user has requested that the operating system of the pool's nodes be
     * upgraded, but the upgrade operation has not yet completed (that is, some
     * nodes in the pool have not yet been upgraded). While upgrading, the pool
     * may be able to run tasks (with reduced capacity) but this is not
     * guaranteed. Possible values include: 'active', 'deleting', 'upgrading'.
     */
    @JsonProperty(value = "state")
    private PoolState state;

    /**
     * The time at which the pool entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * Whether the pool is resizing.
     * steady - The pool is not resizing. There are no changes to the number of
     * nodes in the pool in progress. A pool enters this state when it is
     * created and when no operations are being performed on the pool to change
     * the number of dedicated nodes. resizing - The pool is resizing; that is,
     * compute nodes are being added to or removed from the pool. stopping -
     * The pool was resizing, but the user has requested that the resize be
     * stopped, but the stop request has not yet been completed. Possible
     * values include: 'steady', 'resizing', 'stopping'.
     */
    @JsonProperty(value = "allocationState")
    private AllocationState allocationState;

    /**
     * The time at which the pool entered its current allocation state.
     */
    @JsonProperty(value = "allocationStateTransitionTime")
    private DateTime allocationStateTransitionTime;

    /**
     * The size of virtual machines in the pool. All virtual machines in a pool
     * are the same size.
     * For information about available sizes of virtual machines for Cloud
     * Services pools (pools created with cloudServiceConfiguration), see Sizes
     * for Cloud Services
     * (http://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/).
     * Batch supports all Cloud Services VM sizes except ExtraSmall, A1V2 and
     * A2V2. For information about available VM sizes for pools using images
     * from the Virtual Machines Marketplace (pools created with
     * virtualMachineConfiguration) see Sizes for Virtual Machines (Linux)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/)
     * or Sizes for Virtual Machines (Windows)
     * (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/).
     * Batch supports all Azure VM sizes except STANDARD_A0 and those with
     * premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * The cloud service configuration for the pool.
     * This property and virtualMachineConfiguration are mutually exclusive and
     * one of the properties must be specified. This property cannot be
     * specified if the Batch account was created with its poolAllocationMode
     * property set to 'UserSubscription'.
     */
    @JsonProperty(value = "cloudServiceConfiguration")
    private CloudServiceConfiguration cloudServiceConfiguration;

    /**
     * The virtual machine configuration for the pool.
     * This property and cloudServiceConfiguration are mutually exclusive and
     * one of the properties must be specified.
     */
    @JsonProperty(value = "virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * The timeout for allocation of compute nodes to the pool.
     * This is the timeout for the most recent resize operation. (The initial
     * sizing when the pool is created counts as a resize.) The default value
     * is 15 minutes.
     */
    @JsonProperty(value = "resizeTimeout")
    private Period resizeTimeout;

    /**
     * A list of errors encountered while performing the last resize on the
     * pool.
     * This property is set only if one or more errors occurred during the last
     * pool resize, and only when the pool allocationState is Steady.
     */
    @JsonProperty(value = "resizeErrors")
    private List<ResizeError> resizeErrors;

    /**
     * The number of dedicated compute nodes currently in the pool.
     */
    @JsonProperty(value = "currentDedicatedNodes")
    private Integer currentDedicatedNodes;

    /**
     * The number of low-priority compute nodes currently in the pool.
     * Low-priority compute nodes which have been preempted are included in
     * this count.
     */
    @JsonProperty(value = "currentLowPriorityNodes")
    private Integer currentLowPriorityNodes;

    /**
     * The desired number of dedicated compute nodes in the pool.
     */
    @JsonProperty(value = "targetDedicatedNodes")
    private Integer targetDedicatedNodes;

    /**
     * The desired number of low-priority compute nodes in the pool.
     */
    @JsonProperty(value = "targetLowPriorityNodes")
    private Integer targetLowPriorityNodes;

    /**
     * Whether the pool size should automatically adjust over time.
     * If false, at least one of targetDedicateNodes and targetLowPriorityNodes
     * must be specified. If true, the autoScaleFormula property is required
     * and the pool automatically resizes according to the formula. The default
     * value is false.
     */
    @JsonProperty(value = "enableAutoScale")
    private Boolean enableAutoScale;

    /**
     * A formula for the desired number of compute nodes in the pool.
     * This property is set only if the pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /**
     * The time interval at which to automatically adjust the pool size
     * according to the autoscale formula.
     * This property is set only if the pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Period autoScaleEvaluationInterval;

    /**
     * The results and errors from the last execution of the autoscale formula.
     * This property is set only if the pool automatically scales, i.e.
     * enableAutoScale is true.
     */
    @JsonProperty(value = "autoScaleRun")
    private AutoScaleRun autoScaleRun;

    /**
     * Whether the pool permits direct communication between nodes.
     * This imposes restrictions on which nodes can be assigned to the pool.
     * Specifying this value can reduce the chance of the requested number of
     * nodes to be allocated in the pool.
     */
    @JsonProperty(value = "enableInterNodeCommunication")
    private Boolean enableInterNodeCommunication;

    /**
     * The network configuration for the pool.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /**
     * A task specified to run on each compute node as it joins the pool.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * The list of certificates to be installed on each compute node in the
     * pool.
     * For Windows compute nodes, the Batch service installs the certificates
     * to the specified certificate store and location. For Linux compute
     * nodes, the certificates are stored in a directory inside the task
     * working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR
     * is supplied to the task to query for this location. For certificates
     * with visibility of 'remoteUser', a 'certs' directory is created in the
     * user's home directory (e.g., /home/{user-name}/certs) and certificates
     * are placed in that directory.
     */
    @JsonProperty(value = "certificateReferences")
    private List<CertificateReference> certificateReferences;

    /**
     * The list of application packages to be installed on each compute node in
     * the pool.
     */
    @JsonProperty(value = "applicationPackageReferences")
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * The list of application licenses the Batch service will make available
     * on each compute node in the pool.
     * The list of application licenses must be a subset of available Batch
     * service application licenses. If a license is requested which is not
     * supported, pool creation will fail.
     */
    @JsonProperty(value = "applicationLicenses")
    private List<String> applicationLicenses;

    /**
     * The maximum number of tasks that can run concurrently on a single
     * compute node in the pool.
     */
    @JsonProperty(value = "maxTasksPerNode")
    private Integer maxTasksPerNode;

    /**
     * How the Batch service distributes tasks between compute nodes in the
     * pool.
     */
    @JsonProperty(value = "taskSchedulingPolicy")
    private TaskSchedulingPolicy taskSchedulingPolicy;

    /**
     * The list of user accounts to be created on each node in the pool.
     */
    @JsonProperty(value = "userAccounts")
    private List<UserAccount> userAccounts;

    /**
     * A list of name-value pairs associated with the pool as metadata.
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Utilization and resource usage statistics for the entire lifetime of the
     * pool.
     */
    @JsonProperty(value = "stats")
    private PoolStatistics stats;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public PoolState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withState(PoolState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get the allocationState value.
     *
     * @return the allocationState value
     */
    public AllocationState allocationState() {
        return this.allocationState;
    }

    /**
     * Set the allocationState value.
     *
     * @param allocationState the allocationState value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAllocationState(AllocationState allocationState) {
        this.allocationState = allocationState;
        return this;
    }

    /**
     * Get the allocationStateTransitionTime value.
     *
     * @return the allocationStateTransitionTime value
     */
    public DateTime allocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    /**
     * Set the allocationStateTransitionTime value.
     *
     * @param allocationStateTransitionTime the allocationStateTransitionTime value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAllocationStateTransitionTime(DateTime allocationStateTransitionTime) {
        this.allocationStateTransitionTime = allocationStateTransitionTime;
        return this;
    }

    /**
     * Get the vmSize value.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize value.
     *
     * @param vmSize the vmSize value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the cloudServiceConfiguration value.
     *
     * @return the cloudServiceConfiguration value
     */
    public CloudServiceConfiguration cloudServiceConfiguration() {
        return this.cloudServiceConfiguration;
    }

    /**
     * Set the cloudServiceConfiguration value.
     *
     * @param cloudServiceConfiguration the cloudServiceConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCloudServiceConfiguration(CloudServiceConfiguration cloudServiceConfiguration) {
        this.cloudServiceConfiguration = cloudServiceConfiguration;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration value.
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration value.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the resizeTimeout value.
     *
     * @return the resizeTimeout value
     */
    public Period resizeTimeout() {
        return this.resizeTimeout;
    }

    /**
     * Set the resizeTimeout value.
     *
     * @param resizeTimeout the resizeTimeout value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withResizeTimeout(Period resizeTimeout) {
        this.resizeTimeout = resizeTimeout;
        return this;
    }

    /**
     * Get the resizeErrors value.
     *
     * @return the resizeErrors value
     */
    public List<ResizeError> resizeErrors() {
        return this.resizeErrors;
    }

    /**
     * Set the resizeErrors value.
     *
     * @param resizeErrors the resizeErrors value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withResizeErrors(List<ResizeError> resizeErrors) {
        this.resizeErrors = resizeErrors;
        return this;
    }

    /**
     * Get the currentDedicatedNodes value.
     *
     * @return the currentDedicatedNodes value
     */
    public Integer currentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }

    /**
     * Set the currentDedicatedNodes value.
     *
     * @param currentDedicatedNodes the currentDedicatedNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCurrentDedicatedNodes(Integer currentDedicatedNodes) {
        this.currentDedicatedNodes = currentDedicatedNodes;
        return this;
    }

    /**
     * Get the currentLowPriorityNodes value.
     *
     * @return the currentLowPriorityNodes value
     */
    public Integer currentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }

    /**
     * Set the currentLowPriorityNodes value.
     *
     * @param currentLowPriorityNodes the currentLowPriorityNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCurrentLowPriorityNodes(Integer currentLowPriorityNodes) {
        this.currentLowPriorityNodes = currentLowPriorityNodes;
        return this;
    }

    /**
     * Get the targetDedicatedNodes value.
     *
     * @return the targetDedicatedNodes value
     */
    public Integer targetDedicatedNodes() {
        return this.targetDedicatedNodes;
    }

    /**
     * Set the targetDedicatedNodes value.
     *
     * @param targetDedicatedNodes the targetDedicatedNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTargetDedicatedNodes(Integer targetDedicatedNodes) {
        this.targetDedicatedNodes = targetDedicatedNodes;
        return this;
    }

    /**
     * Get the targetLowPriorityNodes value.
     *
     * @return the targetLowPriorityNodes value
     */
    public Integer targetLowPriorityNodes() {
        return this.targetLowPriorityNodes;
    }

    /**
     * Set the targetLowPriorityNodes value.
     *
     * @param targetLowPriorityNodes the targetLowPriorityNodes value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTargetLowPriorityNodes(Integer targetLowPriorityNodes) {
        this.targetLowPriorityNodes = targetLowPriorityNodes;
        return this;
    }

    /**
     * Get the enableAutoScale value.
     *
     * @return the enableAutoScale value
     */
    public Boolean enableAutoScale() {
        return this.enableAutoScale;
    }

    /**
     * Set the enableAutoScale value.
     *
     * @param enableAutoScale the enableAutoScale value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withEnableAutoScale(Boolean enableAutoScale) {
        this.enableAutoScale = enableAutoScale;
        return this;
    }

    /**
     * Get the autoScaleFormula value.
     *
     * @return the autoScaleFormula value
     */
    public String autoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set the autoScaleFormula value.
     *
     * @param autoScaleFormula the autoScaleFormula value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get the autoScaleEvaluationInterval value.
     *
     * @return the autoScaleEvaluationInterval value
     */
    public Period autoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set the autoScaleEvaluationInterval value.
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleEvaluationInterval(Period autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }

    /**
     * Get the autoScaleRun value.
     *
     * @return the autoScaleRun value
     */
    public AutoScaleRun autoScaleRun() {
        return this.autoScaleRun;
    }

    /**
     * Set the autoScaleRun value.
     *
     * @param autoScaleRun the autoScaleRun value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withAutoScaleRun(AutoScaleRun autoScaleRun) {
        this.autoScaleRun = autoScaleRun;
        return this;
    }

    /**
     * Get the enableInterNodeCommunication value.
     *
     * @return the enableInterNodeCommunication value
     */
    public Boolean enableInterNodeCommunication() {
        return this.enableInterNodeCommunication;
    }

    /**
     * Set the enableInterNodeCommunication value.
     *
     * @param enableInterNodeCommunication the enableInterNodeCommunication value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withEnableInterNodeCommunication(Boolean enableInterNodeCommunication) {
        this.enableInterNodeCommunication = enableInterNodeCommunication;
        return this;
    }

    /**
     * Get the networkConfiguration value.
     *
     * @return the networkConfiguration value
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the networkConfiguration value.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the certificateReferences value.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the certificateReferences value.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the applicationPackageReferences value.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the applicationPackageReferences value.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the applicationLicenses value.
     *
     * @return the applicationLicenses value
     */
    public List<String> applicationLicenses() {
        return this.applicationLicenses;
    }

    /**
     * Set the applicationLicenses value.
     *
     * @param applicationLicenses the applicationLicenses value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withApplicationLicenses(List<String> applicationLicenses) {
        this.applicationLicenses = applicationLicenses;
        return this;
    }

    /**
     * Get the maxTasksPerNode value.
     *
     * @return the maxTasksPerNode value
     */
    public Integer maxTasksPerNode() {
        return this.maxTasksPerNode;
    }

    /**
     * Set the maxTasksPerNode value.
     *
     * @param maxTasksPerNode the maxTasksPerNode value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withMaxTasksPerNode(Integer maxTasksPerNode) {
        this.maxTasksPerNode = maxTasksPerNode;
        return this;
    }

    /**
     * Get the taskSchedulingPolicy value.
     *
     * @return the taskSchedulingPolicy value
     */
    public TaskSchedulingPolicy taskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }

    /**
     * Set the taskSchedulingPolicy value.
     *
     * @param taskSchedulingPolicy the taskSchedulingPolicy value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withTaskSchedulingPolicy(TaskSchedulingPolicy taskSchedulingPolicy) {
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        return this;
    }

    /**
     * Get the userAccounts value.
     *
     * @return the userAccounts value
     */
    public List<UserAccount> userAccounts() {
        return this.userAccounts;
    }

    /**
     * Set the userAccounts value.
     *
     * @param userAccounts the userAccounts value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the stats value.
     *
     * @return the stats value
     */
    public PoolStatistics stats() {
        return this.stats;
    }

    /**
     * Set the stats value.
     *
     * @param stats the stats value to set
     * @return the CloudPool object itself.
     */
    public CloudPool withStats(PoolStatistics stats) {
        this.stats = stats;
        return this;
    }

}