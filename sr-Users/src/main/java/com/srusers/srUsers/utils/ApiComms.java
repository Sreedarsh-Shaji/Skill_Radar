package com.srusers.srUsers.utils;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiComms {

    @Bean
    @Deprecated
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    @LoadBalanced
    public WebClient.Builder webClient()
    {
        return WebClient.builder();
    }

}
