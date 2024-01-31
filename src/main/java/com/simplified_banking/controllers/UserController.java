package com.simplified_banking.controllers;

import com.simplified_banking.domain.user.User;
import com.simplified_banking.dtos.UserDTO;
import com.simplified_banking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
        final User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        final List<User> users =  this.userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
