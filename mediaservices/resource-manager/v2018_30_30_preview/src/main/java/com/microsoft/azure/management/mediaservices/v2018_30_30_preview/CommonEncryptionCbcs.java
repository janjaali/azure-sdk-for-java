/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for CommonEncryptionCbcs encryption scheme.
 */
public class CommonEncryptionCbcs {
    /**
     * Representing supported protocols.
     */
    @JsonProperty(value = "enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * Representing which tracks should not be encrypted.
     */
    @JsonProperty(value = "clearTracks")
    private List<TrackSelection> clearTracks;

    /**
     * Representing default content key for each encryption scheme and separate
     * content keys for specific tracks.
     */
    @JsonProperty(value = "contentKeys")
    private StreamingPolicyContentKeys contentKeys;

    /**
     * Configuration of DRMs for current encryption scheme.
     */
    @JsonProperty(value = "drm")
    private CbcsDrmConfiguration drm;

    /**
     * Get representing supported protocols.
     *
     * @return the enabledProtocols value
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set representing supported protocols.
     *
     * @param enabledProtocols the enabledProtocols value to set
     * @return the CommonEncryptionCbcs object itself.
     */
    public CommonEncryptionCbcs withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get representing which tracks should not be encrypted.
     *
     * @return the clearTracks value
     */
    public List<TrackSelection> clearTracks() {
        return this.clearTracks;
    }

    /**
     * Set representing which tracks should not be encrypted.
     *
     * @param clearTracks the clearTracks value to set
     * @return the CommonEncryptionCbcs object itself.
     */
    public CommonEncryptionCbcs withClearTracks(List<TrackSelection> clearTracks) {
        this.clearTracks = clearTracks;
        return this;
    }

    /**
     * Get representing default content key for each encryption scheme and separate content keys for specific tracks.
     *
     * @return the contentKeys value
     */
    public StreamingPolicyContentKeys contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set representing default content key for each encryption scheme and separate content keys for specific tracks.
     *
     * @param contentKeys the contentKeys value to set
     * @return the CommonEncryptionCbcs object itself.
     */
    public CommonEncryptionCbcs withContentKeys(StreamingPolicyContentKeys contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

    /**
     * Get configuration of DRMs for current encryption scheme.
     *
     * @return the drm value
     */
    public CbcsDrmConfiguration drm() {
        return this.drm;
    }

    /**
     * Set configuration of DRMs for current encryption scheme.
     *
     * @param drm the drm value to set
     * @return the CommonEncryptionCbcs object itself.
     */
    public CommonEncryptionCbcs withDrm(CbcsDrmConfiguration drm) {
        this.drm = drm;
        return this;
    }

}