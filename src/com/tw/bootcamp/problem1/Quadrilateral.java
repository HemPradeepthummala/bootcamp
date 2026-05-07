package com.tw.bootcamp.problem1;

public class Quadrilateral<T extends Number> {


	private final T width;
	private final T length;

	public Quadrilateral(T length, T width) {
		this.length = length;
		this.width = width;
	}

	public Quadrilateral(T side) {
		this.length = side;
		this.width = side;
	}

	public double calculateArea() {
		return  width.doubleValue() *  length.doubleValue();
	}

	public double perimeter() {
		return 2 * (length.doubleValue() + width.doubleValue());

	}
}
