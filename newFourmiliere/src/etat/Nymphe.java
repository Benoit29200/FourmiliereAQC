package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import role.*;

public class Nymphe extends EtatDeveloppement {
	
	public Nymphe(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		super(fourmi,fourmiliere);
		yourself.setDureeVie(17);
		yourself.setPoids(8.0);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}
	public void cycle() {
		if(yourself.setDureeVie(yourself.getDureeVie())-1==0) {
			// nymphe se transforme en adulte
			// TODO faire pourcentage pour créer ouvriere ou sexué ou soldat!
			yourself.changeEtatDeveloppement(new Adulte(yourself,maFourmiliere,new Ouvriere(yourself,maFourmiliere)));
			maFourmiliere.getNid().remove(yourself); // on supprime la fourmi du nid, car elle est devenu adulte
		}
		
	}

}
