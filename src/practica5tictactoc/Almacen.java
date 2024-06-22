package practica5tictactoc;

public class Almacen {
	
	int idHilo;
	int seg = 0;
	
	public Almacen() {
		this.idHilo = 1;
	}

	public synchronized void escribeTicTacToc(int ii) {
		
		while(ii!=this.idHilo) {
			try {
				wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		seg++;
		switch (ii) {
		case 1:
			System.out.println("Tic	"+seg+"s");
			break;
		case 2:
			System.out.println("Tac	"+seg+"s");
			break;
		case 3:
			System.out.println("Toc	"+seg+"s");
			this.idHilo = 0;
			break;
		default:
			break;
		}
		this.idHilo++;
		notifyAll();
	}
	
}
