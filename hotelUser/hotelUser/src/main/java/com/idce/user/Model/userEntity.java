package com.idce.user.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Users")
@NoArgsConstructor
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "special_id")
    private String specialId;
    @Column(name="username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "remark")
    private String remark;
    @Transient
    List<ratingEntity> reviewEntities;
}
