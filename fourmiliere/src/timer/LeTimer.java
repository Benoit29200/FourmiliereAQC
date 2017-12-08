package timer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

import fourmiliere.Fourmiliere;

public class LeTimer extends Observable {

	Fourmiliere maFourmiliere;
	
	public LeTimer(Fourmiliere f) {
		this.maFourmiliere = f;
		Timer timer;
		timer = new Timer();
		timer.schedule(new allerManger(this.maFourmiliere), 0, 24000); // 24000 = 24 h (1000ms = 1h)
		timer.schedule(new majDureeVie(this.maFourmiliere), 0, 24000);
	}

}
