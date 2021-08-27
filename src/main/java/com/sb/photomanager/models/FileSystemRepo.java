package com.sb.photomanager.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@Repository
public class FileSystemRepo {

    @Value("storage_location")
    private String storageLocation;

    public String save(byte[] imageContent, String imageName) throws Exception{
            Path newFile = Paths.get(storageLocation.concat(File.pathSeparator).concat(String.valueOf(new Date().getTime())).concat("_").concat(imageName));
            Files.createDirectories(newFile.getParent());
            Files.write(newFile, imageContent);

            return newFile.toAbsolutePath().toString();

    }

}
