package com.sb.photomanager.service;

import com.sb.photomanager.models.FileSystemRepo;
import com.sb.photomanager.models.ImageDbRepo;
import com.sb.photomanager.models.documents.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileLocationService {
    @Autowired
    FileSystemRepo fileSystemRepository;
    @Autowired
    ImageDbRepo imageDbRepository;

    public void save(byte[] bytes, String imageName) throws Exception {
        String location = fileSystemRepository.save(bytes, imageName);

        imageDbRepository.save(new Image(imageName, location));
    }
}
