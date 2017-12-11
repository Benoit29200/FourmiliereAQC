package Cimetiere;

import java.util.ArrayList;
import java.util.List;

import Cimetiere.ThreadFourmis.ViderCimetiere;
import Fourmiliere.fourmiliere;
import Fourmis.fourmis;

public class CimetiereFourmis {
	public fourmiliere fourmiliere;
	public List<fourmis> fourmiMorte;
	
	public CimetiereFourmis(fourmiliere f) {
		fourmiliere = f;
		fourmiMorte = new ArrayList<fourmis>();
		ViderCimetiere vide = new ViderCimetiere(this);
		vide.start();
	}
	
	public void addFourmiMorte(fourmis f) {
		fourmiMorte.add(f);
	}
	
	public void removeFourmiMorte( ) {
		if(fourmiMorte.size()==0) return;
		int nb = 1 + (int)(Math.random() * ((2 - 1) + 1));
		for(int i = 0 ; i < nb ; i++) {
			if(fourmiMorte.size()!=0) {
				fourmiMorte.remove(0);
			}
		}
	}
	
}
