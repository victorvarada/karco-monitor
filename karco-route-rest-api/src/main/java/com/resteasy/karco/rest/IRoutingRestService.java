package com.resteasy.karco.rest;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.resteasy.karco.entity.RequestRoute;

public interface IRoutingRestService {

	public Response getRouteByRequestRoute(RequestRoute requestRoute);

	public Response getRouteByOriginDestination(String origin, String destination);
	
}
