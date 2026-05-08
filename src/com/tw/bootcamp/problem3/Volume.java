package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Volume {

	private final double value;
	private final VolumeUnit unit;

	public Volume(double value, VolumeUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public boolean compare(Volume other) {
		return this.unit.convertTo(value) == other.unit.convertTo(value);
	}


	public Volume add(Volume other, VolumeUnit unit) {
		double result = this.unit.convertTo(this.value) + other.unit.convertTo(other.value);
		Volume standardValue = new Volume(Math.round(unit.convertFrom(result) * 100.0) / 100.0, unit);
		return standardValue;
	}

	@Override
	public String toString() {
		return "BaseVolume{" +
				"value=" + value +
				", unit=" + unit +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Volume that = (Volume) o;
		return Double.compare(value, that.value) == 0 && unit == that.unit;
	}

	@Override
	public int hashCode() {
		int result = Double.hashCode(value);
		result = 31 * result + Objects.hashCode(unit);
		return result;
	}
}
