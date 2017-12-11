package Role;

import Fourmiliere.fourmiliere;
import WhenAdulte.Adulte;
import WhenAdulte.FourmiSexuee;
import WhenAdulte.Ouvriere;
import WhenAdulte.Reine;
import WhenAdulte.Soldat;

public class Role {
	public Ouvriere uneOuvriere;
	public Soldat unSoldat;
	public FourmiSexuee maSexuee;
	public Reine maReine;

	public Role() {
		int typeFourmiAleatoire = 1 + (int) (Math.random() * ((101) + 1)); // nb entre 0 et 100

		if (typeFourmiAleatoire <= 12) {
			maSexuee = new FourmiSexuee();
		} else if (typeFourmiAleatoire > 12 && typeFourmiAleatoire <= 35) {
			unSoldat = new Soldat();
		} else {
			uneOuvriere = new Ouvriere();
		}
	}

	public Role(Adulte unAdulte, fourmiliere fourmiliere) {
		maReine = new Reine(fourmiliere);
	}

	public void step() {
		if (uneOuvriere != null) {
			uneOuvriere.step();
			return;
		}
		if (unSoldat != null) {
			unSoldat.step();
			return;
		}
		if (maReine != null) {
			maReine.step();
			return;
		}
		maSexuee.step();
	}

	public int duree() {
		if (uneOuvriere != null) {
			return uneOuvriere.duree();
		}
		if (unSoldat != null) {
			return unSoldat.duree();
		}
		if (maReine != null) {
			return maReine.duree();
		}
		return maSexuee.duree();
	}

	public double getPoids() {
		if (uneOuvriere != null) {
			return uneOuvriere.getPoids();
		}
		if (unSoldat != null) {
			return unSoldat.getPoids();
		}
		if (maReine != null) {
			return maReine.getPoids();
		}
		return maSexuee.getPoids();
	}

	public String getMonRole() {
		if (uneOuvriere != null) {
			return "ouvriere";
		}
		if (unSoldat != null) {
			return "soldat";
		}
		if(maSexuee != null) {
			return maSexuee.getMonRole();
		}
		return "reine";
	}
}