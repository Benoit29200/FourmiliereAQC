package Territoire.Chasse;

import java.util.ArrayList;
import java.util.List;

import DepotNourriture.Proies;
import Fourmiliere.fourmiliere;

public class Terrain {
	fourmiliere maFourmiliere;
	public List<ProiesVivante> listeDeProies;
	public grille maGrille;
	
	public Terrain(fourmiliere f) {
		maGrille = new grille(f);
		maFourmiliere = f;
		listeDeProies = new ArrayList<ProiesVivante>();
	}

	public void chasse() {
		//System.out.println(listeDeProies);
		int date = maFourmiliere.leTimer.getTemps();
		if(listeDeProies.size()!=0) { //erreur par la, bien regarder
			Proies p = new Proies(listeDeProies.get(0).poids,date, maFourmiliere);
			maFourmiliere.depot.addProies(p);
			listeDeProies.remove(0);
		}
	}

	public void addProies(int nbProies) {
		for(int i = 0 ; i < nbProies ; i++) {
			listeDeProies.add(new ProiesVivante());
		}
	}
}
