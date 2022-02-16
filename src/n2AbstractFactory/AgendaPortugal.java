package n2AbstractFactory;

public class AgendaPortugal implements IAgenda{
	
	String adreça;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaPortugal(String adreça, String ciutat, String cp, String telefon) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioPortugal(adreça, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonPortugal(telefon).getTelefon();
	}

}
