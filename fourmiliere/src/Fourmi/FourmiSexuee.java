package Fourmi;

import java.util.ArrayList;
import java.util.List;

public class FourmiSexuee extends Fourmi {
	List<Femelle> listeFemelle;
	List<Male> listeMale;
	
	public FourmiSexuee() {
		super();
		listeFemelle = new ArrayList<Femelle>();
		listeMale = new ArrayList<Male>();
	}
	
	public Male fourmiMale() {
		Male leMale = new Male();
		listeMale.add(leMale);
		return leMale;
	}
	
	public Femelle fourmiFemelle() {
		Femelle laFemelle = new Femelle();
		listeFemelle.add(laFemelle);
		return laFemelle;
	}
	
	public Fourmi addFourmiSexuee() {
		if(listeFemelle.size()>listeMale.size()) {
			return fourmiMale();
		}
		else {
			return fourmiFemelle();
		}
			
	}
}
