package com.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;
    public ResponseEntity postUser (@RequestBody UserDto userDto){

        User user = new User();
        user.setNome(userDto.getNome());
        user.setCpf(userDto.getCpf());
        return ResponseEntity.ok().body("foi");
    }
}

