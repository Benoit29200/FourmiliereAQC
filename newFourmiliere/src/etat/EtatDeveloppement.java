package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import lesInterfaces.ActionAFaire;
import role.Role;

public abstract class EtatDeveloppement implements ActionAFaire {
	protected Fourmi yourself;
	protected Fourmiliere maFourmiliere;
	protected Role monRole;
	
	public EtatDeveloppement(Fourmi fourmi ,Fourmiliere fourmiliere ) {
		this.yourself = fourmi;
		this.maFourmiliere = fourmiliere;
	}
	
	public Fourmi getYourself() {
		return this.yourself;
	}
	
	public Fourmiliere getMyFourmiliere() {
		return this.maFourmiliere;
	}
	
	public Role getMyRole() {
		return this.monRole;
	}
}
