package com.resteasy.karco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resteasy.karco.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long>{
	

}
