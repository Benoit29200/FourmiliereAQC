package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Reine extends Role {
	public Reine(Fourmi fourmi, Fourmiliere fourmiliere) {
		super(fourmi, fourmiliere);
		yourself.setDureeVie(1460 + (int) (Math.random() * ((3650 - 1460) + 1))); // entre 4 et 10 ans en jours
		yourself.setPoids(2.0);
	}

	@Override
	public void step() {
		pondre();
	}

	private void pondre() {
		maFourmiliere.getNid().add(yourself); // la reine va dans le Nid
		int nbOeufs = 20 + (int) (Math.random() * ((50 - 20) + 1)); // entre 20 et 50 oeufs

		for (int i = 0; i < nbOeufs; i++) {
			maFourmiliere.getNid().add(new Fourmi(maFourmiliere));
		}
	}
	
	public void cycle() {
		if(yourself.setDureeVie(yourself.getDureeVie()-1)==0) {
			// la reine est morte, qu'est ce qu'on fait ?
		}

	}
}
