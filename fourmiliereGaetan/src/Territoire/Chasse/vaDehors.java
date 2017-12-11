package Territoire.Chasse;

import Fourmis.fourmis;

public class vaDehors extends Thread{
	fourmis fourmis;
	int debut;
	
	public vaDehors(fourmis f) {
		fourmis = f;
		debut = fourmis.laFourmiliere.leTimer.getTemps();
	}
	
	public void run() {
		
	}
}
