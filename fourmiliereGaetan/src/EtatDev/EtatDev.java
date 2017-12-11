package EtatDev;

import Fourmiliere.fourmiliere;
import Fourmis.fourmis;
import WhenAdulte.Adulte;

public class EtatDev{
	Oeufs monOeuf;
	public Larves maLarve;
	Nymphe maNymphe;
	public Adulte monAdulte;
	
	public EtatDev(fourmis f, fourmiliere fourmiliere) {
		monAdulte = new Adulte(this, fourmiliere);
	}
	
	public EtatDev() {
		monOeuf = new Oeufs();
	}
	
	public EtatDev evolve() {
		if(monAdulte != null) {
			return this;
		}
		if(maLarve == null) {
			//System.out.println("Je suis une larve");
			maLarve = new Larves();
			return this;
		}
		else if(maNymphe == null) {
			//System.out.println("Je suis une nymphe");
			maNymphe = new Nymphe();
			return this;
		}
		else {
			monAdulte = new Adulte();
			//System.out.println("Je suis un adulte");
			monOeuf = null;
			maLarve = null;
			maNymphe = null;
			return this;
		}
	}
	
	public Object getEtat() {
		if(monAdulte!=null) {
			return monAdulte;
		}
		if(maNymphe!=null) {
			return maNymphe;
		}
		if(maLarve!=null) {
			return maLarve;
		}
		return monOeuf;
	}
	
	public int duree() {
		return monAdulte.duree();
	}
	
	public void step() {
		if(monAdulte != null)
			monAdulte.step();
	}

	public int getDureeNid() {
		if(monAdulte!=null) {
			return 0;
		}
		if(maNymphe!=null) {
			return 720;
		}
		if(maLarve!=null) {
			return 312;
		}
		return 72;
	}

	public double mange() {
		if(monAdulte!=null) {
			return (monAdulte.getPoids()/3);
		}
		if(maNymphe!=null) {
			return 0.0;
		}
		if(maLarve!=null) {
			return maLarve.getPoids();
		}
		return 0.0;
	}

	public String getMonEtat() {
		if(monAdulte==null && maNymphe == null && maLarve == null) {
			return "oeuf";
		}
		if(monAdulte==null && maNymphe == null && maLarve != null) {
			return "larve";
		}
		if(monAdulte==null && maNymphe != null && maLarve != null) {
			return "nymphe";
		}
		if(monAdulte!=null && maNymphe == null && maLarve == null) {
			return "adulte";
		}
		return null;
	}


}
