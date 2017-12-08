package timer;

import java.util.TimerTask;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class allerManger extends TimerTask {

	Fourmiliere maFourmiliere;
	
	public allerManger(Fourmiliere f) {
		maFourmiliere = f;
		
	}
	@Override
	public void run() {
		for(Fourmi fourmi:maFourmiliere.getFourmis()) {
			
		}
		
	}

}
