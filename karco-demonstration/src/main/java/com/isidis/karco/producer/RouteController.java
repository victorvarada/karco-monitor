package main.java.com.isidis.karco.producer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Victor on 29/06/2017.
 */
public interface RouteController {
    @RequestMapping("/route/{origin}/{destination}")
    @Produces("application/json")
    public Response getRouteByOriginDestination(@PathVariable("origin") String origin, @PathVariable("destination") String destination);
}
