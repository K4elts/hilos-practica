package practica7saludaJefe;

public class MainApp {

	public static void main(String[] args) {
		
		Almacen al = new Almacen();
		ThSaludaJefe saludaJefe;
		Thread[] hilo = new Thread[10];
		int jefe = (int) (Math.random()*10+1);
		
		for (int i = 0; i < hilo.length; i++) {
			if (i == jefe) {
				saludaJefe = new ThSaludaJefe(i+1,al,true);
			}else {
				saludaJefe = new ThSaludaJefe(i+1,al,false);
			}
			hilo[i] = new Thread(saludaJefe);
			hilo[i].start();
		}

	}

}
