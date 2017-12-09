package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import lesInterfaces.ActionAFaire;

public abstract class Sexuee extends Role implements ActionAFaire {
	
	public Sexuee(Fourmi fourmi, Fourmiliere maFourmiliere) {
		super(fourmi,maFourmiliere);
		yourself.setDureeVie(547 + (int)(Math.random() * ((912 - 547) + 1)));// entre 1.5 et 2.5 ans en jours
		yourself.setPoids(1.5);
	}
}
