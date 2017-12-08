package role;

import etat.Adulte;
import fourmiliere.Fourmi;

public class Reine extends Role {

	
	public Reine(Adulte f) {
		super(f);
		setDureeVie();
		this.getAdulte().getFourmi().setPoids(2.0);
	}
	
	public Fourmi getFourmi() {
		return this.getAdulte().getFourmi();
	}
	
	private void setDureeVie() {
		int dureeVie = 1460 + (int)(Math.random() * ((3650 - 1460) + 1)); // entre 4 et 10 ans en jours
		this.getAdulte().getFourmi().setdureeVie(dureeVie);
	}
	
	public boolean pondre() {
		
		boolean retour= false;
		if(!this.getAdulte().getFourmi().getFourmiliere().getNid().getMesFourmis().contains(this.getFourmi())) {
			retour = this.getAdulte().getFourmi().getFourmiliere().getNid().getMesFourmis().add(this.getFourmi());
			if(!retour) return retour;
		}	
		retour = this.getAdulte().getFourmi().getFourmiliere().addFourmi();// pond des oeufs, faire nbaleatoire nb oeufs
		
		return retour;	
	}


}
