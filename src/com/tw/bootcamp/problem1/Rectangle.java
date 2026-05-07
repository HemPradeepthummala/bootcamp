package com.tw.bootcamp.problem1;

public class Rectangle<T extends Number> {


	private final T width;
	private final T length;

	private Rectangle(T length, T width) {
		this.length = length;
		this.width = width;
	}

	public static <T extends Number> Rectangle<T> createRectangle(T length, T width) {
		return new Rectangle<T>(length, width);
	}

	public static <T extends Number> Rectangle<T> createSquare(T side) {
		return createRectangle(side, side);
	}


	public double calculateArea() {
		return  width.doubleValue() *  length.doubleValue();
	}

	public double perimeter() {
		return 2 * (length.doubleValue() + width.doubleValue());

	}
}
