package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Unit<T> {
	private final double value;
	private final AllUnits unit;

	public Unit(double value, AllUnits unit) {
		this.value = value;
		this.unit = unit;
	}

	public static <T>boolean isEqual(Unit<? extends T> comparator, Unit<? super T> comparend) {
		return comparator.equals(comparend);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Unit<?> unit1 = (Unit<?>) o;
		return Double.compare(value, unit1.value) == 0 && unit == unit1.unit;
	}

	@Override
	public int hashCode() {
		int result = Double.hashCode(value);
		result = 31 * result + Objects.hashCode(unit);
		return result;
	}
}

