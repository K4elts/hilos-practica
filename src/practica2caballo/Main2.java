package practica2caballo;

public class Main2 {

	public static void main(String[] args) {
		Almacen al = new Almacen();
		ThCaballo tc;
		Thread []th = new Thread[6];
		for (int i = 0; i < 6; i++) {
			tc = new ThCaballo(i,al);
			th[i] = new Thread(tc);
			th[i].start();
		}

		
		try {
			for (int i = 0; i < 6; i++) {
				th[i].join();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (int i = 0; i < Almacen.posicionca.size(); i++) {
			System.out.println("Soy el caballo "+Almacen.posicionca.get(i)+" en el puesto "+(i+1));
		}
		
	}

}
