package EtatDev;

public class Larves{
	double poids;

	public Larves() {
		poids = 1.5 + (double)(Math.random() * ((2.0 - 1.5) + 1));
		int nb = 3 + (int)(Math.random() * ((4 - 3) + 1));
		poids = poids * nb;
	}

	public double getPoids() {
		return poids;
	}

}
