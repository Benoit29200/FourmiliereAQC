package Jobserve;

import Fourmis.fourmis;

public class Jevois extends Thread {
	fourmis maFourmis;

	public Jevois(fourmis fourmis) {
		maFourmis = fourmis;
		// System.out.println("Création nouvelle instance pour " +fourmis);
	}

	public void run() {
			int tim = maFourmis.laFourmiliere.leTimer.getTemps();
			// System.out.println("J'analyse "+maFourmis);
			if ((maFourmis.creation() + maFourmis.dureeNid) <= tim) {
				// System.out.println("J'evolue "+maFourmis);
				maFourmis.evolve();
			}
			if (maFourmis.monEtat.monAdulte != null) {
				if ((maFourmis.creation() + maFourmis.duree()) <= tim) {
					maFourmis.laFourmiliere.monCimetiere.addFourmiMorte(maFourmis);
					maFourmis.laFourmiliere.removeFourmis(maFourmis);
					return;
				}
			}
	}
}
