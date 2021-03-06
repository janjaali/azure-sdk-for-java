/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ImageCreateStatus.
 */
public final class ImageCreateStatus extends ExpandableStringEnum<ImageCreateStatus> {
    /** Static value OK for ImageCreateStatus. */
    public static final ImageCreateStatus OK = fromString("OK");

    /** Static value OKDuplicate for ImageCreateStatus. */
    public static final ImageCreateStatus OKDUPLICATE = fromString("OKDuplicate");

    /** Static value ErrorSource for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_SOURCE = fromString("ErrorSource");

    /** Static value ErrorImageFormat for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_IMAGE_FORMAT = fromString("ErrorImageFormat");

    /** Static value ErrorImageSize for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_IMAGE_SIZE = fromString("ErrorImageSize");

    /** Static value ErrorStorage for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_STORAGE = fromString("ErrorStorage");

    /** Static value ErrorLimitExceed for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_LIMIT_EXCEED = fromString("ErrorLimitExceed");

    /** Static value ErrorTagLimitExceed for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_TAG_LIMIT_EXCEED = fromString("ErrorTagLimitExceed");

    /** Static value ErrorRegionLimitExceed for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_REGION_LIMIT_EXCEED = fromString("ErrorRegionLimitExceed");

    /** Static value ErrorUnknown for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_UNKNOWN = fromString("ErrorUnknown");

    /** Static value ErrorNegativeAndRegularTagOnSameImage for ImageCreateStatus. */
    public static final ImageCreateStatus ERROR_NEGATIVE_AND_REGULAR_TAG_ON_SAME_IMAGE = fromString("ErrorNegativeAndRegularTagOnSameImage");

    /**
     * Creates or finds a ImageCreateStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ImageCreateStatus
     */
    @JsonCreator
    public static ImageCreateStatus fromString(String name) {
        return fromString(name, ImageCreateStatus.class);
    }

    /**
     * @return known ImageCreateStatus values
     */
    public static Collection<ImageCreateStatus> values() {
        return values(ImageCreateStatus.class);
    }
}
