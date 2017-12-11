package Fourmiliere;

public class observerFourmiliere extends Thread{
	fourmiliere f;
	
	public observerFourmiliere(fourmiliere four) {
		f = four;
	}
	
	public void run() {
		while(true) {
			if(f.getListe().size()==0) {
				System.out.println("La colonie est morte. Simulation terminé");
				System.exit(0);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
