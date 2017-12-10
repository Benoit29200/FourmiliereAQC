package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Ouvriere extends Role {

	public Ouvriere(Fourmi fourmi, Fourmiliere fourmiliere) {
		super(fourmi, fourmiliere);
		yourself.setDureeVie(547 + (int) (Math.random() * ((912 - 547) + 1)));// entre 1.5 et 2.5 ans en jours
		yourself.setPoids(1.5);
	}

	@Override
	public void step() {
		boolean partChasser = ((1 + (int) (Math.random() * 100)) == 1) ? true : false;
		
		if(partChasser) {
			chasser();
		}
		else {
			entretienNid();
		}

	}

	public void cycle() {
		if (yourself.setDureeVie(yourself.getDureeVie() - 1) == 0) {
			// mettre fourmi dans le cimetiere
		}
	}
	
	private void chasser() {
		//TODO
	}
	
	private void entretienNid() {
		//TODO
	}

}
