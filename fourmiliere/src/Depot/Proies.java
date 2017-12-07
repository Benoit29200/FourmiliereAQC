package Depot;

import java.util.Date;

public class Proies {
	private int poids;
	private Date dateCapture;
	
	public Proies(int poids, Date time) {
		this.poids = poids;
		this.dateCapture = time;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public Date getDateCapture() {
		return dateCapture;
	}
}
