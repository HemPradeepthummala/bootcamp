package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionTest {
	@Test
	void VoulmeConversion() {
		Volume liter = new Volume(3.78, VolumeUnit.L);
		Volume gallon = new Volume(1, VolumeUnit.L);
		boolean isEqual = liter.compare(gallon);
		assertTrue(isEqual);
	}


	@Test
	void compareCentimeterAndMillimeter() {
		Length centimmeter = new Length(1, LengthUnit.CM);
		Length millimeter = new Length(10, LengthUnit.MM);
		assertTrue(centimmeter.compare(millimeter));
	}

	@Test
	void compareCentimeterWithInches() {
		Length centimeter = new Length(5, LengthUnit.CM);
		Length inches = new Length(2, LengthUnit.IN);
		assertTrue(centimeter.compare(inches));
	}

	@Test
	void compareFeetandInch() {
		Length feet = new Length(1, LengthUnit.Feet);
		Length inches = new Length(12, LengthUnit.IN);
		assertTrue(feet.compare(inches));
	}

	@Test
	void additionOfSameType() {
		Length unit1 = new Length(2, LengthUnit.IN);
		Length unit2 = new Length(2, LengthUnit.IN);
		Length result = unit1.add(unit2, LengthUnit.IN);
		assertEquals(new Length(4,LengthUnit.IN),result);
		}

	@Test
	void additionOfDifferentLengthTypes() {
		Length unit1 = new Length(2, LengthUnit.IN);
		Length unit2 = new Length(2.5, LengthUnit.CM);
		Length result = unit1.add(unit2,LengthUnit.IN);
		assertEquals(new Length(3,LengthUnit.IN),result);
	}

	@Test
	void additionOfDifferentVolumeTypes() {
		Volume unit1 = new Volume(1, VolumeUnit.GAL);
		Volume unit2 = new Volume(1, VolumeUnit.L);
		Volume result = unit1.add(unit2,VolumeUnit.L);
		assertEquals(new Volume(4.78,VolumeUnit.L),result);
	}

	@Test
	void compareTemperatures() {
		Temperature farenheit = new Temperature(212, TemparatureUnit.F);
		Temperature celcius = new Temperature(100, TemparatureUnit.C);
		assertTrue(farenheit.compare(celcius));
	}

}
