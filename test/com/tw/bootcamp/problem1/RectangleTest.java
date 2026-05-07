package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
	@Test
	void calculateRectangleArea() {
		Rectangle rectangle = new Rectangle(1, 2);
		double area = rectangle.calculateArea();
		assertEquals(area,2);
	}

	@Test
	void perimeterOfNumber() {
		Rectangle rectangle = new Rectangle(2, 8);
		double perimeter = rectangle.perimeter();
		assertEquals(20,perimeter);
	}

	@Test
	void name() {
	}
}