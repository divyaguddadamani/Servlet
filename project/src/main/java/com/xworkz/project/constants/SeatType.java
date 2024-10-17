package com.xworkz.project.constants;

public enum SeatType {

	RECLINER(11), PREMIUM(31), EXECUTIVE(51),;

	private int seatNo;

	private SeatType(int seatNo) {
		this.seatNo = seatNo;
	}
}
