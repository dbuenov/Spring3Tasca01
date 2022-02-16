package n3Command;

public class Arrancar implements Command{

	private Vehicle vehicle;
	
	public Arrancar (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
		
	@Override
	public void execute() {
		vehicle.arrencar();		
	}

}
