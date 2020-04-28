package org.geysermc.resourcecreator;

import java.io.File;

public class Resource {
    private String path;
    private File mod;
    private String nameSpace;
    private String textureName;
    private int state;

    public Resource(String path, File mod, String nameSpace, String textureName, int state) {
        this.path = path;
        this.mod = mod;
        this.nameSpace = nameSpace;
        this.textureName = textureName;
        this.state = state;
    }

    public File getMod() {
        return mod;
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public String getPath() {
        return path;
    }

    public String getTextureName() {
        return textureName;
    }

    public int getState() {
        return state;
    }
}
