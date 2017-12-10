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
		monRole.step();
		manger(this.yourself.getPoids() / 3);
		
	}

	@Override
	public void cycle() {
		monRole.cycle();
	}
	
	private void manger(Double poids) {
		//TODO
		
		this.maFourmiliere.consommer(poids);
		//après avoir manger, une fourmi va enlever 1 à 2 fourmi du cimetiere
		this.maFourmiliere.trierDepot(2);
		
	}
}
