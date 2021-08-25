package com.sb.photomanager.models;

import com.sb.photomanager.models.entity.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageDbRepo extends MongoRepository<Image, String> {
}
