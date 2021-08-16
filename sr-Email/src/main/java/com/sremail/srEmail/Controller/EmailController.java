package com.sremail.srEmail.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/sample")
public class EmailController {

    @GetMapping("/class-info")
    public String info()
    {
        return "com.sremail.srEmail.Controller.EmailController";
    }

}