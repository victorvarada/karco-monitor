package main.java.com.isidis.karco.producer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by Victor on 14/06/2017.
 */
@RestController
public class GreetingControllerImpl implements GreetingController {
    public String greeting(@PathVariable("username") String username) {
        return String.format("Hello %s!\n", username);
    }

    public Response getRouteByOriginDestination(@PathVariable("origin") String origin, @PathVariable("destination") String destination){
        return null;
    }
}