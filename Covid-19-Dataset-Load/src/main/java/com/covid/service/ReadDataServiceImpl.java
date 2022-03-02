package com.covid.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.domain.CovidData;
import com.covid.util.KaggleConstant;
import com.covid.util.KaggleUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@Service
public class ReadDataServiceImpl implements ReadDataService {

	Logger logger = LoggerFactory.getLogger(ReadDataService.class);

	@Autowired
	CovidDataService covidDataService;

	@Override
	public void readData() {
		// String fileName = "c:\\test\\csv\\country.csv";
		String fileName = KaggleConstant.FILE_PATH + "\\" + KaggleConstant.FILE_NAME;

		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
			List<String[]> r;
			r = reader.readAll();
			// This line will print data to the console
			// r.forEach(x -> System.out.println(Arrays.toString(x)));

			if (r.size() > 0) {
				logger.info(">>>>>>>>>>>>>>>> Deleting old data in progress..........");
				covidDataService.deleteAll();
				logger.info(">>>>>>>>>>>>>>>> Deleting old data in completed..........");

				logger.info(">>>>>>>>>>>>>>>> Number of line on file: ", r.size() - 1);
				logger.info(">>>>>>>>>>>>>>>> Storing Data In Progress.........");
				r.forEach(data -> {
					CovidData obj = new CovidData();
					if (!data[0].equals("Country/Region")) {
						obj.setCountry(data[0]);
						obj.setConfirmed(KaggleUtil.longCoverter(data[1]));
						obj.setDeaths(KaggleUtil.longCoverter(data[2]));
						obj.setRecovered(KaggleUtil.longCoverter(data[3]));
						obj.setActive(KaggleUtil.longCoverter(data[4]));
						obj.setNewCases(KaggleUtil.longCoverter(data[5]));
						obj.setNewDeaths(KaggleUtil.longCoverter(data[6]));
						obj.setNewRecovered(KaggleUtil.longCoverter(data[7]));
						obj.setDeathsPerHundredCases(KaggleUtil.doubleCoverter(data[8]));
						obj.setRecoveredPerHundredCases(KaggleUtil.doubleCoverter(data[9]));
						obj.setDeathsPerHundredRecovered(KaggleUtil.doubleCoverter(data[10]));
						obj.setConfirmedLastWeek(KaggleUtil.longCoverter(data[11]));
						obj.setOneWeekChange(KaggleUtil.longCoverter(data[12]));
						obj.setOneWeekPercentageIncrease(KaggleUtil.doubleCoverter(data[13]));
						obj.setWHORegion(data[14]);
						covidDataService.create(obj);
					}
				});
				logger.info(">>>>>>>>>>>>>>>> Storing Data Completed.........");
			} else {
				logger.warn("!!!!!!!!!!!!!! The file is empty!!!!!!!!!!!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
