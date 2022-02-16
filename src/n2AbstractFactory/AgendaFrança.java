package n2AbstractFactory;

public class AgendaFran�a implements IAgenda{
	
	String adre�a;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaFran�a(String adre�a, String ciutat, String cp, String telefon) {
		this.adre�a= adre�a;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
	@Override
	public String creaDireccio() {
		return new DireccioFran�a(adre�a, ciutat, cp).getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		return new TelefonFran�a(telefon).getTelefon();
	}

	

}
