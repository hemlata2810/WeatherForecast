package com.weather.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weather.model.WeatherForecastEntity;

@Repository
public interface WeatherForecastRepository extends CrudRepository<WeatherForecastEntity, Long>{

}
