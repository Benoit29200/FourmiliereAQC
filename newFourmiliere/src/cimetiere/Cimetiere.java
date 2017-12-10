package cimetiere;

import java.util.ArrayList;
import java.util.List;

import depot.Proie;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Cimetiere {
	List<Proie> lesProieMorte;
	List<Fourmi> lesFourmisMorte;
	Fourmiliere laFourmiliere;
	
	public Cimetiere(Fourmiliere fourmiliere) {
		this.lesProieMorte = new ArrayList<Proie>();
		this.lesFourmisMorte = new ArrayList<Fourmi>();
		this.laFourmiliere = fourmiliere;
	}
	
	public boolean enterrerFourmi(Fourmi fourmi) {
		return  (this.laFourmiliere.supprimerFourmi(fourmi) && this.lesFourmisMorte.add(fourmi));
	}
	
	public boolean enterrerProie(Proie proie) {
		return this.lesProieMorte.add(proie);
	}
	
	public int nbProieMorte() {
		return this.lesProieMorte.size();
	}
	
	public int nbFourmiMorte() {
		return this.lesFourmisMorte.size();
	}
}
