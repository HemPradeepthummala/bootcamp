package com.tw.bootcamp.problem1;

public class Rectangle {


	private final Number width;
	private final Number length;

	private Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public static Rectangle createRectangle(double length, double width) {
		return new Rectangle(length, width);
	}

	public static Rectangle createSquare(double side) {
		return createRectangle(side, side);
	}


	public double calculateArea() {
		return  width.doubleValue() *  length.doubleValue();
	}

	public double perimeter() {
		return 2 * (length.doubleValue() + width.doubleValue());

	}
}
