package etat;

import fourmiliere.Fourmi;
import role.Role;

public abstract class EtatDeveloppement {
	Fourmi fourmi;
	Role monRole;
	
	public EtatDeveloppement(Fourmi f) {
		this.fourmi = f;
	}
	
	public Fourmi getFourmi() {
		return this.fourmi;
	}
	
	public EtatDeveloppement getEtat() {
		return this;
	}
	
	public Role getRole() {
		return this.monRole;
	}
	
	public void setRole(Role r) {
		this.monRole = r;
	}
	
}
