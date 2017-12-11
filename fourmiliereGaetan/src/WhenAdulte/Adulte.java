package WhenAdulte;

import EtatDev.EtatDev;
import Fourmiliere.fourmiliere;
import Role.Role;

public class Adulte{
	public Role monRole;
	
	public Adulte(EtatDev f, fourmiliere fourmiliere) {
		monRole = new Role(this, fourmiliere);
	}
	
	public int duree() {
		return monRole.duree();
	}

	public Adulte() {
		monRole = new Role();
	}

	public void step() {
		monRole.step();
	}

	public double getPoids() {
		return monRole.getPoids();
	}

}
