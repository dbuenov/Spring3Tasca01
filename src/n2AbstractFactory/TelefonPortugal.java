package n2AbstractFactory;

public class TelefonPortugal implements ITelefon{

	String telefon;
	
	public TelefonPortugal(String telefon) {
		this.telefon = telefon;
	}
		
	@Override
	public String getTelefon() {
		telefon ="+351 "+telefon;
		return telefon;
	}

}
