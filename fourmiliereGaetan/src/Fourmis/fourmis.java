package Fourmis;

import EtatDev.EtatDev;
import Fourmiliere.fourmiliere;
import Jobserve.JeDoisChasser;
import Jobserve.JeDoisManger;
import Jobserve.Jevois;

public class fourmis {
	double poids;
	public EtatDev monEtat;
	public fourmiliere laFourmiliere;
	int creation;
	public int dureeNid;
	public Jevois temps;
	JeDoisManger jeMange;
	public JeDoisChasser jeChasse;
	
	public fourmis(fourmiliere fourmiliere, int i) {
		laFourmiliere = fourmiliere;
		this.monEtat = new EtatDev(this, fourmiliere);
		creation = laFourmiliere.leTimer.getTemps();
		temps = new Jevois(this);
		dureeNid = duree();
		temps.start();
		jeChasse = new JeDoisChasser(this);
		jeChasse.start();
	}
	
	public fourmis(fourmiliere fourmiliere) {
		laFourmiliere = fourmiliere;
		this.monEtat = new EtatDev();
		fourmiliere.leNid.addDansLeNid(this);
		creation = laFourmiliere.leTimer.getTemps();
		dureeNid = 72;
		temps = new Jevois(this);
		temps.start();
		jeMange = new JeDoisManger(this);
		jeChasse = new JeDoisChasser(this);
	}
	
	public EtatDev getMonEtat() {
		return monEtat;
	}
	
	public int getDureeNid() {
		return monEtat.getDureeNid();
	}

	public EtatDev evolve() {
		//System.out.println("evolution");
		monEtat = monEtat.evolve();
		if(monEtat.monAdulte != null) {
			laFourmiliere.leNid.removeDuNid(this);
		}
		dureeNid = monEtat.getDureeNid();
		//System.out.println(dureeNid);
		return monEtat;
	}
	
	public int duree() {
		return monEtat.duree();
	}
	
	public int creation() {
		return creation;
	}
	
	public double mange() {
		return monEtat.mange();
	}
	
	public void step() {
		monEtat.step();
		jeChasse = new JeDoisChasser(this);
		jeMange = new JeDoisManger(this);
		jeChasse.start();
		jeMange.start();
		
	}

	public void chasse() {
		jeChasse = new JeDoisChasser(this);
		jeChasse.start();
		
	}

}
