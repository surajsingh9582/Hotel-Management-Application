package com.idce.user.Services;

import com.idce.user.Exception.userNotFoundException;
import com.idce.user.Model.hotelEntity;
import com.idce.user.Model.ratingEntity;
import com.idce.user.Model.userEntity;
import com.idce.user.Repositories.userRepository;
import com.idce.user.Services.External.externalServices;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class implUserService implements userService {
    private final userRepository repository;
    private final RestTemplate restTemplate;
    private final externalServices services;
    private final Logger logger= LoggerFactory.getLogger(userService.class);

    //create users
    @Override
    public userEntity createUsers(userEntity user) {
        user.setSpecialId(UUID.randomUUID().toString());
        return repository.save(user);
    }

    @Override
    public userEntity getData(String email) {
        userEntity user=repository.getByEmail(email).orElseThrow(()->new userNotFoundException("User not found exception"));
        ratingEntity[] ratingOfUser=restTemplate.getForObject("http://RATINGS-SERVICE/rating/user/"+user.getEmail(), ratingEntity[].class);
        assert ratingOfUser != null;
        List<ratingEntity>ratings=Arrays.stream(ratingOfUser).toList();
        logger.info("{} ",ratings);
        List<ratingEntity> ratingList=ratings.stream().map(rating->{
//            ResponseEntity<hotelEntity> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotel/"+rating.getHotelName(), hotelEntity.class);
//            hotelEntity entity=forEntity.getBody();
            hotelEntity entity=services.getHotel(rating.getHotelName());
//            logger.info("response status code : {}",forEntity.getStatusCode());
            rating.setHotel(entity);
            return rating;
        }).collect(Collectors.toList());
        user.setReviewEntities(ratings);
        return user;
    }

    @Override
    public List<userEntity> getAllData() {
        return repository.findAll();
    }
}
