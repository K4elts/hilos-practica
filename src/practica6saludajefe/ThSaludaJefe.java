package practica6saludajefe;

public class ThSaludaJefe implements Runnable{

	int idempleado;
	Almacen al;
	boolean esJefe;
	
	public ThSaludaJefe(int id,Almacen a,boolean jefe) {
		this.idempleado = id;
		this.al = a;
		this.esJefe = jefe;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*5000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (esJefe) {
			this.al.entraJefe(idempleado);
		}else {
			this.al.entraEmpleado(idempleado);
		}

	}

}
