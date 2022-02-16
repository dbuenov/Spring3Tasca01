package n3Command;

public class Bicicleta implements Vehicle{

	@Override
	public void arrencar() {
		System.out.println("La bicicleta arrenca");
		
	}

	@Override
	public void accelerar() {
		System.out.println("La bicicleta accelera");
		
	}

	@Override
	public void frenar() {
		System.out.println("La bicicleta frena");
		
	}
	
}
