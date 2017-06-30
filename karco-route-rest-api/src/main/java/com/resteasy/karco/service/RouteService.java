package com.resteasy.karco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.resteasy.karco.entity.Route;
import com.resteasy.karco.repository.RouteRepository;

@Component
public class RouteService {

	@Autowired
    private RouteRepository routeRepository;
	
	@Transactional
    public void add(Route route) {
        routeRepository.save(route);
    }
}
