package fourmiliere;

import etat.EtatDeveloppement;
import etat.Oeuf;
import lesInterfaces.ActionAFaire;

public class Fourmi implements ActionAFaire{

	private Fourmiliere laFourmiliere;
	private EtatDeveloppement etatFourmi;
	private int dureeVie;
	private double poids;
	
	public Fourmi(Fourmiliere laFourmiliere) {
		this.laFourmiliere = laFourmiliere;
		this.etatFourmi = new Oeuf(this,this.getFourmiliere());
	}
	
	public Fourmiliere getFourmiliere() {
		return this.laFourmiliere;
	}
	
	public EtatDeveloppement getEtatFourmi() {
		return this.etatFourmi;
	}
	
	public void changeEtatDeveloppement(EtatDeveloppement etat) {
		this.etatFourmi = etat;
	}
	
	public int getDureeVie() {
		return this.dureeVie;
	}
	
	public int setDureeVie(int duree) {
		this.dureeVie = duree;
		return duree;
	}
	
	public double getPoids() {
		return this.poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cycle() {
		etatFourmi.cycle();
		
	}
}
