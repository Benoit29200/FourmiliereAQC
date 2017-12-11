package Territoire.Chasse;

import java.util.HashMap;
import java.util.Map;

import Fourmiliere.fourmiliere;

public class grille {
	
	Map<Integer,Presence> grille;
	
	public grille(fourmiliere f) {
		grille = new HashMap<Integer, Presence>();
	}
}
