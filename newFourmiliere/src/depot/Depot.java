package depot;

import java.util.ArrayList;
import java.util.List;

import fourmiliere.Fourmiliere;

public class Depot {

	Fourmiliere maFourmiliere;
	List<Proie> lesProiesDansLeDepot;
	Double poidsTotal;
	

	public Depot(Fourmiliere fourmiliere) {
		this.lesProiesDansLeDepot = new ArrayList<Proie>();
		this.poidsTotal = 0.0;
		this.maFourmiliere = fourmiliere;
	}

	public void ajouterProieAuDepot(Proie p) {

		this.lesProiesDansLeDepot.add(p);
		this.poidsTotal += p.getPoids();
	}
	
	public void trierDepot(int nbProie) {
		int nbProieASupprimer = nbProie;
		for(Proie proie:this.lesProiesDansLeDepot) {
			if(proie.estMorte()) {
				this.lesProiesDansLeDepot.remove(proie);
				maFourmiliere.enterrerProie(proie);
				nbProieASupprimer--;
				if(nbProieASupprimer == 0) {
					return;
				}
			}
		}
	}

	public boolean consommer(Double poids) {

		// si plus de proie, ou poids total insuffisant, on retourne faux.
		if (this.lesProiesDansLeDepot.isEmpty())
			return false;
		if (this.poidsTotal < poids)
			return false;

		// sinon on mange la proie
		double poidsRestantAConsommer = mangerProie(poids);

		// si on a manger suffisamment, on retourne true
		if (poidsRestantAConsommer <= 0.0)
			return true;

		// sinon on mange ce qui nous reste à manger
		return consommer(mangerProie(poids));

	}

	private double mangerProie(double poids) {

		// on mange ce qu'on a besoin sur la premiere proie
		double poidsRestantAConsommer = this.lesProiesDansLeDepot.get(0).reduirePoids(poids);

		// si on a pas fini de manger
		if (poidsRestantAConsommer >= 0.0) {
			// on supprime la proie que l'on vient de manger
			this.lesProiesDansLeDepot.remove(0);

			// on met à jour le poidsTotal des proies de la liste
			this.poidsTotal -= poids - poidsRestantAConsommer;
		}

		// si on a déja fini de manger, on met à jour le poidsTotal des proies de la
		// liste
		else {
			this.poidsTotal -= poids;
		}

		// on retour le poids Restant a consommer ( négatif si on a fini de manger)
		return poidsRestantAConsommer;

	}
}
