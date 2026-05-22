package com.idce.user.Services.External;

import com.idce.user.Model.hotelEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface externalServices {
    @GetMapping("/hotel/{email}")
    hotelEntity getHotel(@PathVariable String email);
}
