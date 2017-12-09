package role;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import lesInterfaces.ActionAFaire;

public abstract class Role implements ActionAFaire {
	protected Fourmi yourself;
	protected Fourmiliere maFourmiliere;
	
	public Role(Fourmi fourmi, Fourmiliere fourmiliere) {
		this.yourself = fourmi;
		this.maFourmiliere = fourmiliere;
	}
	
	public Fourmi getYourself() {
		return this.yourself;
	}
	
	public Fourmiliere getMyFourmiliere() {
		return this.maFourmiliere;
	}
	
	public void cycle() {
		if(yourself.setDureeVie(yourself.getDureeVie()-1)==0) {
			// mettre fourmi dans le cimetiere
		}

	}
}
