package n2AbstractFactory;

public class AgendaEspanya implements IAgenda{

	String adreça;
	String ciutat;
	String cp;
	String telefon;
	
	
	public AgendaEspanya(String adreça, String ciutat, String cp, String telefon) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp= cp;
		this.telefon=telefon;
	}
			
	@Override
	public String creaDireccio() {
		IDireccio direccioEs =  new DireccioEspanya(adreça, ciutat, cp);
		return direccioEs.getDireccio(); 
	}

	@Override
	public String creaTelefon() {
		//TelefonEspanya telefonEs = new TelefonEspanya(telefon);
		//return telefonEs.getTelefon();
		return new TelefonEspanya(telefon).getTelefon();
	}

	

}
