package com.idce.hotel.services;

import com.idce.hotel.entities.HotelEntity;

import java.util.List;

public interface HotelService {
    HotelEntity creteHotel(HotelEntity entity);
    HotelEntity searchHotel(String email);
    List<HotelEntity> getAll();
}
