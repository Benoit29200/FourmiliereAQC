package fourmiliere;

import java.util.ArrayList;
import java.util.List;

public class Fourmiliere {

	Nid leNid;
	List<Fourmi> lesFourmis;
	Reine laReine;
	Depot leDepot;
	
	public Fourmiliere(Reine reine) {
		this.laReine = reine;
		lesFourmis = new ArrayList<Fourmi>();
		lesFourmis.add(laReine);
		leDepot = new Depot();
	}
	
	
	public void setNid(Nid n) {
		this.leNid = n;
	}
}
