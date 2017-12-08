package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import cimetiere.Cimetiere;
import depot.Depot;
import etat.Adulte;
import role.Reine;
import role.Role;

public class Fourmiliere {
	List<Fourmi> lesFourmis;
	Nid monNid;
	Depot monDepot;
	Cimetiere monCimetiere;
	
	public Fourmiliere() {
		this.lesFourmis = new ArrayList<Fourmi>();
		this.monNid = new Nid(this);
		this.monDepot = new Depot(this);
		this.monCimetiere = new Cimetiere(this);
		start();
	}
	
	public void start() {
		lesFourmis.add(nouvelleReine());
	}
	
	private Fourmi nouvelleReine() {
		
		Fourmi f = new Fourmi(this);
		Adulte a = new Adulte(f);
		Reine r  = new Reine(a);
		
		return r.getFourmi();
		
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
