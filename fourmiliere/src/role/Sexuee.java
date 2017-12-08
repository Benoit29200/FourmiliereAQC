package role;

import etat.Adulte;

public abstract class Sexuee extends Role {

	public Sexuee(Adulte f) {
		super(f);
		this.getAdulte().getFourmi().setPoids(1.75);
		setDureeVie();
	}
	
	private void setDureeVie() {
		int dureeVie = 547 + (int)(Math.random() * ((912 - 547) + 1)); // entre 1.5 et 2.5 ans en jours
		this.getAdulte().getFourmi().setdureeVie(dureeVie);
	}

}
