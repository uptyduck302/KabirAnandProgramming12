package com.anand.libraries;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;

public class Launcher {
    public static void main(String[] args) {
        // Update the path to your image file
        File file = new File("resources/test.jpg");

        try {
            Metadata metadata = ImageMetadataReader.readMetadata(file);

            // Iterate over directories and tags
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
