package Test;

import Fourmi.Femelle;
import Fourmi.Male;
import Nid.Reine;

public class test {
	
	public static void main(String[] argv) {
		Femelle fem = new Femelle();
		Male male = new Male();
		Reine reine = fem.Fecondation(male);
		System.out.println(reine.laFourmiliere.test);
		 
		
	}

}
