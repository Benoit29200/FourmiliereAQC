package role;

import depot.Proie;
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
			maFourmiliere.enterrerFourmi(yourself);
		}
	}
	
	private void chasser() {
		
		double poids = 1.5 + (double) (Math.random() * ((90.0 - 1.5) + 1));
		Proie p = new Proie(1.66,poids); // 40h de durée de vie = 1.66 jour
		
		this.maFourmiliere.ajouterProieAuDepot(p);
	}
	
	private void entretienNid() {
		//TODO
	}

}
