package com.idce.ratings.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_rating")
@Data
@AllArgsConstructor
@Builder
public class RatingEntity {
    @Id
    private String id;
    private String userEmail;
    private String hotelName;
    private Integer rating;
    private String feedback;
}
