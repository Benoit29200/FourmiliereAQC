package WhenAdulte;

public class Ouvriere{
	int dureeDeVie;
	double poids;
	
	public Ouvriere() {
		dureeDeVie= 13128 + (int)(Math.random() * ((21888 - 13128) + 1));
		poids = 1.5;
	}

	public int duree() {
		return dureeDeVie;
	}

	public double getPoids() {
		return poids;
	}

	public void step() {}
}
