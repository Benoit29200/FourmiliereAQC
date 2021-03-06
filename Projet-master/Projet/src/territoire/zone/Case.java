package territoire.zone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import gestionnaire.GestionVue;
import observeur.Evenement;
import observeur.ModificationCase;
import observeur.Observable;
import observeur.Observeur;
import rapports.Rapport;
import rapports.Trace;
import territoire.entite.fourmi.Fourmi;
import territoire.entite.fourmi.role.Ouvriere;
import territoire.entite.fourmi.role.Role;
import territoire.entite.fourmi.role.Sexue;
import territoire.entite.proie.Proie;
import territoire.fourmiliere.Fourmiliere;
import territoire.zone.pheromone.Pheromone;
import territoire.zone.pheromone.PheromoneChasse;

public class Case implements Observable, Trace {

	Position position;
	List<Fourmi> fourmiPresente;
	List<Proie> proiePresente;
	int vie = 20;
	Map<Fourmiliere, Pheromone> listePheromones;
	private Map<String, List<Observeur>> observers;
	private boolean isModifier;

	public Case(Position position, GestionVue gestionVue) {
		observers = new HashMap<String, List<Observeur>>();
		setModifier();
		this.position = position;
		fourmiPresente = new ArrayList<Fourmi>();
		proiePresente = new ArrayList<Proie>();
		listePheromones = new HashMap<Fourmiliere, Pheromone>();
		record(ModificationCase.class.getName(), gestionVue);
		draw();

	}

	void setModifier() {
		isModifier = true;
	}

	public Position getPosition() {
		return position;
	}

	public void ajouterEntite(Fourmi fourmi) {
		fourmiPresente.add(fourmi);
		setModifier();
	}

	public void supprimerEntite(Fourmi fourmi) {
		fourmiPresente.remove(fourmi);
		setModifier();
	}

	public void ajouterEntite(Proie proie) {
		proiePresente.add(proie);
		setModifier();
	}

	public void supprimerEntite(Proie proie) {
		proiePresente.remove(proie);
		setModifier();
	}

	public List<Fourmi> getEntite() {
		return fourmiPresente;
	}

	public List<Proie> getProies() {
		return this.proiePresente;
	}

	public void addPheromone(Fourmiliere maFourmiliere) {
		if (this.listePheromones.containsKey(maFourmiliere)) {
			this.listePheromones.get(maFourmiliere).passageFourmie();
		} else {
			Pheromone pheromone;
			pheromone = new PheromoneChasse(maFourmiliere);

			this.listePheromones.put(maFourmiliere, pheromone);
		}
		vie = 100;
		setModifier();
	}

	public int getPheromone() {
		int puissance = 0;
		for (Iterator<Entry<Fourmiliere, Pheromone>> it = listePheromones.entrySet().iterator(); it.hasNext();) {
			int valeur = it.next().getValue().getPuissance();
			if (puissance < valeur)
				puissance = valeur;
		}
		return puissance;
	}

	public int getPheromone(Role role) {
		int puissance = 0;
		for (Iterator<Entry<Fourmiliere, Pheromone>> it = listePheromones.entrySet().iterator(); it.hasNext();) {
			Pheromone pheromone = it.next().getValue();
			if (pheromone.isFourmiliere(role.getEtat().getFourmi().getFourmiliere())) {
				if ((!pheromone.isSexue()) && role instanceof Sexue)
					return pheromone.getPuissance();
				if ((pheromone.isSexue()) && role instanceof Ouvriere)
					return pheromone.getPuissance();
			}
		}
		return puissance;
	}

	public void decrementPheromone() {
		for (Entry<Fourmiliere, Pheromone> entry : this.listePheromones.entrySet()) {
			entry.getValue().decrementPheromone();
			if (entry.getValue().getPuissance() > 0)
				setModifier();
		}
	}

	void draw() {
		signal(new ModificationCase(this));
		isModifier = false;
	}

	@Override
	public void trace(Rapport rapport) {
		rapport.traceForFourmiliere(this);
	}

	public void evenement() {
		this.decrementPheromone();
		if (isModifier)
			draw();
	}

	@Override
	public void record(String evtTypeName, Observeur o) {
		if (!observers.containsKey(evtTypeName)) {
			observers.put(evtTypeName, new ArrayList<Observeur>());
		}
		List<Observeur> l = observers.get(evtTypeName);
		l.add(o);
	}

	@Override
	public void signal(Evenement evt) {
		String evtName = evt.getClass().getName();
		if (!observers.containsKey(evtName)) {
			return;
		}
		List<Observeur> l = observers.get(evtName);
		for (Observeur o : l) {
			o.receive(evt);
		}
	}

}
