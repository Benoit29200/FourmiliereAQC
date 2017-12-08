package fourmiliere;

import cimetiere.Cimetiere;
import depot.Proie;
import etat.EtatDeveloppement;
import etat.Oeuf;
import role.Role;

public class Fourmi {
	Fourmiliere maFourmiliere;
	EtatDeveloppement monEtat;
	double poids;
	int dureeVie;
	boolean mange;
	boolean estAdulte;
	
	public Fourmi(Fourmiliere f) {
		this.maFourmiliere = f;
		this.monEtat = new Oeuf(this);
		estAdulte = false;
		mange=false;
	}
	
	public Role getRole() {
		return this.getEtat().getRole();
	}
	
	public void setRole(Role r) {
		this.getEtat().setRole(r);
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
	
	public void setDureeVie(int dureeEnJour) {
		this.dureeVie = dureeEnJour;
	}
	
	public int getDureeVie() {
		return this.dureeVie;
	}
	
	public void setManger(boolean b) {
		this.mange = b;
	}
	
	public boolean doitManger() {
		return this.mange;
	}
	
	public void setEstAdulte(boolean b) {
		this.mange = b;
	}
	
	public boolean getEstAdulte() {
		return this.mange;
	}
	
	public void manger() {
		Proie p = this.getFourmiliere().getDepot().getProies().get(0);
		this.getFourmiliere().getDepot().consommeProie(p,this);
	}
	
	public void nettoyer() {
		int nombreDeDechet = 1 + (int)(Math.random() * ((2 - 1) + 1));
		Cimetiere cim = this.getFourmiliere().getCimetiere();
		cim.removeDechet(nombreDeDechet);

		}
}
