package com.sb.photomanager.controllers;

import com.sb.photomanager.util.ResponseTransfer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PhotoRequestController {

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
    public ResponseTransfer saveImage(String userId){
        return new ResponseTransfer("Image Uploaded");
    }


}
