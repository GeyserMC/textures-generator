package org.geysermc.resourcecreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourcePack {
    private List<Resource> resources = new ArrayList<>();

    public void addResource(Resource resource) {
        resources.add(resource);
    }

    public List<Resource> getResources() {
        return resources;
    }

    public Map<String, Object> manifest() {
        Map<String, Object> main = new HashMap<>();

        main.put("", "");
        return null;
    }
}
