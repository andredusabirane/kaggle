package com.covid.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.covid.domain.CovidData;

public interface CovidDataService {

	public Optional<CovidData> findById(UUID id);

	public List<CovidData> findAll();

	public CovidData create(CovidData covidData);

	public CovidData edit(CovidData covidData);
	
	public void deleteAll();

}
