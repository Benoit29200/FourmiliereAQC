package fourmiliere;

public class Reine extends Femelle {
	public Reine() {
		super();
	}
	
	public Nid creerNid() {
		return new Nid();
	}
	
	public Fourmiliere creerFourmiliere() {
		return new Fourmiliere(this);
	}
}
