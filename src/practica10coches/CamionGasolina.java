package practica10coches;

public class CamionGasolina implements Runnable{

	metodosGasolinera gasolinera;

	public CamionGasolina(metodosGasolinera gasolinera) {
		super();
		this.gasolinera = gasolinera;
	}

	@Override
	public void run() {
		while(!gasolinera.getCarreraFinalizada()) {
			gasolinera.rellenarGasolinera();
		}
	}

}
