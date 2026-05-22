package com.idce.hotel.services;

import com.idce.hotel.Exception.UserNotFoundException;
import com.idce.hotel.entities.HotelEntity;
import com.idce.hotel.repositories.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService{
    private final HotelRepository repository;
    @Override
    public HotelEntity creteHotel(HotelEntity entity) {
        return repository.save(entity);
    }

    @Override
    public HotelEntity searchHotel(String name) {
        return repository.getByName(name).orElseThrow(()->new UserNotFoundException("Hotel not found"));
    }

    @Override
    public List<HotelEntity> getAll() {
        return repository.findAll();
    }
}
