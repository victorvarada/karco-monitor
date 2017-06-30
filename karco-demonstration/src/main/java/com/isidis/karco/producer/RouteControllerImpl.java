package main.java.com.isidis.karco.producer;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;


/**
 * Created by Victor on 29/06/2017.
 */

@RestController
public class RouteControllerImpl implements RouteController{

    GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyCD4IlK4h1FsENe1tTO-1slUA6JbPLA-KY");
    DirectionsApiRequest request = DirectionsApi.newRequest(context);
    DirectionsResult result;
    //RouteService routeService = new RouteService();

    @Override
    public Response getRouteByOriginDestination(@PathVariable("origin") String origin, @PathVariable("destination") String destination) {
        request.origin(origin);
        request.destination(destination);

        try {
            // Traitement de la requête
            result = request.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Response.ok().entity(result).build();
    }
}
