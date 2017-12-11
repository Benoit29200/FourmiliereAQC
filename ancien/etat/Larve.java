package etat;

import fourmiliere.Fourmi;
import role.ActionAFaire;

public class Larve extends EtatDeveloppement implements ActionAFaire {
	
	public Larve(Fourmi f) {
		super(f);
		setPoids();
		this.getFourmi().setManger(true);
		this.getFourmi().setDureeVie(10); // en jours 
	}
	
	public void cycle() {
		if(this.getFourmi().getFourmiliere().getNid().getMesFourmis().remove(this.getFourmi())) {
			this.getFourmi().setEtat(new Nymphe(this.getFourmi()));
		}
	}
	
	private void setPoids() {
		Double poids = 4.5 + (double)(Math.random() * ((8.0 - 4.5) + 1.0));
		this.getFourmi().setPoids(poids);
	}

}
