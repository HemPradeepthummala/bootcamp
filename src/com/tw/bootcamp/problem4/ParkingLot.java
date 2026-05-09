package com.tw.bootcamp.problem4;

public class ParkingLot {


	private final boolean[] parkingLot;
	private final int length;
	private final int width;
	private final String lotId;
	private int occupied;

	private ParkingLot(int length, int width, String lotId) {
		this.lotId = lotId;
		this.parkingLot = new boolean[length * width];
		this.length = length;
		this.width = width;
		this.occupied = 0;
	}

	public static ParkingLot createParkingLot(int length, int width, String lotId) {
		return  new ParkingLot(length, width, lotId);
	}

	public boolean park() {

		if(isFull()) {
			 throw new RuntimeException("Parking lot is full");
		}

		parkingLot[occupied] = true;
		this.occupied++;
		return true;
	}

	public boolean isFull() {
			return  occupied == length * width;
	}
}
