package Fourmi;

import java.util.ArrayList;
import java.util.List;

public class Fourmi {
	List<Ouvriere> listeOuvriere;
	List<Fourmi> listeFourmiSexuee;
	List<Soldat> listeSoldat;
	FourmiSexuee fourmiSexuee;

	public Fourmi() {
		listeOuvriere = new ArrayList<Ouvriere>();
		listeFourmiSexuee = new ArrayList<Fourmi>();
		listeSoldat = new ArrayList<Soldat>();
		fourmiSexuee = new FourmiSexuee();
	}
	
	public boolean addFourmi(boolean feconde) {
		if(feconde) {
			return listeFourmiSexuee.add(fourmiSexuee.addFourmiSexuee());
		}
		return listeOuvriere.add(new Ouvriere());
	}

}
