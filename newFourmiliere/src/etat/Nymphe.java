package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Nymphe extends EtatDeveloppement {
	
	public Nymphe(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(17);
		yourself.setPoids(8.0);
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
