package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionTest {
	@Test
	void VoulmeConversion() {
		BaseVolume  liter = new BaseVolume (3.78, VolumeUnit.L);
		BaseVolume  gallon = new BaseVolume (1, VolumeUnit.L);
		boolean isEqual = liter.compare(gallon);
		assertTrue(isEqual);
	}


	@Test
	void compareCentimeterAndMillimeter() {
		BaseLength centimmeter = new BaseLength(1, LengthUnit.CM);
		BaseLength millimeter = new BaseLength(10, LengthUnit.MM);
		assertTrue(centimmeter.compare(millimeter));
	}

	@Test
	void compareCentimeterWithInches() {
		BaseLength centimeter = new BaseLength(5, LengthUnit.CM);
		BaseLength inches = new BaseLength(2, LengthUnit.IN);
		assertTrue(centimeter.compare(inches));
	}

	@Test
	void compareFeetandInch() {
		BaseLength feet = new BaseLength(1, LengthUnit.Feet);
		BaseLength inches = new BaseLength(12, LengthUnit.IN);
		assertTrue(feet.compare(inches));
	}

	@Test
	void additionOfSameType() {
		BaseLength unit1 = new BaseLength(2, LengthUnit.IN);
		BaseLength unit2 = new BaseLength(2, LengthUnit.IN);
		BaseLength result = unit1.add(unit2, LengthUnit.IN);
		assertEquals(new BaseLength(4,LengthUnit.IN),result);
		}

	@Test
	void additionOfDifferentLengthTypes() {
		BaseLength unit1 = new BaseLength(2, LengthUnit.IN);
		BaseLength unit2 = new BaseLength(2.5, LengthUnit.CM);
		BaseLength result = unit1.add(unit2,LengthUnit.IN);
		assertEquals(new BaseLength(3,LengthUnit.IN),result);
	}

	@Test
	void additionOfDifferentVolumeTypes() {
		BaseVolume unit1 = new BaseVolume (1, VolumeUnit.GAL);
		BaseVolume  unit2 = new BaseVolume (1, VolumeUnit.L);
		BaseVolume  result = unit1.add(unit2,VolumeUnit.L);
		assertEquals(new BaseVolume (4.78,VolumeUnit.L),result);
	}
}
