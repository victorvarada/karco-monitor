package com.isidis.karco.monitoring.Main;

/**
 * Created by Victor on 26/06/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
@EnableHystrixDashboard
public class RestConsumerFeignApplication {
    public static void main(String[] args){
        SpringApplication.run(RestConsumerFeignApplication.class, args);
    }
}
