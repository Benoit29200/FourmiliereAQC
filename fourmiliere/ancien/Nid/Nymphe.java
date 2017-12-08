package Nid;

public class Nymphe {

	public boolean feconde;
	
	public Nymphe(boolean feconde) {
		this.feconde = feconde;
		evolve();
	}

	private boolean evolve() { // à améliorer
		try {
			Thread.sleep(60000); //1 min
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
