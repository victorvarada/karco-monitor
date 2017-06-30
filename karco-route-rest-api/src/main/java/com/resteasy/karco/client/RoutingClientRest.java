package com.resteasy.karco.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.resteasy.karco.service.RouteService;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import com.resteasy.karco.entity.RequestRoute;
import com.resteasy.karco.entity.Route;

public class RoutingClientRest {

	ClientRequest request = new ClientRequest("http://localhost:8080/rest/routing/get");

	public void getRouteByRequest(RequestRoute requestRoute) {

		RouteService routeService = new RouteService();

		try {
			request.accept("application/json");

			request.body("application/json", requestRoute);

			ClientResponse<String> response = request.post(String.class);

//			if (response.getStatus() != 200) {
//				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//			}

			BufferedReader br = new BufferedReader(
					new InputStreamReader(new ByteArrayInputStream(response.getEntity().getBytes())));

			String output;
			System.out.println("Output from server ... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			Route r = new Route();
			r.setId((long) 1);
			r.setStatus("Completed");
			r.setStartAddress("Paris");
			r.setEndAddress("Marseilles");
			routeService.add(r);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RoutingClientRest clientRest = new RoutingClientRest();
		RequestRoute rr = new RequestRoute();
		rr.setDestination("Marseille");
		rr.setOrigin("Paris");
		System.out.println(rr.getOrigin() + " " + rr.getDestination());
		clientRest.getRouteByRequest(rr);
	}

}
