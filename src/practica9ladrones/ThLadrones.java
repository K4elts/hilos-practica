package practica9ladrones;

import java.util.Random;

public class ThLadrones implements Runnable{

	int id;
	Almacen al;
	Boolean vacio;
	
	public ThLadrones(int idn,Almacen a) {
		this.id = idn;
		this.al = a;
		this.vacio = true;
	}

	@Override
	public void run() {
		Random r = new Random();
		int cantRobar = r.nextInt(20)+1;
		while(!vacio) {
			vacio=this.al.robada(cantRobar,this.id,vacio);
		}
		
	}

}
