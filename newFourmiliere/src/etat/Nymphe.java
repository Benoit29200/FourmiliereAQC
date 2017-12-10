package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import role.*;

public class Nymphe extends EtatDeveloppement {

	public Nymphe(Fourmi fourmi, Fourmiliere fourmiliere) {
		super(fourmi, fourmiliere);
		yourself.setDureeVie(17);
		yourself.setPoids(8.0);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
	}

	public void cycle() {
		if (yourself.setDureeVie(yourself.getDureeVie()) - 1 == 0) {
			// nymphe se transforme en adulte
			int EtatAdulte = 1 + (int) (Math.random() * 100);
			if (EtatAdulte <= 15) {
				boolean Male = ((1 + (int) (Math.random() * 100)) == 1) ? true : false;
				if (Male) {
					yourself.changeEtatDeveloppement(
							new Adulte(yourself, maFourmiliere, new Male(yourself, maFourmiliere)));
				} else {
					yourself.changeEtatDeveloppement(
							new Adulte(yourself, maFourmiliere, new Femelle(yourself, maFourmiliere)));
				}
			} else if (EtatAdulte > 15 && EtatAdulte < 37) {
				yourself.changeEtatDeveloppement(
						new Adulte(yourself, maFourmiliere, new Soldat(yourself, maFourmiliere)));
			} else {
				yourself.changeEtatDeveloppement(
						new Adulte(yourself, maFourmiliere, new Ouvriere(yourself, maFourmiliere)));
			}

			maFourmiliere.getNid().remove(yourself); // on supprime la fourmi du nid, car elle est devenu adulte
		}
	}

}
