package practica4roma;

public class Almacen {

	int turnito;
	
	public Almacen() {
		this.turnito = 1;
	}
	
	public synchronized void escribeRoma(int idhilo) {
		while (idhilo!=this.turnito) {
			try {
				wait();
			} catch (Exception e) {
			// TODO: handle exception
			}
		}
		
		
		switch (idhilo) {
		case 1:
			System.out.print("r");			
			break;
		case 2:
			System.out.print("o");			
			break;
		case 3:
			System.out.print("m");
			break;
		case 4:
			System.out.print("a");
			System.out.println();
			this.turnito = 0;
			break;
		default:
			break;
		}
		this.turnito++;
		notifyAll();
		
	}
	
}
