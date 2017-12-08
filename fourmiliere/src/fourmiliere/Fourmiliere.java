package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import cimetiere.Cimetiere;
import depot.Depot;
import etat.Adulte;
import role.Reine;

public class Fourmiliere {
	ArrayList<Fourmi> lesFourmis;
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
		Reine r = new Reine(a);
		a.setRole(r);
		f.setEtat(a);
		
		return f;
		
	}
	
	public void addFourmi(int nbOeufs) {
		System.out.println("ok");
		for(int i=0 ; i < nbOeufs ; i++) {
			this.lesFourmis.add(new Fourmi(this));
		}
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

	
	public void step() {
		List<Fourmi> l = (List<Fourmi>) lesFourmis.clone();
		for(Fourmi f: l) {
			f.step();
		}
	}
}
