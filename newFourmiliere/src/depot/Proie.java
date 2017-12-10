package depot;

public class Proie {
	private Double poids;
	private double dureeVie;
	
	public Proie() {
		//TODO
	}
	
	public Double getPoids() {
		return this.poids;
	}
	
	public double reduirePoids(Double poids) {
		
		this.poids -= poids;
		return (this.poids*(-1));

	}
	
	public boolean estMorte() {
		return this.dureeVie <= 0.0;
	}
	
	public void reduitDureeVie() {
		this.dureeVie --;
	}
	
}
