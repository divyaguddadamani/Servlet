package com.xworkz.project.constants;

public enum TicketType {
	ONLINE(170), OFFLINE(120),;

	private double cost;

	private TicketType(double cost) {
		this.cost=cost;
	}
}
