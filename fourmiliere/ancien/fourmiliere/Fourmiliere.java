package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import Cimetiere.Cimetiere;
import Depot.Depot;
import Fourmi.Fourmi;
import Nid.Nid;
import Nid.Reine;

public class Fourmiliere {

	Nid leNid;
	Fourmi lesFourmis;
	Depot leDepot;
	Cimetiere leCimetiere;
	public String test = "test";
	
	public Fourmiliere(Reine reine) {
		lesFourmis = new Fourmi();
		lesFourmis.addReine(new Reine());
		leDepot = new Depot();
		leNid = new Nid(lesFourmis.getReine());
		leCimetiere = new Cimetiere();
	}
	
	public boolean addFourmi(Fourmi uneFourmi) {
		return lesFourmis.add(uneFourmi);
	}
	
	public boolean removeFourmiDehors(Fourmi uneFourmi) {
		return lesFourmis.remove(uneFourmi);
	}
	
	public boolean removeFourmiDedans(Fourmi uneFourmi) {
		leCimetiere.addDechet(uneFourmi);
		return lesFourmis.remove(uneFourmi);
	}	
}
