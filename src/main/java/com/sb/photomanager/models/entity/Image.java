package com.sb.photomanager.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Image {
    @Id
    @GeneratedValue
    Long imageId;

    String name;
    String location;
}
