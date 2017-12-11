package Sexuee;

public class Male{
	int dureeDeVie;
	double poids;
	
	public Male() {
		dureeDeVie = 13128 + (int)(Math.random() * ((21888 - 13128) + 1));
		poids = 2.0;
	}

	public void jattend() {
		//System.out.println("Le Male attend");
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
