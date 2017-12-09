package etat;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;
import role.Role;

public class Adulte extends EtatDeveloppement {

	public Adulte(Fourmi fourmi ,Fourmiliere fourmiliere,Role monRole) {
		super(fourmi,fourmiliere);
		this.monRole = monRole;
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cycle() {
		monRole.cycle();
	}
}
