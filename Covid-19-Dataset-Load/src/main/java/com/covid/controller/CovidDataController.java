package com.covid.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.domain.CovidData;
import com.covid.service.CovidDataService;
import com.covid.service.ReadDataService;

@RestController
public class CovidDataController {

	@Autowired
	CovidDataService covidDataService;
	@Autowired
	ReadDataService readDataService;

	@GetMapping("/covid-data")
	public ResponseEntity<List<CovidData>> findAll() {
		List<CovidData> result = covidDataService.findAll();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/covid-data/{id}")
	public ResponseEntity<CovidData> findOne(UUID id) {
		CovidData result = covidDataService.findById(id).get();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PostMapping("/covid-data")
	public ResponseEntity<CovidData> create(CovidData data) {
		CovidData result = covidDataService.create(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@GetMapping("/read-data")
	public ResponseEntity<Void> readDataFromFile() {
		readDataService.readData();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
