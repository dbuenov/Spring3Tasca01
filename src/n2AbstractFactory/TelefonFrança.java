package n2AbstractFactory;

public class TelefonFran�a implements ITelefon{
	
	String telefon;
	
	public TelefonFran�a(String telefon) {
		this.telefon = telefon;
	}
		
	@Override
	public String getTelefon() {
		telefon ="+33 "+telefon;
		return telefon;
	}

}
