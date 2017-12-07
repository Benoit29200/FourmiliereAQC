package Nid;

public class Oeuf {

	public boolean feconde;
	
	public Oeuf(boolean feconde) {
		this.feconde = feconde;
		eclore();
	}
	
	private Larve eclore() {
		try {
			Thread.sleep(60000); //1 min
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Larve(feconde);
	}
}
