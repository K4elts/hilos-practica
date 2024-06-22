package practica7roma;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Almacen a = new Almacen();
		Scanner sc = new Scanner(System.in);
		System.out.println("Intaoduce el numero de veces que quieres escribir roma");
		int numVeces = sc.nextInt();
		
		Thread th1 = new Thread(new ThRoma(1,a,numVeces));
		Thread th2 = new Thread(new ThRoma(2,a,numVeces));
		Thread th3 = new Thread(new ThRoma(3,a,numVeces));
		Thread th4 = new Thread(new ThRoma(4,a,numVeces));

		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
