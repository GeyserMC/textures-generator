package org.geysermc.resourcecreator;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.Arrays;

public class Main {
    static final ObjectMapper JSON_MAPPER = new ObjectMapper().enable(JsonParser.Feature.ALLOW_COMMENTS);
    static final ResourcePack RESOURCE_PACK = new ResourcePack();

    private static final File HASHES = new File("hashes");
    private static final File MODS = new File("mods");
    private static final File RESOURCES = new File("packs");
    private static final File OUTPUT = new File("output");

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        HASHES.mkdir();
        MODS.mkdir();
        RESOURCES.mkdir();
        OUTPUT.mkdir();

        String string = "";
        for(File file : HASHES.listFiles()) {
            string+=(file.getName() + "=" + Arrays.toString(getHash(file)) + "\n");
        }

        try (FileOutputStream stream = new FileOutputStream("output/hashes.txt")) {
            stream.write(string.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static byte[] getHash(File pack) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(pack.toPath()));
        } catch (Exception e) {
            throw new IllegalStateException("Unable to get hash of pack", e);
        }
    }

}
