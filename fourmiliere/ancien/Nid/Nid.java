package Nid;

import java.util.ArrayList;
import java.util.List;

public class Nid{
	
	Reine laReine;
	List<Oeuf> laListeDesOeufs;
	List<Larve> laListeDeLarve;
	List<Nymphe> laListeDeNymphe;

	public Nid(Reine laReine) {
		this.laReine = laReine;
		laListeDesOeufs = new ArrayList<Oeuf>();
		laListeDeLarve = new ArrayList<Larve>();
		laListeDeNymphe = new ArrayList<Nymphe>();
	}
	
	public boolean addOeuf(Oeuf unOeuf) {
		return laListeDesOeufs.add(unOeuf);
	}
	
	public boolean addLarve(Larve uneLarve, Oeuf unOeuf) {
		laListeDesOeufs.remove(unOeuf);
		return laListeDeLarve.add(uneLarve);
	}
	
	public boolean addNymphe(Nymphe uneNymphe, Larve uneLarve) {
		laListeDeLarve.remove(uneLarve);
		return laListeDeNymphe.add(uneNymphe);
	}
	
	public boolean removeNymphe(Nymphe uneNymphe) {
		return laListeDeNymphe.remove(uneNymphe);
	}
	
}
