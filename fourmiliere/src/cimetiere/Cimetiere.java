package cimetiere;

import java.util.ArrayList;
import java.util.List;

public class Cimetiere {
	List<Object> dechet;
	
	public Cimetiere() {
		dechet = new ArrayList<Object>();
	}
	
	public int size() {
		return dechet.size();
	}
	
	public boolean isEmpty() {
		if(size()==0) return true;
		return false;
	}
	
	public boolean addDechet(Object dechets) {
		return dechet.add(dechets);
	}
	
	public void removeDechet(int nombreDeDechet) {
		for(int i = 0; i <nombreDeDechet;i++) {
			if(this.isEmpty()) return;
			dechet.remove(0);
		}
	}
	
}
