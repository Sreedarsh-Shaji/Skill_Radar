package com.srlocator.srLocator.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ApiComms {

    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
