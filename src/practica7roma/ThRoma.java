package practica7roma;

public class ThRoma implements Runnable{
	
	int id;
	Almacen al;
	int veces;

	public ThRoma(int idn, Almacen a,int vez) {
		this.id = idn;
		this.al = a;
		this.veces = vez;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < this.veces; i++) {
			this.al.escribe(this.id);
		}
		
		
	}

}
