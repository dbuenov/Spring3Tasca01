package n2AbstractFactory;

public class AgendaPortugal implements IAgenda{
	
	String adre�a;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaPortugal(String adre�a, String ciutat, String cp, String telefon) {
		this.adre�a= adre�a;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioPortugal(adre�a, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonPortugal(telefon).getTelefon();
	}

}
