package role;

import etat.Adulte;

public abstract class Role {
	Adulte maFourmiAdulte;
	
	public Role(Adulte f) {
		this.maFourmiAdulte = f;
	}
	
	public Adulte getAdulte() {
		return this.maFourmiAdulte;
	}
	
}
