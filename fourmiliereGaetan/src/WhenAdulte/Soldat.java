package WhenAdulte;

public class Soldat{
	int dureeDeVie;
	double poids;
	
	public Soldat() {
		dureeDeVie= 13128 + (int)(Math.random() * ((21888 - 13128) + 1));
		poids = 1.75;
	}
	
	private void defendre() {
		//System.out.println("Je defend");
	}
	
	public void step() {
		defendre();
	}
	
	public int duree() {
		return dureeDeVie;
	}

	public double getPoids() {
		return poids;
	}

}
