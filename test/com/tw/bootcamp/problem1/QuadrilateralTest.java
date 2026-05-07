package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrilateralTest {
	@Test
	void calculateRectangleArea() {
		Quadrilateral rectangle = new Quadrilateral(1, 2);
		double area = rectangle.calculateArea();
		assertEquals(area,2);
	}

	@Test
	void perimeterOfNumber() {
		Quadrilateral rectangle = new Quadrilateral(2, 8);
		double perimeter = rectangle.perimeter();
		assertEquals(20,perimeter);
	}

	@Test
	void squarePerimeterandArea() {
		Quadrilateral square = new Quadrilateral(3);
		double area = square.calculateArea();
		double perimeter = square.perimeter();
		assertEquals(9,area);
		assertEquals(12,perimeter);

	}

}