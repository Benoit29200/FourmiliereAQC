package role;

import depot.Proie;
import etat.Adulte;

public class Ouvriere extends Role implements ActionAFaire {

	public Ouvriere(Adulte f) {
		super(f);
		setDureeVie();
		this.getAdulte().getFourmi().setPoids(1.5);
	}
	
	private void setDureeVie() {
		int dureeVie = 547 + (int)(Math.random() * ((912 - 547) + 1)); // entre 1.5 et 2.5 ans en jours
		this.getAdulte().getFourmi().setDureeVie(dureeVie);
	}
	
	public void step() {
		chasser();
	}
	
	private void chasser() {
		Proie p = new Proie(30000,180.0);
		System.out.println("Ca marche");
		this.getAdulte().getFourmi().getFourmiliere().getDepot().rameneProie(p);
		
		
	}

}
