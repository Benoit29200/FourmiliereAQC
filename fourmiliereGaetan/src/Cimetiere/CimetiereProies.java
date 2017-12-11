package Cimetiere;

import java.util.ArrayList;
import java.util.List;

import DepotNourriture.Proies;
import Fourmiliere.fourmiliere;

public class CimetiereProies {
	
	public fourmiliere fourmiliere;
	public List<Proies> proiesAJeter;
	
	public CimetiereProies(fourmiliere f) {
		this.fourmiliere = f;
		proiesAJeter = new ArrayList<Proies>();
	}
	
	public void addProies(Proies p) {
		proiesAJeter.add(p);
	}
	
	public void removeProies() {
		if(proiesAJeter.size()==0) return;
		int nb = 1 + (int)(Math.random() * ((2 - 1) + 1));
		for(int i = 0 ; i < nb ; i++) {
			if(proiesAJeter.size()!=0) {
				proiesAJeter.remove(0);
			}
		}
	}

}
