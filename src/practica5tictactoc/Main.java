package practica5tictactoc;

public class Main {

	public static void main(String[] args) {
			
		Almacen al = new Almacen();
		
		Thread []th = new Thread[3];
		for (int i = 0; i < th.length; i++) {
			ThTicTacToc ttt = new ThTicTacToc(i+1,al);
			th[i] = new Thread(ttt);
			th[i].start();
			
		}
		
	}

}
