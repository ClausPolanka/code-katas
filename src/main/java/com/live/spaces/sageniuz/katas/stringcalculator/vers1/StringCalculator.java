package com.live.spaces.sageniuz.katas.stringcalculator.vers1;

public class StringCalculator {

	public int add(String s) {
		int comma = s.indexOf(',');
		if (comma < 0) {
			return toInt(s);
		}
		return toInt(s.substring(0, comma)) + add(s.substring(comma + 1));
	}

	protected int toInt(String s) {
		return s.isEmpty() ? 0 : Integer.parseInt(s);
	}

}
