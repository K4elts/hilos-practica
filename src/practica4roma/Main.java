package practica4roma;

public class Main {

	public static void main(String[] args) {
		
		Almacen a = new Almacen();
		Thread []th = new Thread[4];
		
		for (int i = 0; i < 4; i++) {
			ThRoma tr = new ThRoma((i+1), a);
			th[i] = new Thread(tr);
			th[i].start();
		}
		
	}

}
