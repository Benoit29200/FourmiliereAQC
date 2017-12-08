package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import cimetiere.Cimetiere;
import depot.Depot;
import role.Reine;

public class Fourmiliere {
	List<Fourmi> lesFourmis;
	Nid monNid;
	Depot monDepot;
	Cimetiere monCimetiere;
	
	public Fourmiliere(Reine reine) {
		this.lesFourmis = new ArrayList<Fourmi>();
		this.lesFourmis.add(reine.getFourmi());
		this.monNid = new Nid(this);
		this.monDepot = new Depot(this);
		this.monCimetiere = new Cimetiere();
	}
	
	public boolean addFourmi() {
		Fourmi newFourmi = new Fourmi(this);
		return lesFourmis.add(newFourmi);
	}
	
	public Nid getNid() {
		return this.monNid;
	}
	
	public List<Fourmi> getFourmis(){
		return this.lesFourmis;
	}
	
	public Depot getDepot() {
		return this.monDepot;
	}
	
	public Cimetiere getCimetiere() {
		return this.monCimetiere;
	}
}
