package com.idce.ratings.services;

import com.idce.ratings.Exceptions.ratingNotFoundExceptions;
import com.idce.ratings.entities.RatingEntity;
import com.idce.ratings.repositories.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingServicesImpl implements RatingServices {
    private final RatingRepository repository;
    @Override
    public RatingEntity addRatings(RatingEntity rating) {
        rating.setId(UUID.randomUUID().toString());
        return repository.save(rating);
    }


    @Override
    public List<RatingEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public List<RatingEntity> getRatingByEmail(String email) {
        return repository.findByUserEmail(email);
    }

    @Override
    public List<RatingEntity> getRatingByHotelName(String name) {
        return repository.findByHotelName(name);
    }
}
