/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response for a Get Frames request.
 */
public class Frames {
    /**
     * Id of the review.
     */
    @JsonProperty(value = "ReviewId")
    private String reviewId;

    /**
     * The videoFrames property.
     */
    @JsonProperty(value = "VideoFrames")
    private List<Frame> videoFrames;

    /**
     * Get the reviewId value.
     *
     * @return the reviewId value
     */
    public String reviewId() {
        return this.reviewId;
    }

    /**
     * Set the reviewId value.
     *
     * @param reviewId the reviewId value to set
     * @return the Frames object itself.
     */
    public Frames withReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    /**
     * Get the videoFrames value.
     *
     * @return the videoFrames value
     */
    public List<Frame> videoFrames() {
        return this.videoFrames;
    }

    /**
     * Set the videoFrames value.
     *
     * @param videoFrames the videoFrames value to set
     * @return the Frames object itself.
     */
    public Frames withVideoFrames(List<Frame> videoFrames) {
        this.videoFrames = videoFrames;
        return this;
    }

}