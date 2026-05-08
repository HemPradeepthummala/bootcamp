package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConversionTest {
	@Test
	void VoulmeConversion() {
		BaseVolume<VolumeUnit> liter = new BaseVolume<VolumeUnit>(3.78, VolumeUnit.L);
		BaseVolume<VolumeUnit> gallon = new BaseVolume<VolumeUnit>(1, VolumeUnit.L);
		boolean isEqual = liter.compare(gallon);
		assertTrue(isEqual);
	}

	@Test
	void compareCentimeterAndMillimeter() {
		BaseLength<LengthUnit> centimmeter = new BaseLength<>(1, LengthUnit.CM);
		BaseLength<LengthUnit> millimeter = new BaseLength<>(10, LengthUnit.MM);
		assertTrue(centimmeter.compare(millimeter));
	}

	@Test
	void compareCentimeterWithInches() {
		BaseLength<LengthUnit> centimeter = new BaseLength<>(5, LengthUnit.CM);
		BaseLength<LengthUnit> inches = new BaseLength<>(2, LengthUnit.IN);
		assertTrue(centimeter.compare(inches));
	}

	@Test
	void compareFeetandInch() {
		BaseLength<LengthUnit> feet = new BaseLength<>(1, LengthUnit.Feet);
		BaseLength<LengthUnit> inches = new BaseLength<>(12, LengthUnit.IN);
		assertTrue(feet.compare(inches));
	}

	@Test
	void additionOfSameType() {
		BaseLength<LengthUnit> unit1 = new BaseLength<>(2, LengthUnit.IN);
		BaseLength<LengthUnit> unit2 = new BaseLength<>(2, LengthUnit.IN);
		BaseLength<LengthUnit> result = unit1.add(unit2, LengthUnit.IN);
		assertEquals(new BaseLength<LengthUnit>(4,LengthUnit.IN),result);
		}

	@Test
	void additionOfDifferentType() {
		BaseLength<LengthUnit> unit1 = new BaseLength<>(2, LengthUnit.IN);
		BaseLength<LengthUnit> unit2 = new BaseLength<>(2.5, LengthUnit.CM);
		BaseLength<LengthUnit> result = unit1.add(unit2,LengthUnit.IN);
		assertEquals(new BaseLength<LengthUnit>(3,LengthUnit.IN),result);
	}

}
