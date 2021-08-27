package com.sb.photomanager.models.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Document
public class Image {
    @Id
    @GeneratedValue
    Long imageId;

    String name;
    String location;

    public Image(String imageName, String location) {
    }
}
