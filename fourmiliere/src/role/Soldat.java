package role;

import etat.Adulte;

public class Soldat extends Role {

	public Soldat(Adulte f) {
		super(f);
		setDureeVie();
		this.getAdulte().getFourmi().setPoids(1.75);
	}

	private void setDureeVie() {
		int dureeVie = 547 + (int)(Math.random() * ((912 - 547) + 1)); // entre 1.5 et 2.5 ans en jours
		this.getAdulte().getFourmi().setdureeVie(dureeVie);
	}

}
