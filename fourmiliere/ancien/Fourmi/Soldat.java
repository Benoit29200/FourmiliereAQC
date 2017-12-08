package Fourmi;

public class Soldat extends Fourmi {
	double poids;
	
	public Soldat() {
		super();
		this.poids = 1.5 + (double)(Math.random() * (2-1.5)+1);
	}
}
