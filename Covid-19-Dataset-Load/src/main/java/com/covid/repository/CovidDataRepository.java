package com.covid.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.domain.CovidData;

public interface CovidDataRepository extends JpaRepository<CovidData, UUID> {

}
