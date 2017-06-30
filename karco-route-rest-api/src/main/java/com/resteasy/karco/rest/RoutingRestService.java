package com.resteasy.karco.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.resteasy.karco.entity.RequestRoute;
import com.resteasy.karco.entity.Route;
import com.resteasy.karco.service.RouteService;
import fr.ippon.spark.metrics.MetricsReceiver;
import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

@Path("/routing")
public class RoutingRestService implements IRoutingRestService {

	GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyCD4IlK4h1FsENe1tTO-1slUA6JbPLA-KY");
	DirectionsApiRequest request = DirectionsApi.newRequest(context);
	DirectionsResult result;
	RouteService routeService = new RouteService();

	@POST
	@Path("/get")
	@Produces("application/json")
	public Response getRouteByRequestRoute(RequestRoute requestRoute) {

		request.origin(requestRoute.getOrigin());

		request.destination(requestRoute.getDestination());

//		for (int i = 0; i < requestRoute.getListGeoPoint().size(); i++) {
//			request.waypoints(requestRoute.getListGeoPoint().get(i).getTown());
//		}

		// Optimisation du trajet en fonction des points de passage
        request.optimizeWaypoints(true);

		try {
			result = request.await();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();

	}

	@Override
	@GET
	@Path("/getRoute/{origin}/{destination}")
	@Produces("application/json")
	public Response getRouteByOriginDestination(@PathParam("origin") String origin,
			@PathParam("destination") String destination) {
		
		request.origin(origin);
		request.destination(destination);

		try {
			// Traitement de la requête
			result = request.await();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*SparkConf conf = new SparkConf()
				.setAppName("MetricsToConsole")
				.setMaster("local[2]");

		JavaStreamingContext ssc = new JavaStreamingContext(conf, new Duration(5000));

		ssc.receiverStream(new MetricsReceiver(9999)).print();

		ssc.start();
		ssc.awaitTermination();*/

/*
        Route r = new Route();
        r.setId((long) 1);
        r.setStatus("Completed");
        r.setStartAddress("Paris");
        r.setEndAddress("Marseilles");
        routeService.add(r);*/

		return Response.ok().entity(result).build();
	}

}