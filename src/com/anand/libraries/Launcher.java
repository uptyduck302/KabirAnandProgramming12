package com.anand.libraries;

import org.apache.commons.io.FileUtils;
import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import java.io.File;
import java.io.IOException;

public class Launcher {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File src = new File("LA.jpg");
        System.out.println(src.getAbsolutePath());
        File out = new File("copied.jpg");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Metadata metadata = ImageMetadataReader.readMetadata(src);
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.println(tag);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
