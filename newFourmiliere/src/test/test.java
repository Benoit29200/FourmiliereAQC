package test;

import org.junit.Test;

import fourmiliere.Fourmi;
import fourmiliere.Fourmiliere;

public class test {

	@Test
	public void testCycle() {
		Fourmiliere maFourmiliere = new Fourmiliere();
		maFourmiliere.step();
		
		
		// cycle oeuf à larves
		for(int i=1 ; i <=3 ; i++) {
			maFourmiliere.cycle();
		}
		
		// cycle larves à nymphe
		for(int i=1 ; i <=10 ; i++) {
			maFourmiliere.cycle();
		}
		
		// cycle nymphe à adulte
		for(int i=1 ; i <=17 ; i++) {
			maFourmiliere.cycle();
		}
		
		// la reine pond encore
		maFourmiliere.step();
		
		// affiche les fourmis dans la fourmiliere
		System.out.println("Les fourmis dans la fourmiliere: ");
		for(Fourmi f:maFourmiliere.lesFourmis) {
			System.out.println("\t"+f.toString());
		}
		
		// affiche les fourmis dans le nid
		System.out.println("Les fourmis dans le nid: ");
		for(Fourmi f:maFourmiliere.lesFourmisDansLeNid()) {
			System.out.println("\t"+f.toString());
		}
	}
}
