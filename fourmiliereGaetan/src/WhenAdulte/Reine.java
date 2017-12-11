package WhenAdulte;

import Fourmiliere.fourmiliere;

public class Reine {
	Reine maReine;
	fourmiliere fourmiliere;
	int dureeDeVie;
	double poids;
	boolean pond;
	
	public Reine(fourmiliere four) {
		this.fourmiliere = four;
		dureeDeVie = 35040 + (int)(Math.random() * ((78840 - 35040) + 1)); // 365 * 9 car au max 1 année de vie deja
		poids = 2.0;
		pond = true;
	}
	
	private void pondre() {
		int nbDePonte = 10 + (int)(Math.random() * ((30 - 10) + 1));
		for(int i = 0 ; i < nbDePonte ; i++) {
			fourmiliere.addFourmis();
		}
		//System.out.println("Je ponds");
	}
	
	public int duree() {
		return dureeDeVie;
	}
	
	public void step() {
		if(pond)
			pondre();
	}

	public double getPoids() {
		return poids;
	}

	public void nepondplus() {
		pond=false;
	}
	
	public void pond() {
		pond=true;
	}

}
