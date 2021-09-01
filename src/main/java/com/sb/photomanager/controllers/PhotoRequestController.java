package com.sb.photomanager.controllers;

import com.sb.photomanager.models.ImageDbRepo;
import com.sb.photomanager.service.FileLocationService;
import com.sb.photomanager.util.ResponseTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController("/")
public class PhotoRequestController {

    @Autowired
    private FileLocationService fileLocationService;
    @Autowired
    private ImageDbRepo imageDbRepo;

    Logger logger = Logger.getLogger(PhotoRequestController.class.getName());

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer getPageData(String userId){
        return new ResponseTransfer("Photo App");
    }

    @GetMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer getImageDetails(String imageId, String userId){
        return new ResponseTransfer("Image Uploaded");
    }

    @PostMapping(value = "/image", produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer saveImage(@RequestParam MultipartFile imageFile){

        try {
            logger.log(Level.INFO, "Request received to save image");
            fileLocationService.save(imageFile.getBytes(), imageFile.getName());
        } catch (Exception e){
            logger.log(Level.ALL, "Couldn't upload image: "+e.getMessage());
            return new ResponseTransfer("Image couldn't be Uploaded");
        }
        return new ResponseTransfer("Image Uploaded");
    }


}
