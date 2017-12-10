package depot;

import java.util.ArrayList;
import java.util.List;

import etat.Adulte;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class Depot {
	private Fourmiliere maFourmiliere;
	private List<Proie> mesProie;
	private double poids;

	public Depot(Fourmiliere f) {
		this.maFourmiliere = f;
		mesProie = new ArrayList<Proie>();
	}

	public double getPoidsConsommable() {
		return this.poids;
	}

	public void rameneProie(Proie p) {
		mesProie.add(p);
		this.poids += p.poids;
	}

	public void consommeProie(Fourmi f) {
		if(mesProie.isEmpty()) return;
		Proie p = mesProie.get(0);
		mesProie.remove(p);
		double diviseur = 1.0; // larve

		if (f.getEstAdulte())
			diviseur = 3.0; // autre fourmis

		double poidsAManger = f.getPoids() / diviseur;
		if (p.getPoids() <= poidsAManger) {
			this.mesProie.remove(p);
		} else {
			p.setPoids(p.getPoids() - poidsAManger);
		}
		this.poids -= poidsAManger;
	}

	public Fourmiliere getFourmiliere() {
		return this.maFourmiliere;
	}
	
	public List<Proie> getProies(){
		return this.mesProie;
	}

}
