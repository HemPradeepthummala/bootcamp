package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
	@Test
	void calculateRectangleArea() {
		Rectangle rectangle = new Rectangle(1, 2);
		int area = rectangle.calculateArea();
		assertEquals(area,2);
	}
}