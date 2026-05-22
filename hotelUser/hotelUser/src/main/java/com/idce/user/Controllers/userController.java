package com.idce.user.Controllers;

import com.idce.user.Model.userEntity;
import com.idce.user.Services.implUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class userController {
    private final implUserService userService;
    private final RestTemplate restTemplate;
    //create users
    @PostMapping("/add")
    public ResponseEntity<userEntity> createUser(@RequestBody userEntity user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUsers(user));
    }
    //search user
    @GetMapping("/{email}")
    public userEntity getData(@PathVariable String email){
        return userService.getData(email);
    }
    @GetMapping
    public List<userEntity> getAllData(){
        return userService.getAllData();
    }
}
