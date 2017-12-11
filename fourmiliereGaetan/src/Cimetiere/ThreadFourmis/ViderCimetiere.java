package Cimetiere.ThreadFourmis;

import java.util.List;

import Cimetiere.CimetiereFourmis;
import Fourmis.fourmis;

public class ViderCimetiere extends Thread {
	CimetiereFourmis CimetiereFourmi;

	public ViderCimetiere(CimetiereFourmis cf) {
		CimetiereFourmi = cf;
	}

	public void run() {
		while (true) {
			List<fourmis> test = CimetiereFourmi.fourmiliere.getListe();
			int taille = test.size();
			int tailleCimetiere = CimetiereFourmi.fourmiMorte.size();
			if (tailleCimetiere >= taille - (taille * 0.3)) {
				List<fourmis> list = CimetiereFourmi.fourmiliere.getListe();
				for (fourmis f : list) {
					f.laFourmiliere.monCimetiere.removeFourmiMorte();
				}
			}
		}
	}

}
