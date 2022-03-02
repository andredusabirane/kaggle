package com.covid.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CovidData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String country;
	private Long Confirmed;
	private Long deaths;
	private Long recovered;
	private Long active;
	private Long newCases;
	private Long newDeaths;
	private Long newRecovered;
	private Double deathsPerHundredCases;
	private Double recoveredPerHundredCases;
	private Double deathsPerHundredRecovered;
	private Long confirmedLastWeek;
	private Long oneWeekChange;
	private Double oneWeekPercentageIncrease;
	private String WHORegion;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getConfirmed() {
		return Confirmed;
	}

	public void setConfirmed(Long confirmed) {
		Confirmed = confirmed;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public Long getRecovered() {
		return recovered;
	}

	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}

	public Long getActive() {
		return active;
	}

	public void setActive(Long active) {
		this.active = active;
	}

	public Long getNewCases() {
		return newCases;
	}

	public void setNewCases(Long newCases) {
		this.newCases = newCases;
	}

	public Long getNewDeaths() {
		return newDeaths;
	}

	public void setNewDeaths(Long newDeaths) {
		this.newDeaths = newDeaths;
	}

	public Long getNewRecovered() {
		return newRecovered;
	}

	public void setNewRecovered(Long newRecovered) {
		this.newRecovered = newRecovered;
	}

	public Double getDeathsPerHundredCases() {
		return deathsPerHundredCases;
	}

	public void setDeathsPerHundredCases(Double deathsPerHundredCases) {
		this.deathsPerHundredCases = deathsPerHundredCases;
	}

	public Double getRecoveredPerHundredCases() {
		return recoveredPerHundredCases;
	}

	public void setRecoveredPerHundredCases(Double recoveredPerHundredCases) {
		this.recoveredPerHundredCases = recoveredPerHundredCases;
	}

	public Double getDeathsPerHundredRecovered() {
		return deathsPerHundredRecovered;
	}

	public void setDeathsPerHundredRecovered(Double deathsPerHundredRecovered) {
		this.deathsPerHundredRecovered = deathsPerHundredRecovered;
	}

	public Long getConfirmedLastWeek() {
		return confirmedLastWeek;
	}

	public void setConfirmedLastWeek(Long confirmedLastWeek) {
		this.confirmedLastWeek = confirmedLastWeek;
	}

	public Long getOneWeekChange() {
		return oneWeekChange;
	}

	public void setOneWeekChange(Long oneWeekChange) {
		this.oneWeekChange = oneWeekChange;
	}

	public Double getOneWeekPercentageIncrease() {
		return oneWeekPercentageIncrease;
	}

	public void setOneWeekPercentageIncrease(Double oneWeekPercentageIncrease) {
		this.oneWeekPercentageIncrease = oneWeekPercentageIncrease;
	}

	public String getWHORegion() {
		return WHORegion;
	}

	public void setWHORegion(String wHORegion) {
		WHORegion = wHORegion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
