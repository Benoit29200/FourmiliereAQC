package fourmiliere;

import etat.EtatDeveloppement;
import etat.Oeuf;

public class Fourmi {
	Fourmiliere maFourmiliere;
	EtatDeveloppement monEtat;
	
	public Fourmi(Fourmiliere f) {
		this.maFourmiliere = f;
		this.monEtat = new Oeuf(this);
	}
}
