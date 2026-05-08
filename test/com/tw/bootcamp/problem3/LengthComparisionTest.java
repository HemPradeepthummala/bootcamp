package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthComparisionTest {
	@Test
	void compareLengths() {
		Inch inch = new Inch(12);
		Feet feet = new Feet(1);
		Inch feetToInch = Inch.toInch(feet);
		assertEquals(inch,feetToInch);
	}
}
