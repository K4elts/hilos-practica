package practica9ladrones;

import java.util.Random;

public class Almacen {

	Random r = new Random();
	int turno = 0;
	int cantLadrones;
	
	int cantidadDinero = r.nextInt(200)+1;
	
	public Almacen(int cantLadrones) {
		this.cantLadrones=cantLadrones;
	}

	public synchronized boolean robada(int cantRobar, int numLadron, boolean vacio) {
		
		while(turno!=numLadron) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			turno++;
			if(turno>=cantLadrones) {
				turno=0;
			}
			notifyAll();
			
			if(cantidadDinero>=cantRobar) {
				System.out.println("Se ha metido el ladron "+numLadron+" y ha robado "+cantRobar+" lingotes");
				cantidadDinero-=cantRobar;
				System.out.println("Quedan una cantidad de: "+cantidadDinero);
				vacio=false;
				return vacio;
			}else {
				System.out.println("Se ha metido el ladron "+numLadron+" y ha querido robar "+cantRobar+" lingotes");
				System.out.println("No se ha podido, mision cancelada");
				vacio=true;
				return vacio;
			
		}
		
	}

}
