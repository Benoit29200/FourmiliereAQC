package fourmiliere;

import java.util.ArrayList;
import java.util.List;

import cimetiere.Cimetiere;
import depot.Depot;
import depot.Proie;
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
		this.leDepot = new Depot(this);
		this.leCimetiere = new Cimetiere(this);
		this.leNid = new Nid();
		start();
	}

	private void start() {
		Fourmi laReine = creerReine();
		this.lesFourmis.add(laReine);
	}

	private Fourmi creerReine() {

		Fourmi reine = new Fourmi(this);
		Role roleReine = new Reine(reine, this);
		EtatDeveloppement etatAdulte = new Adulte(reine, this, roleReine);
		reine.changeEtatDeveloppement(etatAdulte);
		return reine;
	}

	public boolean ajouterFourmi(Fourmi fourmi) {
		return this.lesFourmis.add(fourmi);
	}

	public boolean supprimerFourmi(Fourmi fourmi) {
		return this.lesFourmis.remove(fourmi);
	}

	/**************************************
	 ** NID
	 ***************************************/
	public boolean ajouterOeufDansLeNid(Fourmi f) {
		return this.leNid.ajouterOeufDansLeNid(f);
	}

	public boolean transformerOeufDansLeNid(Fourmi f) {
		return this.leNid.transformerOeufDansLeNid(f);
	}

	public List<Fourmi> lesFourmisDansLeNid() {
		return this.leNid.lesFourmisDansLeNid();
	}

	/**************************************
	 ** DEPOT
	 ***************************************/
	public void ajouterProieAuDepot(Proie p) {
		this.leDepot.ajouterProieAuDepot(p);
	}

	public void trierDepot(int nbProie) {
		this.leDepot.trierDepot(nbProie);
	}

	public boolean consommer(Double poids) {
		return this.leDepot.consommer(poids);
	}

	/**************************************
	 ** CIMETIERE
	 ***************************************/
	public boolean enterrerProie(Proie proie) {
		return this.leCimetiere.enterrerProie(proie);
	}

	public boolean enterrerFourmi(Fourmi fourmi) {
		return this.leCimetiere.enterrerFourmi(fourmi);
	}

	public void step() {
		List<Fourmi> clone = new ArrayList<Fourmi>(lesFourmis);
		for (Fourmi f : clone) {
			f.step();
		}
	}

	public void cycle() {
		List<Fourmi> clone = new ArrayList<Fourmi>(lesFourmis);
		for (Fourmi f : clone) {
			f.cycle();
		}
	}
}
