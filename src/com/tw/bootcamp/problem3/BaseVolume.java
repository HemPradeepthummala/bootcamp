package com.tw.bootcamp.problem3;

public class BaseVolume<T extends VolumeUnit> {

	private final double value;
	private final VolumeUnit unit;

	public BaseVolume(double value, VolumeUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public boolean compare(BaseVolume<T> other) {
		return this.unit.convert(value) == other.unit.convert(value);
	}
}
