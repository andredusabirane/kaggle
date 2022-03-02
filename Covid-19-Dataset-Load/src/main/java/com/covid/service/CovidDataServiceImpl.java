package com.covid.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.domain.CovidData;
import com.covid.repository.CovidDataRepository;

@Service
public class CovidDataServiceImpl implements CovidDataService {

	@Autowired
	private CovidDataRepository covidDataRepository;

	@Override
	public Optional<CovidData> findById(UUID id) {
		return covidDataRepository.findById(id);
	}

	@Override
	public List<CovidData> findAll() {
		return covidDataRepository.findAll();
	}

	@Override
	public CovidData create(CovidData country) {
		return covidDataRepository.save(country);
	}

	@Override
	public CovidData edit(CovidData covidData) {
		return covidDataRepository.save(covidData);
	}

	@Override
	public void deleteAll() {
		covidDataRepository.deleteAll();
	}

}
