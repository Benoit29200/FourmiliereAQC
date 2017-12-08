package Fourmi;

import java.util.ArrayList;
import java.util.List;

import Nid.Reine;

public class Fourmi {
	List<Ouvriere> ouvriere;
	FourmiSexuee fourmiSexuee;
	List<Soldat> soldat;
	Reine reine;
	
	Double poids;

	public Fourmi() {
		ouvriere = new ArrayList<Ouvriere>();
		soldat = new ArrayList<Soldat>();
		fourmiSexuee = new FourmiSexuee();
	}
	
	public boolean addReine(Reine r) {
		if(r==null) return false;
		this.reine = r;
		return true;
	}
	
	public Reine getReine() {
		return this.reine;
	}
	
	private boolean creerFourmiSoldat() {
		
	}
	
	private boolean creerFourmiOuvriere() {
		
	}
	
	private boolean creerFourmiSexuee() {
		
	}
	
	public boolean addFourmi() {
		int pourcentage = 1 + (int)(Math.random() * ((100 - 1) + 1));	 // nombre entre 1 et 100
		if(pourcentage < )
	}

}
