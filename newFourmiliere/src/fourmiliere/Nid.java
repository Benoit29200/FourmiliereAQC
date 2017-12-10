package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Nid {
	private List<Fourmi> fourmisDansLeNid;
	
	public Nid() {
		this.fourmisDansLeNid = new ArrayList<Fourmi>();
	}
	
	public boolean ajouterOeufDansLeNid(Fourmi f) {
		return this.fourmisDansLeNid.add(f);
	}
	
	public boolean supprimerOeufDansLeNid(Fourmi f) {
		return this.fourmisDansLeNid.remove(f);
	}
	
	public List<Fourmi> lesFourmisDansLeNid(){
		return this.fourmisDansLeNid;
	}
}
