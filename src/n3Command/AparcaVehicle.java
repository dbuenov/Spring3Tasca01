package n3Command;

import java.util.ArrayList;
import java.util.List;

public class AparcaVehicle {
	
	private List<Command> maniobres = new ArrayList<>();
	
	public void rebreManiobra(Command maniobra) {
		this.maniobres.add(maniobra);
	}
	
	public void realitzarManiobra() {
		this.maniobres.forEach(x->x.execute());
		this.maniobres.clear();
	}
	
	
	
	

}
