package com.example.api.apis;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApiRepository extends MongoRepository<Comic, ObjectId> {

}
