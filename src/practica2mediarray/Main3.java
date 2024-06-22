package practica2mediarray;

public class Main3 {

	public static void main(String[] args) {
		int []arraynum = new int[50];
		
		for (int i = 0; i < arraynum.length; i++) {
			arraynum[i] = (int)(Math.random()*100+1);
		}
		
		ArrayMedia []am = new ArrayMedia[6];
		Thread []th = new Thread[6];
		for (int i = 0; i < th.length; i++) {
			am[i] = new ArrayMedia(arraynum);
			th[i] = new Thread(am[i]);
			th[i].start();
		}
		
		
		try {
			for (int i = 0; i < th.length; i++) {
				th[i].join();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		int sumatotal = 0;
		for (int i = 0; i < am.length; i++) {
			sumatotal += am[i].getSuma();
		}
		
		int media = (sumatotal/arraynum.length);
		System.out.println("La media es: "+ media);
		for (int i = 0; i < arraynum.length; i++) {
			System.out.print(arraynum[i]+" ");
		}
	}

}
