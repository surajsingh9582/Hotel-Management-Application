package com.idce.user.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class hotelEntity {
    private Integer hotelId;
    private String name;
    private String detail;
    private String location;
}
