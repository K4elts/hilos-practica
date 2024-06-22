package practica10coches;

public class metodosGasolinera {

	private boolean carreraFinalizada;
	private int posiciones [];
	private int puesto;

	private int gasolinera;
	
	public metodosGasolinera() {
		super();
		this.gasolinera = 0;
		this.posiciones = new int[4];
		this.carreraFinalizada = false;
		this.puesto = 0;
	}

	public synchronized void echarGasolina(int numCoche, int recorrido) {
		while(this.gasolinera==0) {
			System.out.println("El coche "+numCoche+" está esperando para echar gasolina y ha recorrido "+recorrido+" km");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("El coche "+numCoche+" está echando gasolina y ha recorrido "+recorrido+" km");
		this.gasolinera=0;
		notifyAll();
	}
	
	public synchronized void rellenarGasolinera() {
		
		while(this.gasolinera==1 && this.puesto != 4) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(this.gasolinera==0) {
			this.gasolinera=1;
			System.out.println("Se acaba de rellenar la gasolinera");
			notifyAll();
		}
	}
	
	public synchronized void terminarCarrera(int numCoche) {
		posiciones[puesto] = numCoche;
		puesto++;
		if(this.puesto==4) {
			this.carreraFinalizada = true;
			notify();
		}
		//System.out.println("El coche "+numCoche+" ha quedado en el puesto numero: "+puesto);
	}
	
	
	public boolean getCarreraFinalizada() {
		return this.carreraFinalizada;
	}
	
	public synchronized int[] getPosicionesCarrera() {
		return this.posiciones;
	}
	
}
