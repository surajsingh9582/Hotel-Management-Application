package com.idce.user.Services;

import com.idce.user.Model.userEntity;

import java.util.List;

public interface userService {
    //create users
    userEntity createUsers(userEntity user);
    //get 1 data
    userEntity getData(String email);
    //get all data
    List<userEntity> getAllData();
}
