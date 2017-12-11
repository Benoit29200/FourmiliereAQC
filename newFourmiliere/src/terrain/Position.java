package terrain;

public class Position {

	int posX;
	int posY;
	
	public Position(int posX, int posY) {
		setPosition(posX,posY);
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public void setPosition(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public String toString() {
		return "Position: (x: "+posX + "; y: "+posY+")\n";
	}
	
	public boolean equals(Position p) {
		return  ((p.posX == this.posY) && (p.posY == this.posY));
	}
}
