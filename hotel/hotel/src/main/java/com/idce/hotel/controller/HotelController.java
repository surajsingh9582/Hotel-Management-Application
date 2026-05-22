package com.idce.hotel.controller;

import com.idce.hotel.entities.HotelEntity;
import com.idce.hotel.services.HotelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel")
public class HotelController {
    private final HotelServiceImpl hotelService;
    @PostMapping("/add")
    public ResponseEntity<HotelEntity> addHotel(@RequestBody HotelEntity entity){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.creteHotel(entity));
    }

    @GetMapping("/{name}")
    public  ResponseEntity<HotelEntity> searchHotel(@PathVariable String name){
        return ResponseEntity.ok(hotelService.searchHotel(name));
    }
    @GetMapping
    public List<HotelEntity> getAll(){
        return hotelService.getAll();
    }
}
