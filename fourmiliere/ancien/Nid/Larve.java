package Nid;

public class Larve{

	public boolean feconde;
	
	public Larve(boolean feconde) {
		this.feconde = feconde;
		evolve();
	}
	
	private Nymphe evolve() {
		try {
			Thread.sleep(60000); // 1 min
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Nymphe(feconde);
	}
}
