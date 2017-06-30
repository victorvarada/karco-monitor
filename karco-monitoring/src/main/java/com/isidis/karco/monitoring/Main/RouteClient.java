package com.isidis.karco.monitoring.Main;

import main.java.com.isidis.karco.producer.RouteController;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Victor on 29/06/2017.
 */
@FeignClient(
        name = "rest-route-producer",
        url = "http://localhost:9090"
)
public interface RouteClient extends RouteController {

}