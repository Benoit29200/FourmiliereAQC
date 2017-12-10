package timer;

import java.util.TimerTask;

import depot.Proie;
import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class majDureeVie extends TimerTask {
	
	Fourmiliere maFourmiliere;
	
	public majDureeVie(Fourmiliere f) {
		this.maFourmiliere = f;
	}
	
	@Override
	public void run() {
		for(Proie p:maFourmiliere.getDepot().getProies()) {
			p.setDureeVie(p.getDureeVie()-1);
		}
		for(Fourmi f:maFourmiliere.getFourmis()) {
			f.setDureeVie(f.getDureeVie() - 1);
		}
	}
}
