package com.live.spaces.sageniuz.katas.stringcalculator.vers1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	@Test
	public void return_zero_if_empty_string_was_passed() throws Exception {
		check(0, "");
	}

	protected void check(int expected, String input) {
		assertEquals(expected, new StringCalculator().add(input));
	}

	@Test
	public void return_integer_representation_of_single_passed_string_value() throws Exception {
		check(1, "1");
		check(2, "2");
	}

	@Test
	public void add_comma_separated_values() throws Exception {
		check(3, "1,2");
		check(17, "8,9");
		check(30, "10,20");
		check(60, "10,20,30");
		check(100, "10,20,30,40");
	}

}
