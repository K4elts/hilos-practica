package practica1;

public class ThCorredores extends Thread{

	int idhilo;
	//Almacen al;
	int dorsal;
	int fin;
	
	public ThCorredores(int idhilo) {
		this.idhilo = idhilo;
		//this.al = a;
		this.fin = 0;
		
		
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Soy el hilo: "+idhilo+ " y he sacado el numero: "+i);
		}
		
		
		System.out.println("Soy el hilo: "+idhilo+" y he acabado");

	}

	public int getIdhilo() {
		return idhilo;
	}
	
	
	public int getDorsal() {
		return dorsal;
	}



}
