package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import cimetiere.Cimetiere;
import depot.Depot;
import etat.Adulte;
import etat.EtatDeveloppement;
import lesInterfaces.ActionAFaire;
import role.Reine;
import role.Role;

public class Fourmiliere implements ActionAFaire {
	public List<Fourmi> lesFourmis;
	public Depot leDepot;
	public Cimetiere leCimetiere;
	public Nid leNid;
	
	public Fourmiliere() {
		this.lesFourmis = new ArrayList<Fourmi>();
		this.leDepot = new Depot();
		this.leCimetiere = new Cimetiere();
		this.leNid = new Nid();
		start();
	}
	
	private void start() {
		Fourmi laReine = creerReine();
		this.lesFourmis.add(laReine);
	}
	
	private Fourmi creerReine() {
		
		Fourmi reine = new Fourmi(this);
		Role roleReine = new Reine(reine,this);
		EtatDeveloppement etatAdulte = new Adulte(reine,this,roleReine);
		reine.changeEtatDeveloppement(etatAdulte);
		return reine;
	}
	
	public Nid getNid() {
		return this.leNid;
	}
	
	public void step() {
		List<Fourmi> clone = new ArrayList<Fourmi>(lesFourmis);
		for(Fourmi f:clone) {
			f.cycle();
		}
	}
	
	public void cycle() {	
		List<Fourmi> clone = new ArrayList<Fourmi>(lesFourmis);
		for(Fourmi f:clone) {
			f.cycle();
		}
	}
}
