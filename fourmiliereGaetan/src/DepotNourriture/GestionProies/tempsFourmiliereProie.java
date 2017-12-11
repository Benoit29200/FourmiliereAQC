package DepotNourriture.GestionProies;

import DepotNourriture.Proies;
import Fourmiliere.fourmiliere;

public class tempsFourmiliereProie extends Thread{
	int date;
	fourmiliere maFourmiliere;
	Proies maProie;
	
	public tempsFourmiliereProie(Proies p) {
		maProie = p;
		date = p.dateDeLaCapture;
		maFourmiliere = p.maFourmiliere;
	}
	
	public void run() {
		while(true) {
			int duree = maFourmiliere.leTimer.getTemps();
			if(duree >= (maProie.dateDeLaCapture+maProie.tempsConso)) {
				maFourmiliere.autreCimetiere.addProies(maProie);
				maFourmiliere.depot.remove(maProie);
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
