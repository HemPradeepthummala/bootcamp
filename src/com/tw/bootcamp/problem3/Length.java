package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {

	private final double value;
	private final LengthUnit unit;

	public Length(double value, LengthUnit unit) {
		this.value = value;
		this.unit = unit;
	}


	public boolean compare(Length other) {
		return this.unit.convertTo(value) == other.unit.convertTo(other.value);
	}

	public Length add(Length other, LengthUnit unit) {
		double result = this.unit.convertTo(this.value) + other.unit.convertTo(other.value);
		return  new Length(unit.convertFrom(result), unit);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Length that = (Length) o;
		return Double.compare(value, that.value) == 0 && unit == that.unit;
	}

	@Override
	public int hashCode() {
		int result = Double.hashCode(value);
		result = 31 * result + Objects.hashCode(unit);
		return result;
	}
}
