package com.idce.ratings.controllers;

import com.idce.ratings.entities.RatingEntity;
import com.idce.ratings.services.RatingServices;
import com.idce.ratings.services.RatingServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rating")
public class RatingController {
    private final RatingServicesImpl services;
    @PostMapping("/add")
    public ResponseEntity<RatingEntity> addServices(@RequestBody RatingEntity entity){
        return ResponseEntity.status(HttpStatus.CREATED).body((services.addRatings(entity)));
    }
    @GetMapping("/user/{email}")
    public ResponseEntity<List<RatingEntity>> getUserByEmail(@PathVariable String email){
        return ResponseEntity.status(HttpStatus.FOUND).body(services.getRatingByEmail(email));
    }
    @GetMapping("/hotel/{name}")
    public ResponseEntity<List<RatingEntity>> getHotelByName(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.FOUND).body(services.getRatingByHotelName(name));
    }
    @GetMapping
    public ResponseEntity<List<RatingEntity>> getAllData(){
        return ResponseEntity.status(HttpStatus.FOUND).body(services.getAll());
    }
}
