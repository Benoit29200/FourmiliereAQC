package Jobserve;

import java.util.List;

import Fourmis.fourmis;

public class JeDoisChasser extends Thread{
	fourmis maFourmis;
	
	public JeDoisChasser(fourmis f) {
		maFourmis = f;
	}
	
	public void run() {
		List<fourmis> test = maFourmis.laFourmiliere.getListe();
		int te=0;
		for(fourmis fo : test) {
			if(fo.monEtat.monAdulte != null) {
				if(fo.monEtat.monAdulte.monRole.uneOuvriere!=null) {
					te++;
				}
			}
		}
		if(maFourmis.monEtat.monAdulte != null) {
			if(maFourmis.monEtat.monAdulte.monRole.uneOuvriere != null || te==0) {
				maFourmis.laFourmiliere.leTerrain.chasse();
			}
		}
	}
}
