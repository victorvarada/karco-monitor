package com.isidis.karco.monitoring.Main;

import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
//import com.isidis.karco.producer.GreetingController;

/**
 * Created by Victor on 26/06/2017.
 */

@FeignClient(
        name = "rest-producer",
        url = "http://localhost:9090"
)
public interface GreetingClient extends IGreetingController {

}
