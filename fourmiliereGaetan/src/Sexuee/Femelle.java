package Sexuee;

public class Femelle{
	int dureeDeVie;
	double poids;
	
	public Femelle() {
		dureeDeVie = 13128 + (int)(Math.random() * ((21888 - 13128) + 1));
		poids = 2.0;
	}

	public void jattend() {
		//System.out.println("La Femelle attend");
	}
	
	public void step() {
		jattend();
	}
	
	public int duree() {
		return dureeDeVie;
	}

	public double getPoids() {
		return poids;
	}

}
