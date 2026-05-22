package com.idce.ratings.repositories;

import com.idce.ratings.entities.RatingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<RatingEntity,String> {
    List<RatingEntity> findByUserEmail(String email);

    List<RatingEntity> findByHotelName(String name);
}
