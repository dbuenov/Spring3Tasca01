package n2AbstractFactory;

public class TelefonEspanya implements ITelefon{
	
	String telefon;
	
	public TelefonEspanya(String telefon) {
		this.telefon = telefon;
	}
		
	@Override
	public String getTelefon() {
		telefon ="+34 "+telefon;
		return telefon;
	}

}
