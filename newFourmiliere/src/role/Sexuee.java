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
	
	public void cycle() {
		if(yourself.setDureeVie(yourself.getDureeVie()-1)==0) {
			// mettre fourmi dans le cimetiere
		}
	}
	
	public void step() {
		//TODO
		// fecondation() à la fin de l'été
	}
	
	private Fourmiliere fecondation() {
		
		// une chance sur 1000 de créer une nouvelle fourmiliere
		// à la fin de la fécondation, les males meurent
		//999 chance sur 1000 que les femelles meurent
		
		return null; // A MODIFIER
	}
}
