package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Larve extends EtatDeveloppement {
	
	public Larve(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(10);
		yourself.setPoids(6.0);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cycle() {
		// action a faire (fct duree vie)
		
	}
}
