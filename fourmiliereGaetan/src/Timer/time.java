package Timer;

import java.util.List;

import Fourmiliere.fourmiliere;
import Fourmis.fourmis;
import Jobserve.Jevois;

public class time extends Thread{
	public int temps;
	public fourmiliere maFourmiliere;
	public boolean first;
	
	public time(fourmiliere f) {
		maFourmiliere = f;
		temps = 0;
		first = true;
	}

	public void run() {
		while(true) {
			if(temps == 2400) {
				System.out.println("La reine ne pond plus");
				List<fourmis> cherche = maFourmiliere.getListe();
				cherche.get(0).monEtat.monAdulte.monRole.maReine.nepondplus();
			}
			if(temps == 0 && !first) {
				System.out.println("La reine pond");
				List<fourmis> cherche = maFourmiliere.getListe();
				cherche.get(0).monEtat.monAdulte.monRole.maReine.pond();
			}
			temps++;
			cparti();
			if(temps == 8736) {
				first = false;
				temps=0;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void cparti() {
		List<fourmis> test=maFourmiliere.getListe();
		for(fourmis f : test) {
			f.temps = new Jevois(f);
			f.temps.start();
		}
	}
	
	public int getTemps() {
		return temps;
	}
}
