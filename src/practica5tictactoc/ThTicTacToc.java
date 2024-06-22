package practica5tictactoc;

public class ThTicTacToc implements Runnable{

	int idhilo;
	Almacen al;
	
	public ThTicTacToc(int id,Almacen a) {
		this.idhilo = id;
		this.al = a;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.al.escribeTicTacToc(idhilo);
		}
		
	}

}
