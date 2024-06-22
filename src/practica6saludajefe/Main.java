package practica6saludajefe;

public class Main {

	public static void main(String[] args) {
		Almacen a = new Almacen();
		ThSaludaJefe sj;
		Thread []th = new Thread[10];
		int jefe = (int) (Math.random()*10+1);
		
		for (int i = 0; i < th.length; i++) {
			if (i == jefe) {
				sj = new ThSaludaJefe(i+1, a,true);
			}else {
				sj = new ThSaludaJefe(i+1, a,false);
			}
			th[i] = new Thread(sj);
			th[i].start();
		}
		
	}

}
