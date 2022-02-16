package n2AbstractFactory;

public class AgendaEspanya implements IAgenda{

	String adre�a;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaEspanya(String adre�a, String ciutat, String cp, String telefon) {
		this.adre�a= adre�a;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
			
	@Override
	public String creaDireccio() {
		IDireccio direccioEs =  new DireccioEspanya(adre�a, ciutat, cp);
		return direccioEs.getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		//TelefonEspanya telefonEs = new TelefonEspanya(telefon);
		//return telefonEs.getTelefon();
		return new TelefonEspanya(telefon).getTelefon();
	}

	

}
