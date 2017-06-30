package com.isidis.karco.monitoring.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor on 29/06/2017.
 */

@Controller
public class RouteController {
    @Autowired
    private RouteClient routeClient;

    @RequestMapping("/get-route/{origin}/{destination}")
    public String getRoute(Model model, @PathVariable("origin") String origin, @PathVariable("destination") String destination) {
        model.addAttribute("greeting", routeClient.getRouteByOriginDestination(origin, destination));
        return "greeting-view";
    }

}
