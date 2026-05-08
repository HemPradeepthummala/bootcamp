package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthComparisionTest {
	@Test
	void compareInchToFeet() {
		Inch inch = Inch.createInch(12);
		Feet feet = Feet.createFeet(1);
		Boolean isEqual = inch.compareWithInches(feet);
		assertTrue(isEqual);
	}

	@Test
	void compareInchToCentimeter() {
		Inch inch = Inch.createInch(2);
		Centimeter centimeter = Centimeter.createCentimeter(5);
		boolean isEqual = inch.compareWithCentimeter(centimeter);
		assertTrue(isEqual);
	}
	
}
