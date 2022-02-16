package n3Command;

public class Accelerar implements Command{

	private Vehicle vehicle;
	
	public Accelerar (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
		
	@Override
	public void execute() {
		vehicle.accelerar();		
	}

}
