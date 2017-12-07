package fourmiliere;

public class Depot {
	public Double nourriture;
	
	public Depot() {
		this.nourriture = 0.0;
	}
	
	public Double getNourriture() {
		return this.nourriture;
	}
	
	public void addNourriture(Double n) {
		this.nourriture += n;
	}
}
