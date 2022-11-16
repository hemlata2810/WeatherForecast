package com.weather.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;

@Path("weatherForecastService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface WeatherForecastService {
	@GET
	@Path("/findAll")
	@RequestMapping("/findAll")
	public String findAll();
}
