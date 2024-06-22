package practica7saludaJefe;

public class Almacen {

	Boolean llegaJefe = false;

	public synchronized void entraEmpleado(int id) {
		
		if (!llegaJefe) {
			try {
				wait();
				System.out.println("Soy el empleado "+id+" y saludo al Jefe");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Soy el empleado "+id+" y he llegado tarde");
		}
	}

	public synchronized boolean entraJefe(int id) {
		
		notifyAll();
		System.out.println("Ha llegado el Jefe: "+id);
		return llegaJefe = true;
		
	}

}
