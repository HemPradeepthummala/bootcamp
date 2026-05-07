package com.tw.bootcamp.problem1;

public class Rectangle {
	private final int length;
	private final int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int calculateArea() {
		return length * width;
	}
}
