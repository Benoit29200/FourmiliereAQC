package fourmiliere;

public class Femelle extends FourmiSexuee {
	public Femelle() {
		super();
	}
	
	public Fourmiliere Fecondation(Male leMale) {
		
		if(leMale==null) return null;
		
		int chanceNouvelleFourmiliere = 0 + (int)(Math.random() * 1001);
		if(chanceNouvelleFourmiliere==768) {
			Reine reine = new Reine();
			Fourmiliere nouvelleFourmiliere =reine.creerFourmiliere();
			Nid leNid = reine.creerNid();
			nouvelleFourmiliere.setNid(leNid);
			return nouvelleFourmiliere;
		}
		return null;
	}
}
