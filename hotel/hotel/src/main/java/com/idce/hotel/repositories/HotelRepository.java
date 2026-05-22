package com.idce.hotel.repositories;

import com.idce.hotel.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<HotelEntity,Integer> {
    Optional<HotelEntity> getByName(String email);
}
