package etat;

import fourmiliere.Fourmi;

public class Oeuf extends EtatDeveloppement {

	public Oeuf(Fourmi f) {
		super(f);
		setPoids();
		this.getFourmi().setDureeVie(3); // en jours
		this.getFourmi().getFourmiliere().getNid().getMesFourmis().add(f);
	}
	
	public void cycle() {
		if(this.getFourmi().getFourmiliere().getNid().getMesFourmis().remove(this.getFourmi())) {
			this.getFourmi().setEtat(new Larve(this.getFourmi()));
		}
	}
	
	private void setPoids() {
		Double poids = 0.2 + (double)(Math.random() * ((8.0 - 0.2) + 1.0));
		this.getFourmi().setPoids(poids);
	}

}
