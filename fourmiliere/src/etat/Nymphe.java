package etat;

import fourmiliere.Fourmi;

public class Nymphe extends EtatDeveloppement {

	public Nymphe(Fourmi f) {
		super(f);
		setPoids();
		this.getFourmi().setdureeVie(17); // en jours
		this.getFourmi().getFourmiliere().getNid().getMesFourmis().add(f);
	}
	
	public void cycle() {
		if(this.getFourmi().getFourmiliere().getNid().getMesFourmis().remove(this.getFourmi())) {
			this.getFourmi().setEtat(new Adulte(this.getFourmi()));
		}
	}
	
	private void setPoids() {
		Double poids = 4.5 + (double)(Math.random() * ((8.0 - 4.5) + 1.0));
		this.getFourmi().setPoids(poids);
	}

}
