package practica10coches;

public class Main {

	public static void main(String[] args) {
		
		int recorrido = 0;
		Thread coche = null;
		
		metodosGasolinera gasolinera = new metodosGasolinera();
		
		System.out.println("Comienza la carrera");
		
		Thread camion = new Thread(new CamionGasolina(gasolinera));
		camion.start();
		
		for(int i=0;i<4;i++) {
			coche = new Thread(new ThCoche(i+1, recorrido, gasolinera));
			coche.start();
		}
		
		for(int i=0;i<4;i++) {
			try {
				coche.join();
				camion.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int[] posicionesFinales = gasolinera.getPosicionesCarrera();
		System.out.println("Mostrando resultados:");
		for (int i = 0; i < posicionesFinales.length; i++) {
			System.out.println("Posicion "+(i+1)+" coche "+posicionesFinales[i]);
		}


	}

}
