package com.srusers.srUsers.controllers;

import com.srusers.srUsers.dao.User;
import com.srusers.srUsers.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/users/v1")
public class UserController {

    UserService service;

    /* Returns controller info */
    @GetMapping("/info")
    public String controllerInfo() {
        return "com.srusers.srUsers.controllers.UserController";
    }

    /* Adds a new dummy user into the system */
    @PostMapping("/add-user")
    public ResponseEntity<Object> addDummyUser(@RequestBody User user) {
        if (service.addNewUserDummy(user)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("Already exists");
        }
    }
}