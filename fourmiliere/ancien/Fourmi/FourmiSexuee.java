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
	
	private boolean creerFourmiMale() {
		Male leMale = new Male();
		return listeMale.add(leMale);
	}
	
	private boolean creerFourmiFemelle() {
		Femelle laFemelle = new Femelle();
		return listeFemelle.add(laFemelle);
	}
	
	public boolean addFourmiSexuee() {
		int male = 0 + (int)(Math.random() * (2)); // 1 Male, 0 Femelle
		if(male==0) {
			creerFourmiFemelle();
		}
		else {
			creerFourmiMale();
		}
		return true;
	}
}
