package practica2mediarray;

public class ArrayMedia implements Runnable{
	
	int []numero;
	int suma;
	
	public ArrayMedia(int[] num) {
		this.numero = num;
	}

	@Override
	public void run() {
		for (int i = 0; i < (this.numero.length/5); i++) {
			suma += this.numero[i];
		}
		
		
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

}
