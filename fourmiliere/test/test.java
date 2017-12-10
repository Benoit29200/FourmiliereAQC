package test;

import fourmiliere.Fourmiliere;
import fourmiliere.Fourmi;

public class test {

	public static void main(String[] args) {
		Fourmiliere f = new Fourmiliere();
		System.out.println("ok");
		for(Fourmi fourmi:f.getFourmis()){
			System.out.println(fourmi.getEtat());
			System.out.println(fourmi.getEstAdulte());
			System.out.println(fourmi.getDureeVie());
			System.out.println(fourmi.doitManger());
		}
		

	}

}
