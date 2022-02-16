package n2AbstractFactory;

public class AgendaItalia implements IAgenda{
	
	String adre�a;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaItalia(String adre�a, String ciutat, String cp, String telefon) {
		this.adre�a= adre�a;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioItalia(adre�a, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonItalia(telefon).getTelefon();
	}

	

}
