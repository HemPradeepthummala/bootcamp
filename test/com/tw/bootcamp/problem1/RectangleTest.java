package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
	@Test
	void calculateRectangleArea() {
		Rectangle rectangle = Rectangle.createRectangle(1, 2);
		double area = rectangle.calculateArea();
		assertEquals(area,2);
	}

	@Test
	void perimeterOfNumber() {
		Rectangle rectangle = Rectangle.createRectangle(2, 8);
		double perimeter = rectangle.perimeter();
		assertEquals(20,perimeter);
	}

	@Test
	void squarePerimeterandArea() {
		Rectangle square = Rectangle.createSquare(3);
		double area = square.calculateArea();
		double perimeter = square.perimeter();
		assertEquals(9,area);
		assertEquals(12,perimeter);
	}

	@Test

	public void rectangleAreaAndPerimeter() {
		Rectangle rectangle = Rectangle.createRectangle(2.5f, 3.0f);
		double perimeter = rectangle.perimeter();
		double area = rectangle.calculateArea();
		assertEquals(7.5, area);
		assertEquals(11, perimeter);
	}
}