package cimetiere;

import java.util.ArrayList;
import java.util.List;

import depot.Proie;
import fourmiliere.Fourmi;

public class Cimetiere {
	List<Fourmi> dechetFourmi;
	List<Proie> dechetDechet;
	
	public Cimetiere() {
		dechetFourmi = new ArrayList<Fourmi>();
		dechetDechet = new ArrayList<Proie>();
	}
	
	public int sizeFourmi() {
		return dechetFourmi.size();
	}
	
	public boolean isEmptyFourmis() {
		if(sizeFourmi()==0) return true;
		return false;
	}
	
	public int sizeDechet() {
		return dechetDechet.size();
	}
	
	public boolean isEmptyDechet() {
		if(sizeDechet()==0) return true;
		return false;
	}
	
	public boolean addDechet(Proie dechets) {
		return dechetDechet.add(dechets);
	}
	
	public boolean addDechet(Fourmi dechets) {
		return dechetFourmi.add(dechets);
	}
	
	public void removeDechet(int nombreDeDechet) {
		if(sizeDechet()<sizeFourmi()) {
			for(int i = 0; i <nombreDeDechet;i++) {
				if(this.isEmptyDechet()) return;
				dechetFourmi.remove(0);
			}
		}
		else {
			for(int i = 0; i <nombreDeDechet;i++) {
				if(this.isEmptyDechet()) return;
				dechetDechet.remove(0);
			}
		}
	}
	
}
