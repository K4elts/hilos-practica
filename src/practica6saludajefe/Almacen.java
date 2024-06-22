package practica6saludajefe;
//Saludar al jefe
public class Almacen {

	boolean llegaJefe;
	double tiempoinicial;
	double tiempofinal;
	double tiempollegada;
		
	public synchronized boolean entraJefe(int id) {
		notifyAll();
		System.out.println("Ha llegado el jefe "+id);
		tiempoinicial = (double) System.currentTimeMillis()/1000;
		return llegaJefe=true;
	
	}
	public synchronized void entraEmpleado(int id) {
		
		if (!llegaJefe) {//si no esta el jefe, los empleados esperan al jefe y cuando llega le saluda
			try {
				wait();
				tiempollegada = (double) System.currentTimeMillis()/1000;
				double tiempoantes = tiempoinicial-tiempollegada;
				System.out.println("El empleado "+id+" saluda al jefe y ha llegado "+tiempoantes+"s antes");
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else {//no esta el empleado cuando ha llegado el jefe
			tiempofinal = (double) System.currentTimeMillis()/1000;
			double tiempo = tiempofinal-tiempoinicial;
			System.out.println("El empleado "+id+" ha llegado tarde y he tardado "+tiempo+"s");
			
		}
		
	}
	
}
