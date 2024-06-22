package practica2caballo;

import java.util.ArrayList;

public class Almacen {
	
	static ArrayList<Integer> posicionca = new ArrayList<>();
	
	
	public synchronized void terminar(int idhilo) {
		posicionca.add(idhilo);
		System.out.println("Soy el caballo "+idhilo+" y he terminado");
	}

}
