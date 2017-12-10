package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Larve extends EtatDeveloppement {
	
	public Larve(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(10);
		yourself.setPoids(6.0);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		manger(yourself.getPoids());
		
	}

	@Override
	public void cycle() {
		if(yourself.setDureeVie(yourself.getDureeVie()-1)==0) {
			// larve se transforme en nymphe
			yourself.changeEtatDeveloppement(new Nymphe(yourself,maFourmiliere));
		}
	}
	
	private void manger(double poids) {
		this.maFourmiliere.consommer(poids);
	}
}
