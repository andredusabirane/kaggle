package com.covid.util;

public class KaggleUtil {

	public static Long longCoverter(String input) {
		Long output = 0L;
		try {
			output = Long.parseLong(input);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return output;
	}

	public static Double doubleCoverter(String input) {
		Double output = 0.0;
		try {
			output = Double.parseDouble(input);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return output;
	}

}
