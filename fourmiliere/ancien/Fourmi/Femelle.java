package Fourmi;

import Nid.Reine;

public class Femelle extends FourmiSexuee {
	double poids;
	
	public Femelle() {
		super();
		this.poids = 1.5 + (double)(Math.random() * (2-1.5)+1);
	}
	
	public Reine Fecondation(Male leMale) {
		
		if(leMale==null) return null;
		
		//int chanceNouvelleFourmiliere = 0 + (int)(Math.random() * 1001);
		//if(chanceNouvelleFourmiliere==768) {
			Reine reine = new Reine();
			return reine;
		//}
	//	return null;
	}
}
