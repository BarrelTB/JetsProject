package com.skilldistillery.jets;
import java.text.DecimalFormat;

public abstract class Jet {
	// F I E L D S
	private String model;

	private double speed;

	private double range;

	private long price;

	DecimalFormat df = new DecimalFormat("#.##");

	// C O N S T R U C T O R S
	public Jet(String model, double speed, double range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	// M E T H O D S
	public void fly() {
		System.out.println();
		System.out.println("~~~~~~~~~~~ 3 ~~~~~~~~~ 2 ~~~~~~~ 1 ~~~~~~~~~~~~~ TAKEOFF ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(toString());
		double flightTime = this.range / this.speed;
		System.out.println("The total possible flight time is: " + df.format(flightTime) + " hours");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public void load() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ LOADING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public void fight() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~ PREPPING TO FIGHT ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}

	// GETTERS + SETTERS

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	// ToString
	@Override
	public String toString() {
		return "Jet Model: " + model + "\nJet Speed: " + speed + "\nJet Range: " + range + "\nJet Price: " + price;
	}

}
