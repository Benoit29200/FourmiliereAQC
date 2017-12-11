package Timer;

import java.util.List;

import Fourmiliere.fourmiliere;
import Fourmis.fourmis;

public class chaqueJour extends Thread{
	fourmiliere fourmiliere;
	time ti;
	int nbJour;
	
	public chaqueJour(fourmiliere f, time t) {
		fourmiliere = f;
		ti = t;
		nbJour = 0;
	}
	
	public void run() {
		while(true) {
			List<fourmis> test = fourmiliere.getListe();
			for(fourmis four : test) {
				if(four.monEtat.monAdulte!=null) {
					four.step();
				}
			}
			int nbProies = 10 + (int)(Math.random() *(10-2)+1);
			fourmiliere.leTerrain.addProies(nbProies);
			
			affichage();			
			try {
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			nbJour++;
			
		}
	}

	private void affichage() {
		List<fourmis> test = fourmiliere.getListe();
		System.out.println("Jour numéro "+nbJour);
		if(nbJour == 0) {
			System.out.println("Nombre de fourmis total 1");
		}
		else {
			System.out.println("Nombre de fourmis total "+test.size());
		}
		
		System.out.println("Taille de mon dépôt "+fourmiliere.depot.getPoidsTotal());
		
		int nbOeuf=0;
		int nbLarve=0;
		int nbNymphe=0;
		int nbOuvriere=0;
		int nbSoldat=0;
		int nbMale=0;
		int nbFemelle=0;
		for(fourmis f : test) {
			if(f.monEtat.getMonEtat().equals("oeuf")) {
				nbOeuf++;
			}
			if(f.monEtat.getMonEtat().equals("larve")) {
				nbLarve++;
			}
			if(f.monEtat.getMonEtat().equals("nymphe")) {
				nbNymphe++;
			}
			if(f.monEtat.getMonEtat().equals("adulte")) {
				//System.out.println(f.monEtat.monAdulte.monRole.getMonRole());
				if(f.monEtat.monAdulte.monRole.getMonRole().equals("ouvriere")) {
					nbOuvriere++;
				}
				if(f.monEtat.monAdulte.monRole.getMonRole().equals("soldat")) {
					nbSoldat++;
				}
				if(f.monEtat.monAdulte.monRole.getMonRole().equals("femelle")) {
					nbFemelle++;
				}
				if(f.monEtat.monAdulte.monRole.getMonRole().equals("male")) {
					nbMale++;
				}
			}
		}	
		System.out.println("Nombre d'oeuf "+nbOeuf);
		System.out.println("Nombre de larves "+nbLarve);
		System.out.println("Nombre de Nymphes "+nbNymphe);
		System.out.println("Nombre d'Ouvriere "+nbOuvriere);
		System.out.println("Nombre de soldat "+nbSoldat);
		System.out.println("Nombre de male "+nbMale);
		System.out.println("Nombre de femelle "+nbFemelle);
		System.out.println("------------------------------");
	}
}
