package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Soldat extends Role {

	public Soldat(Fourmi fourmi, Fourmiliere fourmiliere) {
		super(fourmi, fourmiliere);
		yourself.setDureeVie(547 + (int)(Math.random() * ((912 - 547) + 1)));// entre 1.5 et 2.5 ans en jours
		yourself.setPoids(1.75);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cycle() {
		// Action à faire
		
	}

}
