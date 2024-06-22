package practica9ladrones;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos ladrones vienen a robar");
		int numLadrones = sc.nextInt();
		sc.close();
		
		Almacen a = new Almacen(50);
		Thread[] hilo = new Thread[numLadrones];
		ThLadrones ladrones;
		
		for (int i = 0; i < hilo.length; i++) {
			ladrones = new ThLadrones(i+1,a);
			hilo[i] = new Thread(ladrones);
			hilo[i].start();
		}

	}

}
