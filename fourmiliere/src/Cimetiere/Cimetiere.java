package Cimetiere;

import java.util.ArrayList;
import java.util.List;

public class Cimetiere {
	List<Object> cimetiere; 
	
	public Cimetiere() {
		cimetiere = new ArrayList<Object>();
	}
	
	public void addDechet(Object dechet) {
		cimetiere.add(dechet);
	}
	
	public boolean removeDechet(Object dechet) {
		return cimetiere.remove(dechet);
	}
	
	public int getNbObjectCimetiere() {
		return cimetiere.size();
	}	
}
