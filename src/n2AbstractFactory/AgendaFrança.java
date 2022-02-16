package n2AbstractFactory;

public class AgendaFrança implements IAgenda{
	
	String adreça;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaFrança(String adreça, String ciutat, String cp, String telefon) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioFrança(adreça, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonFrança(telefon).getTelefon();
	}

	

}
