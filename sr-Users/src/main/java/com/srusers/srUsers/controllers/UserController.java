package com.srusers.srUsers.controllers;

import com.srusers.srUsers.dao.Location;
import com.srusers.srUsers.dao.User;
import com.srusers.srUsers.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping( value = "/users/v1")
public class UserController {

    @Autowired
    UserService service;

    @Autowired
    RestTemplate template;

    @Autowired
    WebClient.Builder builder;

    /* Returns controller info */
    @GetMapping("/info")
    public String controllerInfo() {
        return "com.srusers.srUsers.controllers.UserController";
    }

    /* Adds a new dummy user into the system */
    @PostMapping("/add-user")
    public ResponseEntity<Object> addDummyUser(@RequestBody User user) {
        if (service.addNewUser(user)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("Already exists");
        }
    }

    /* Get a user form the system */
    @GetMapping("/get-id/{id}")
    public User getAUserById(@PathVariable("id") int id)
    {
        return service.getUserByIdDummy(id);
    }

    /* Respond with the latest user location */
    @GetMapping("/get-latest-loc/{id}")
    public ResponseEntity<Object> getLatestUserLocation(@PathVariable("id") int id)
    {
        //return new ResponseEntity<Object>(template.getForObject("http://localhost:8093/location/v1/user-location/"+id, Location.class), HttpStatus.OK);

        return new ResponseEntity<Object>(
                builder.build().get().uri("http://LOCATION-MICRO-SERVICE/location/v1/user-location/"+id)
                        .retrieve().bodyToMono(Location.class).block()
                , HttpStatus.OK );

    }

    /* Adds a new dummy user into the system */
    @GetMapping("/all-users")
    public ResponseEntity<Object> allDummyUser() {
        return new ResponseEntity<>( service.getAllUsers() , HttpStatus.OK);
    }

}
