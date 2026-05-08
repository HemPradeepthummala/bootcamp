package com.tw.bootcamp.problem3;

import java.util.Objects;

public class BaseLength<T extends LengthUnit> {

	private final double value;
	private final LengthUnit unit;

	public BaseLength(double value, LengthUnit unit) {
		this.value = value;
		this.unit = unit;
	}


	public boolean compare(BaseLength<T> other) {
		return this.unit.convertTo(value) == other.unit.convertTo(other.value);
	}

	public BaseLength<T> add(BaseLength<T> other, LengthUnit unit) {
		double result = this.unit.convertTo(this.value) + other.unit.convertTo(other.value);
		return  new BaseLength<T>(unit.convertFrom(result), unit);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		BaseLength<?> that = (BaseLength<?>) o;
		return Double.compare(value, that.value) == 0 && unit == that.unit;
	}

	@Override
	public int hashCode() {
		int result = Double.hashCode(value);
		result = 31 * result + Objects.hashCode(unit);
		return result;
	}
}
