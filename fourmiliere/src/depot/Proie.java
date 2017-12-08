package depot;

public class Proie {

	int dureeVie;
	double poids;
	
	public Proie(int dureeVie,double poids) {
		this.dureeVie = dureeVie;
		this.poids = poids;
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public int getDureeVie() {
		return this.dureeVie;
	}
	
	public void setDureeVie(int dureeVie) {
		this.dureeVie = dureeVie;
	}
}
