package com.idce.user.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ratingEntity {
    private String id;
    private String userEmail;
    private String hotelName;
    private Integer rating;
    private String feedback;
    private hotelEntity hotel;
}
