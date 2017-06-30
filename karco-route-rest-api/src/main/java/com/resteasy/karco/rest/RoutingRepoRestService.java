package com.resteasy.karco.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.appengine.repackaged.com.google.gson.Gson;

@Path("/routingRepo")
public class RoutingRepoRestService implements IRoutingRepoRestService{

	private Gson gson = new Gson();
	
	@Override
	@POST
	@Path("/add")
	@Produces("application/json")
	public Response saveRoute(Object route) {
		return null;
	}

}
