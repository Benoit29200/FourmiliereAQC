package etat;

import fourmiliere.Fourmi;
import role.Femelle;
import role.Male;
import role.Ouvriere;
import role.Role;
import role.Soldat;

public class Adulte extends EtatDeveloppement {
	
	Role monRole;
	
	public Adulte(Fourmi f) {
		super(f);
		int typeFourmiAleatoire = 1 + (int)(Math.random() * ((101) + 1)); // nb entre 0 et 100
		
		if( typeFourmiAleatoire <= 12) {
			int Femelle = 0 + (int)(Math.random() * (2)); // 0 Male 1 Femelle
			if(Femelle==0) {
				this.monRole = new Male(this);
			}
			else {
				this.monRole = new Femelle(this);
			}
		}
		else if(typeFourmiAleatoire > 12 && typeFourmiAleatoire <= 35) {
			this.monRole = new Soldat(this);
		}
		else {
			this.monRole = new Ouvriere(this);
		}
		
		
	}

}
