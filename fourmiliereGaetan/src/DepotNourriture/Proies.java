package DepotNourriture;

import DepotNourriture.GestionProies.tempsFourmiliereProie;
import Fourmiliere.fourmiliere;

public class Proies {
	double poids;
	public int dateDeLaCapture;
	tempsFourmiliereProie temps;
	public fourmiliere maFourmiliere;
	public int tempsConso;
	
	
	public Proies(double poid, int dateCapture, fourmiliere f) {
		tempsConso = 30 + (int)(Math.random() * ((40 - 30) + 1));
		poids = poid;
		maFourmiliere = f;
		dateDeLaCapture = dateCapture;
		temps = new tempsFourmiliereProie(this);
		temps.start();
	}
	
	public double manger(double poidAManger) {
		if(poidAManger>=poids) {
			return (poidAManger-poids);
		}
		poids -= poidAManger;
		return 0.0;
	}
}
