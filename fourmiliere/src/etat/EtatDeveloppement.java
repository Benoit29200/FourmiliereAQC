package etat;

import fourmiliere.Fourmi;

public abstract class EtatDeveloppement {
	Fourmi fourmi;
	
	public EtatDeveloppement(Fourmi f) {
		this.fourmi = f;
	}
}