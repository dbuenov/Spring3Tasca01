package n2AbstractFactory;

public class AgendaItalia implements IAgenda{
	
	String adreça;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaItalia(String adreça, String ciutat, String cp, String telefon) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioItalia(adreça, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonItalia(telefon).getTelefon();
	}

	

}
