package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Nid {
	Fourmiliere maFourmiliere;
	List<Fourmi> mesFourmis;
	
	public Nid(Fourmiliere f) {
		this.maFourmiliere = f;
		mesFourmis = new ArrayList<Fourmi>();
	}
	
	public List<Fourmi> getMesFourmis(){
		return this.mesFourmis;
	}
}
