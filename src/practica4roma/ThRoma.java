package practica4roma;

public class ThRoma implements Runnable{

	int idhilo;
	Almacen al;
	
	public ThRoma(int id,Almacen a) {
		this.idhilo = id;
		this.al = a;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			this.al.escribeRoma(this.idhilo);
			
		}
		
		
	}
	
}
