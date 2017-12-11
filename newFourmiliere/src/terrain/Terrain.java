package terrain;

import fourmiliere.Fourmiliere;

// A REFAIRE

public class Terrain {
	
	Object leTerrain[][];
	Fourmiliere laFourmiliere;
	
	public Terrain() {
		leTerrain = new Object[1000][1000];
		laFourmiliere = new Fourmiliere();
		leTerrain[500][500] = laFourmiliere;
	}
	
}
