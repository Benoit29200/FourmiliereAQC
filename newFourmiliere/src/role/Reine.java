package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Reine extends Role {
	public Reine(Fourmi fourmi, Fourmiliere fourmiliere) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(1460 + (int)(Math.random() * ((3650 - 1460) + 1))); // entre 4 et 10 ans en jours)
		yourself.setPoids(2.0);
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
