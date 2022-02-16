package n3Command;

public class Frenar implements Command{

	private Vehicle vehicle;
	
	public Frenar (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
		
	@Override
	public void execute() {
		vehicle.frenar();		
	}

}
