package WhenAdulte;

import Sexuee.Femelle;
import Sexuee.Male;

public class FourmiSexuee{
	Male monMale;
	Femelle maFemelle;

	public FourmiSexuee() {
		int Femelle = 0 + (int)(Math.random() * (2)); // 0 Male 1 Femelle
		if(Femelle==0) {
			monMale = new Male();
		}
		else {
			maFemelle = new Femelle();
		}
	}

	public void step() {
		if(maFemelle != null) {
			maFemelle.step();
			return;
		}
		monMale.step();
		
	}

	public int duree() {
		if(maFemelle != null) {
			return maFemelle.duree();
		}
		return monMale.duree();
	}

	public double getPoids() {
		if(maFemelle != null) {
			return maFemelle.getPoids();
		}
		return monMale.getPoids();
	}

	public String getMonRole() {
		if(maFemelle != null) {
			return "femelle";
		}
		return "male";
	}
	
}
