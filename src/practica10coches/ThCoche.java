package practica10coches;

import java.util.Random;

public class ThCoche implements Runnable{

	private int numCoche;
	private int recorrido;
	private int echarGasolina;
	private metodosGasolinera gasolinera;
	int puesto;
	Random r = new Random();

	public ThCoche(int numCoche, int recorrido, metodosGasolinera gasolinera) {
		super();
		this.numCoche = numCoche;
		this.recorrido = recorrido;
		this.gasolinera = gasolinera;
	}

	@Override
	public void run() {
		echarGasolina=r.nextInt(1000-700)+700;
		
		for(int i=0;i<=1500;i++) {
			
			if(recorrido==echarGasolina) {
				gasolinera.echarGasolina(numCoche, recorrido);
			}
			
			recorrido++;

		}
		gasolinera.terminarCarrera(numCoche);
		

	}
}
