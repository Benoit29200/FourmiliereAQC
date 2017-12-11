package Nid;

import java.util.ArrayList;
import java.util.List;

import Fourmis.fourmis;

public class Nid {
	public List<fourmis> listeDuNid;
	
	public Nid() {
		listeDuNid = new ArrayList<fourmis>();
	}
	
	public void addDansLeNid(fourmis f) {
		listeDuNid.add(f);
	}
	
	public void removeDuNid(fourmis f) {
		listeDuNid.remove(f);
	}
}
