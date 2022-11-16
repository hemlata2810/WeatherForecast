package com.weather.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.weather.api.WeatherForecastService;
import com.weather.dto.WeatherForecastDto;
import com.weather.model.WeatherForecastEntity;
import com.weather.repository.WeatherForecastRepository;

@Service
@Transactional
@RestController
public class WeatherForecastServiceImpl implements WeatherForecastService {

	@Resource
	private WeatherForecastRepository weatherForecastRepository;

	public String findAll() {
//		List<WeatherForecastEntity> entities = (List<WeatherForecastEntity>) weatherForecastRepository.findAll();
//		entities.stream().map(this::converToDto).collect(Collectors.toList());
		return "Hello World";
	}

	private WeatherForecastDto converToDto(WeatherForecastEntity entity) {
		WeatherForecastDto weatherForecast = new WeatherForecastDto();
		weatherForecast.setId(entity.getId());
		weatherForecast.setTitle(entity.getTitle());
		return weatherForecast;
	}

}
