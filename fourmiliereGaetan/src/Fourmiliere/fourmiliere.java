package Fourmiliere;

import java.util.ArrayList;
import java.util.List;

import Cimetiere.CimetiereFourmis;
import Cimetiere.CimetiereProies;
import DepotNourriture.Depot;
import Fourmis.fourmis;
import Nid.Nid;
import Territoire.Chasse.Terrain;
import Timer.chaqueJour;
import Timer.time;

public class fourmiliere {
	public ArrayList<fourmis> listeFourmis;
	public Nid leNid;
	public time leTimer;
	public chaqueJour cj;
	public Depot depot;
	public CimetiereFourmis monCimetiere;
	public CimetiereProies autreCimetiere;
	public observerFourmiliere obs;
	public Terrain leTerrain;
	
	public fourmiliere() {
		listeFourmis = new ArrayList<fourmis>();
		leTerrain = new Terrain(this);
		leNid = new Nid();
		leTimer = new time(this);
		leTimer.start();
		depot = new Depot(this);
		cj = new chaqueJour(this,leTimer);
		cj.start();
		fourmis Reine = new fourmis(this,1);
		listeFourmis.add(Reine);
		monCimetiere = new CimetiereFourmis(this);
		autreCimetiere = new CimetiereProies(this);
		obs = new observerFourmiliere(this);
		obs.start();
	}
	
	@SuppressWarnings("unchecked")
	public List<fourmis> getListe() {
		List<fourmis> l = (List<fourmis>) listeFourmis.clone();
		return l;
	}
	
	public fourmiliere(fourmis Reine) {
		listeFourmis = new ArrayList<fourmis>();
		leTerrain = new Terrain(this);
		leTimer = new time(this);
		leTimer.start();
		depot = new Depot(this);
		listeFourmis.add(Reine);
		leNid = new Nid();
		monCimetiere = new CimetiereFourmis(this);
		autreCimetiere = new CimetiereProies(this);
		obs = new observerFourmiliere(this);
		obs.start();
	}
	
	public void removeFourmis(fourmis f) {
		listeFourmis.remove(f);
	}
	
	public void step() {
		@SuppressWarnings("unchecked")
		List<fourmis> l = (List<fourmis>) listeFourmis.clone();
		for(fourmis f: l) {
			f.step();
		}
	}
	
	public void addFourmis() {
		listeFourmis.add(new fourmis(this));
		//System.out.println(listeFourmis);
	}
}
