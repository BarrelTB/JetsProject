package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	// F I E L D S

	// C O N S T R U C T O R S
	public CargoPlane(String model, double speed, double range, long price) {
		super(model, speed, range, price);

	}

	// M E T H O D S

	@Override
	public void load() {

		System.out.println("CARGO PLANE: " + super.getModel() + " PREPPING TO LOAD CARGO");
		System.out.println("~~~~~~~~~~~~~~~~ LOADING CARGO ~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~ LOADING COMPLETE ~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~ READY FOR TRANSPORT ~~~~~~~~~~~~~~~~");
		super.fly();
		transportCargo();
		System.out.println();
	}

	public void transportCargo() {
		System.out.println("~~~~~~~~~~~~~ TRANSPORTING CARGO ~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		boolean flight = true;
		while (flight) {
			int chance = (int) (Math.random() * 11);
			if (chance <= 5) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("YOU'VE BEEN SPOTTED BY THE ENEMY");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println();
				int chance2 = (int) (Math.random() * 11);
				if (chance2 <= 7) {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("YOU'VE BEEN SHOT DOWN BY THE ENEMY");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					flight = false;
				} else {
					System.out.println("~~~~~~~~~~~~~ TRANSPORT COMPLETE ~~~~~~~~~~~~~~~~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~~~~~~ STANDING BY FOR NEW CARGO LOAD ~~~~~~~~~~~~");
					flight = false;

				}

			} else {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("YOU'VE TRANSPORTED WITHOUT BEING SPOTTED!");
				System.out.println("GOOD JOB PILOT!");
				flight = false;
			}

		}
	}

}
