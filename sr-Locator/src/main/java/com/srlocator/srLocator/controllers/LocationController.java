package com.srlocator.srLocator.controllers;


import com.srlocator.srLocator.dao.User;
import com.srlocator.srLocator.services.LocationService;
import com.srlocator.srLocator.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/location/v1")
public class LocationController {

    @Autowired
    LocationService service;

    /* Returns controller info */
    @GetMapping("/info")
    public String controllerInfo() {
        return "com.srlocator.srLocator.controllers.LocationController";
    }

    /* Adds a new dummy Location into the system */
    @PostMapping("/add-location")
    public ResponseEntity<Object> addDummyUser(@RequestBody User user) {
        if (service.addNewLocationDummy(user)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("Already exists");
        }
    }

    /* Gets all location data from the system */
    @GetMapping("/all-locations")
    public ResponseEntity<Object> allDummyUser() {
        return new ResponseEntity<>( service.getAllLocations() , HttpStatus.OK);
    }

    /* Gets all location data from the system */
    @GetMapping("/user-location/{userID}")
    public ResponseEntity<Object> aDummyUser(@PathVariable("userID") int userId){
        return new ResponseEntity<>( service.getLocationByIdDummy(userId) , HttpStatus.OK);
    }


}