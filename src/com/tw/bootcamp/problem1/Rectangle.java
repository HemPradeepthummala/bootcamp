package com.tw.bootcamp.problem1;

public class Rectangle<T extends Number> {


	private final T width;
	private final T length;

	public Rectangle(T length, T width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return  width.doubleValue() *  length.doubleValue();
	}

	public double perimeter() {
		return 2 * (length.doubleValue() + width.doubleValue());

	}
}
