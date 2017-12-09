package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Nid {
	private List<Fourmi> fourmisDansLeNid;
	
	public Nid() {
		this.fourmisDansLeNid = new ArrayList<Fourmi>();
	}
	
	public boolean add(Fourmi f) {
		return this.fourmisDansLeNid.add(f);
	}
	
	public boolean remove(Fourmi f) {
		return this.fourmisDansLeNid.remove(f);
	}
}
