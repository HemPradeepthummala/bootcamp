package com.tw.bootcamp.package4;

import net.bytebuddy.implementation.bytecode.Throw;

public class ParkingLot {


	private final boolean[][] parkingLot;
	private final int length;
	private final int width;
	private int occupied;

	public ParkingLot( int length, int width) {
		this.parkingLot = new boolean[length][width];
		this.length = length;
		this.width = width;
		this.occupied = 0;
	}

	public static ParkingLot createParkingLot(int length, int width) {
		return  new ParkingLot(length, width);
	}

	public boolean park() {

		if(isFull()) {
			 throw new RuntimeException("Parking lot is full");
		}

		this.occupied++;
		int rowIndex = getRowIndex();
		int columnIndex = getColumnIndex();
		parkingLot[rowIndex][columnIndex] = true;
		return  true;
	}

	private int getRowIndex() {
		return (occupied-1)/length;
	}

	private int getColumnIndex() {
		return (occupied-1) % width;
	}

	public boolean isFull() {
			return  occupied == length * width;
	}
}
