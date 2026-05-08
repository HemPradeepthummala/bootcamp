package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthComparisionTest {
	@Test
	void compareInchToFeet() {
		Inch inch = new Inch(12);
		Feet feet = new Feet(1);
		Boolean isEqual = inch.compareWithInches(feet);
		assertTrue(isEqual);
	}

	@Test
	void compareInchToCentimeter() {
		Inch inch = new Inch(2);
		Centimeter centimeter = new Centimeter(5);
		boolean isEqual = inch.compareWithCentimeter(centimeter);
		assertTrue(isEqual);
	}
	
}
