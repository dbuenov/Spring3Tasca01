package n2AbstractFactory;

public class TelefonFrança implements ITelefon{
	
	String telefon;
	
	public TelefonFrança(String telefon) {
		this.telefon = telefon;
	}
		
	@Override
	public String getTelefon() {
		telefon ="+33 "+telefon;
		return telefon;
	}

}
