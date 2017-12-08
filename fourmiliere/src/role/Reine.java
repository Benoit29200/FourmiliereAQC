package role;



import etat.Adulte;
import fourmiliere.Fourmi;

public class Reine extends Role implements ActionAFaire {

	
	public Reine(Adulte f) {
		super(f);
		setDureeVie();
		this.getAdulte().getFourmi().setPoids(2.0);
	}
	
	public Fourmi getFourmi() {
		return this.getAdulte().getFourmi();
	}
	
	private void setDureeVie() {
		int dureeVie = 1460 + (int)(Math.random() * ((3650 - 1460) + 1)); // entre 4 et 10 ans en jours
		this.getAdulte().getFourmi().setDureeVie(dureeVie);
	}
	
	public void pondre() {
		
		if(!this.getAdulte().getFourmi().getFourmiliere().getNid().getMesFourmis().contains(this.getFourmi())) {
			this.getAdulte().getFourmi().getFourmiliere().getNid().getMesFourmis().add(this.getFourmi());
		}
		int nbOeufs = 10 + (int)(Math.random() * ((50 - 10) + 1));
		System.out.println(nbOeufs);
		this.getFourmi().getFourmiliere().addFourmi(nbOeufs);
		
	}

	@Override
	public void step() {
		pondre();
		this.getFourmi().manger();
		
	}

}
