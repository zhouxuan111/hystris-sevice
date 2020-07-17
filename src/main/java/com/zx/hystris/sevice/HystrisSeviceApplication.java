package com.zx.hystris.sevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class HystrisSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrisSeviceApplication.class, args);
    }

}
