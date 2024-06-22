package practica2caballo;

public class ThCaballo implements Runnable{
	
	int metros = 0;
	int idhilo;
	int posicion = 1;
	Almacen al;

	public ThCaballo(int idhilo,Almacen a) {
		this.idhilo = idhilo;
		this.al = a;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 200; i++) {
			System.out.println("Soy el caballo: "+idhilo+" y he recorrido: "+i+" metros");
			
		}
		al.terminar(this.idhilo);
		
	}
	
	

}
