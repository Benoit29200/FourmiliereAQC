package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Fourmiliere {
	List<Fourmi> lesFourmis;
	
	public Fourmiliere() {
		this.lesFourmis = new ArrayList<Fourmi>();
		
	}
	
	public void addFourmi() {
		Fourmi newFourmi = new Fourmi(this);
		lesFourmis.add(newFourmi);
	}
}
