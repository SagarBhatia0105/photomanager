package com.sb.photomanager.models;

import com.sb.photomanager.models.documents.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDbRepo extends MongoRepository<Image, String> {
}
