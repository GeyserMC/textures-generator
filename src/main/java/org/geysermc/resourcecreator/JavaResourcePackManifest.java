package org.geysermc.resourcecreator;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class JavaResourcePackManifest {
    @JsonProperty("pack.pack_format")
    private int format;
    @JsonProperty("pack.description")
    private String description;
}


