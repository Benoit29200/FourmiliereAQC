package cimetiere;

import java.util.ArrayList;
import java.util.List;

import depot.Proie;
import fourmiliere.Fourmi;

public class Cimetiere {
	List<Proie> lesProieMorte;
	List<Fourmi> lesFourmisMorte;
	
	public Cimetiere() {
		this.lesProieMorte = new ArrayList<Proie>();
		this.lesFourmisMorte = new ArrayList<Fourmi>();
	}
	
	public boolean enterrerFourmi(Fourmi fourmi) {
		return this.lesFourmisMorte.add(fourmi);
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
