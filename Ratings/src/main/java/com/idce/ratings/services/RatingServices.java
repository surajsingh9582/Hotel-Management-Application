package com.idce.ratings.services;

import com.idce.ratings.entities.RatingEntity;

import java.util.List;

public interface RatingServices {
    RatingEntity addRatings(RatingEntity rating);
    List<RatingEntity> getAll();
    List<RatingEntity> getRatingByEmail(String email);
    List<RatingEntity> getRatingByHotelName(String name);
}
