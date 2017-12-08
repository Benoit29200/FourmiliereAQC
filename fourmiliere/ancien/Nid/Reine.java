package Nid;

import Fourmi.Femelle;
import fourmiliere.Fourmiliere;

public class Reine extends Femelle {
	public Fourmiliere laFourmiliere;
	public String test ="test";
	
	public Reine() {
		super();
		laFourmiliere = new Fourmiliere(this);
	}
	
	public Oeuf pondre(boolean feconde) {
		return new Oeuf(feconde);
	}
}
