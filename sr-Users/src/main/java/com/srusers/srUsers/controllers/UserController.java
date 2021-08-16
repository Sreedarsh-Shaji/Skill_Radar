package com.srusers.srUsers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/users/v1")
public class UserController {

    /* Returns controller info */
    @GetMapping("/info")
    public String controllerInfo()
    {
        return "com.srusers.srUsers.controllers.UserController";
    }

}
