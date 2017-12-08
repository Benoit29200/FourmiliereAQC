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
		timer.schedule((TimerTask)new allerManger(this.maFourmiliere), 0, 24000);
	}

}
