package lesInterfaces;

import evenement.Evenement;

public interface Observable {
	void record(String evtTypeName, Observeur o);

	void signal(Evenement evt);
}
