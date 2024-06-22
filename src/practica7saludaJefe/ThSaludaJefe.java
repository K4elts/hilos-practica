package practica7saludaJefe;

public class ThSaludaJefe implements Runnable{
	
	int id;
	Almacen al;
	boolean esJefe;

	public ThSaludaJefe(int idn, Almacen a, boolean esJef) {
		this.id = idn;
		this.al = a;
		this.esJefe = esJef;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep((int)(Math.random()*2500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (this.esJefe) {
			this.al.entraJefe(this.id);
		}else {
			this.al.entraEmpleado(this.id);
		}
		
		
	}

}
