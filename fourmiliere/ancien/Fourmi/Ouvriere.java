package Fourmi;

public class Ouvriere extends Fourmi {
	double poids;
	
	public Ouvriere() {
		super();
		this.poids = 1.5 + (double)(Math.random() * (2-1.5)+1);
	}
}
