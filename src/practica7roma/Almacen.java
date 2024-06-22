package practica7roma;

public class Almacen {
	
	int turno;
	
	public Almacen() {
		this.turno = 1;
	}

	public synchronized void escribe(int id) {
		
		while(this.turno != id) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		switch (id) {
		case 1:
			System.out.print("R");
			break;
		case 2:
			System.out.print("O");
			break;
		case 3:
			System.out.print("M");
			break;
		case 4:
			System.out.print("A\n");
			this.turno = 0;
			break;
		}
		this.turno++;
		notifyAll();
		
		
	}

}
