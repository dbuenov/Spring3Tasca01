package n3Command;

public class Main {

	public static void main(String[] args) {
		
		Cotxe     cotxe     = new Cotxe();
		Avió      avió      = new Avió();
		Bicicleta bicicleta = new Bicicleta();
		Vaixell   vaixell   = new Vaixell();
		
		Arrancar  arrancaAvió  = new Arrancar(avió);
		Accelerar acceleraAvió = new Accelerar(avió);
		Frenar    frenarAvió   = new Frenar(avió);
		
		Arrancar  arrancaCotxe  = new Arrancar(cotxe);
		Accelerar acceleraCotxe = new Accelerar(cotxe);
		Frenar    frenarCotxe   = new Frenar(cotxe);
		
		Arrancar  arrancaBicicleta  = new Arrancar(bicicleta);
		Accelerar acceleraBicicleta = new Accelerar(bicicleta);
		Frenar    frenarBicicleta   = new Frenar(bicicleta);
		
		Arrancar  arrancaVaixell  = new Arrancar(vaixell);
		Accelerar acceleraVaixell = new Accelerar(vaixell);
		Frenar    frenarVaixell   = new Frenar(vaixell);
		
		AparcaVehicle aparcaVehicle = new AparcaVehicle();
		
		aparcaVehicle.rebreManiobra(arrancaAvió);
		aparcaVehicle.rebreManiobra(acceleraAvió);
		aparcaVehicle.rebreManiobra(frenarAvió);
		aparcaVehicle.rebreManiobra(arrancaCotxe);
		aparcaVehicle.rebreManiobra(acceleraCotxe);
		aparcaVehicle.rebreManiobra(frenarCotxe);
		aparcaVehicle.rebreManiobra(arrancaBicicleta);
		aparcaVehicle.rebreManiobra(acceleraBicicleta);
		aparcaVehicle.rebreManiobra(frenarBicicleta);
		aparcaVehicle.rebreManiobra(arrancaVaixell);
		aparcaVehicle.rebreManiobra(acceleraVaixell);
		aparcaVehicle.rebreManiobra(frenarVaixell);
		
		aparcaVehicle.realitzarManiobra();	

	}

}
