package com.isidis.karco.monitoring.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Victor on 14/06/2017.
 */
@Service
public class GreetingService {
    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return new RestTemplate()
                .getForObject("http://localhost:9090/greeting/{username}",
                        String.class, username);
    }

    private String defaultGreeting(String username) {
        return "Hello User!";
    }
}
