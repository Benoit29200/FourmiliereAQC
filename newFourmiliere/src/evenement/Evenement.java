package evenement;

import lesInterfaces.Observable;

public class Evenement {

	Observable source;

	public Observable source() {
		return source;
	}

	public Evenement(Observable source) {
		this.source = source;
	}
}
