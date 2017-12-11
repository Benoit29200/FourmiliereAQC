package Jobserve;

import Fourmis.fourmis;

public class JeDoisManger extends Thread {
	fourmis maFourmis;

	public JeDoisManger(fourmis f) {
		maFourmis = f;
	}

	public void run() {
		if (maFourmis.monEtat.monAdulte != null) {
			if (maFourmis.monEtat.monAdulte.monRole.maReine == null) {
				// System.out.println("Je mange");
				double te = maFourmis.mange();
				// System.out.println(maFourmis.monEtat.maLarve);
				if (te != 0.0) {
					boolean test = maFourmis.laFourmiliere.depot.mange(te);
					int ite = 0;
					while (!test) {
						maFourmis.chasse();
						if (ite == 20) {

							// System.out.println("La fourmi "+maFourmis+" est morte");
							if (maFourmis.monEtat.monAdulte == null) {
								maFourmis.laFourmiliere.leNid.removeDuNid(maFourmis);
								// System.out.println("mort");
							}
							maFourmis.laFourmiliere.monCimetiere.addFourmiMorte(maFourmis);
							maFourmis.laFourmiliere.removeFourmis(maFourmis);
							// System.out.println("il reste "+maFourmis.laFourmiliere.getListe().size());
							return;
						}
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						test = maFourmis.laFourmiliere.depot.mange(maFourmis.mange());
						ite++;
					}
					int a = maFourmis.laFourmiliere.autreCimetiere.proiesAJeter.size();
					int b = maFourmis.laFourmiliere.monCimetiere.fourmiMorte.size();
					if (a < b) {
						maFourmis.laFourmiliere.monCimetiere.removeFourmiMorte();
					} else {
						maFourmis.laFourmiliere.autreCimetiere.removeProies();
					}
				}
			}
		}
	}
}