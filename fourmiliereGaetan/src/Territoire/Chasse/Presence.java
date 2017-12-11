package Territoire.Chasse;

import java.util.ArrayList;
import java.util.List;

import Fourmis.fourmis;

public class Presence {
	List<fourmis> fourmisPresente;
	List<ProiesVivante> proiesVivantes;
	
	public Presence() {
		fourmisPresente = new ArrayList<fourmis>();
		proiesVivantes = new ArrayList<ProiesVivante>();
	}
	
	public void setFourmis(fourmis f) {
		fourmisPresente.add(f);
	}
	
	public void setProies(ProiesVivante pv) {
		proiesVivantes.add(pv);
	}
	
	public void releaseFourmis(fourmis f) {
		fourmisPresente.remove(f);
	}
	
	public void releaseProies(ProiesVivante pv) {
		proiesVivantes.remove(pv);
	}

}
