package DepotNourriture;

import java.util.ArrayList;
import java.util.List;

import Fourmiliere.fourmiliere;

public class Depot {
	List<Proies> listeProies;
	fourmiliere maFourmiliere;
	
	public Depot(fourmiliere f) {
		maFourmiliere = f;
		listeProies = new ArrayList<Proies>();
		//listeProies.add(new Proies(1000.0, 800,maFourmiliere));
	}
	
	public double getPoidsTotal() {
		double test = 0.0;
		for(Proies p : listeProies) {
			test += p.poids;
		}
		return test;
	}
	
	public boolean mange(double poid) {
		if(listeProies.size()==0) return false;
		double test = listeProies.get(0).manger(poid);
		if(test != 0.0) {
			listeProies.get(0).manger(test);
		}
		if(test ==0.0) return true;
		return false;
	}
	
	public void addProies(Proies proie) {
		//System.out.println("Ajout proie");
		listeProies.add(proie);
	}
	
	public void remove(Proies proie) {
		listeProies.remove(proie);
	}
}
