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
	List<Fourmi> lesFourmis;
	Reine laReine;
	Depot leDepot;
	Cimetiere leCimetiere;
	Fourmi fourmi;
	public String test = "test";
	
	public Fourmiliere(Reine reine) {
		this.laReine = reine;
		fourmi = new Fourmi();
		lesFourmis = new ArrayList<Fourmi>();
		lesFourmis.add(laReine);
		leDepot = new Depot();
		leNid = new Nid(laReine);
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
	
	//recup la liste du nid pour ajouter des fourmis, on vérifie la date
	
}
