package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Oeuf extends EtatDeveloppement {
	
	public Oeuf(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(3);
		yourself.setPoids(0.2);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cycle() {
		// action à faire
		
	}
}
