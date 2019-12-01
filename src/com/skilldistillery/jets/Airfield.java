package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	// F I E L D S
	private List<Jet> jets;

	public Airfield() {
		this.jets = defaultJets();
	}

	public Airfield(List<Jet> jets, int count) {
		super();
		this.jets = new ArrayList<>(count);
	}

	// C O N S T R U C T O R S

	// M E T H O D S
	public void addJet(Jet jet) {
		jets.add(jet);

	}
	public void removeJet(int j) {
		jets.remove(jets.get(j));
	}

	public void listJets() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Jet Number: " + (i + 1));
			System.out.println(jets.get(i));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
		}
	}

	public void flyAllJets() {
		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).fly();
		}
	}

	public void fastestJet() {
		double fastest = 0;
		int a = 0;
		for (int i = 0; i < jets.size(); i++) {
			if (fastest < jets.get(i).getSpeed()) {
				a = i;
				fastest = jets.get(a).getSpeed();
			}
		}
		System.out.println();
		System.out.println("The fastest speed is: " + fastest);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(jets.get(a));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}

	public void longestRange() {
		double longest = 0;
		int a = 0;
		for (int i = 0; i < jets.size(); i++) {
			if (longest < jets.get(i).getRange()) {
				a = i;
				longest = jets.get(a).getRange();
			}
		}
		System.out.println();
		System.out.println("The longest range is: " + longest);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(jets.get(a));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	public void loadCargos() {
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i) instanceof CargoPlane) {
				jets.get(i).load();
			}
		}
	}
	public void dogFight(int j) {
			if (jets.get(j) instanceof FighterJet) {
				jets.get(j).fight();
			} else {
				System.out.println("WE AREN'T A FIGHTER JET! WE CAN'T FIGHT!");
			}
		
	}

	public List<Jet> defaultJets() {
		jets = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(
				new FileReader("jets.txt"))) {

			String line = null;
			while ((line = br.readLine()) != null) {

				String[] defaultJets = line.split("\t");
				if (defaultJets.length == 4) {
					String model = defaultJets[0];
					Double speed = Double.parseDouble(defaultJets[1]);
					Double range = Double.parseDouble(defaultJets[2]);
					Long price = Long.parseLong(defaultJets[3]);
					if (model.startsWith("F") || model.startsWith("M")) {
						FighterJet fighterJet = new FighterJet(model, speed, range, price);
						jets.add(fighterJet);
					}
					if (model.startsWith("C")) {
						CargoPlane cPlane = new CargoPlane(model, speed, range, price);
						jets.add(cPlane);
					}
				}
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
		return jets;

	}

}
