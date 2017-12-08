package fourmiliere;

import etat.EtatDeveloppement;
import etat.Oeuf;

public class Fourmi {
	Fourmiliere maFourmiliere;
	EtatDeveloppement monEtat;
	double poids;
	int dureeVie;
	
	public Fourmi(Fourmiliere f) {
		this.maFourmiliere = f;
		this.monEtat = new Oeuf(this);
	}
	
	public Fourmiliere getFourmiliere() {
		return this.maFourmiliere;
	}
	
	public EtatDeveloppement getEtat() {
		return monEtat;
	}
	
	public void setEtat(EtatDeveloppement etat) {
		this.monEtat = etat;
	}
	
	public double getPoids() {
		return this.poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public void setdureeVie(int dureeEnJour) {
		this.dureeVie = dureeEnJour;
	}
	
	
}
