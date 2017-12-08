package Fourmi;

public class Male extends Fourmi{
	double poids;
	
	public Male() {
		super();
		this.poids = 1.5 + (double)(Math.random() * (2-1.5)+1);
	}
}
