package Depot;

import java.util.ArrayList;
import java.util.List;

public class Depot {
	public List<Proies> nourriture;
	
	public Depot() {
		nourriture = new ArrayList<Proies>();
	}
	
	public void setProies(Proies proie) {
		nourriture.add(proie);
	}
	
	public boolean removeProies(Proies proies) {
		return nourriture.remove(proies);
	}
	
}
