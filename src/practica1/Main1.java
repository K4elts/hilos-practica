package practica1;

public class Main1 {

	public static void main(String[] args) {
		Almacen a = new Almacen(6);
		ThCorredores []c = new ThCorredores[10];
		int []dorsal = new int[6];
		for (int i = 0; i < c.length; i++) {
			c[i] = new ThCorredores(i);
			c[i].start();
			dorsal[i] = c[i].getDorsal();
		}
		
	
		
	
		
		try {
			for (int i = 0; i < c.length; i++) {
				c[i].join();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Fin de la carrera");
		
		for (int i = 0; i < dorsal.length; i++) {
			
		}
		System.out.println("Soy el hilo: "+" y he acabado");
	}

}
