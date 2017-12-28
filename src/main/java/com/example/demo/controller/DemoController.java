package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/weather/{city}", method=RequestMethod.GET)
	public ResponseEntity<Weather> fetchCityWeather(@PathVariable String city){
		Weather weather = new Weather();
		weather.setMaxTemp(28);
		weather.setMinTemp(20);
		weather.setName(city);
		return new ResponseEntity<Weather>(weather, HttpStatus.OK);
	}

}
