package n2AbstractFactory;

public class TelefonItalia implements ITelefon{
	
	String telefon;
	
	public TelefonItalia(String telefon) {
		this.telefon = telefon;
	}
		
	@Override
	public String getTelefon() {
		telefon ="+39 "+telefon;
		return telefon;
	}

}
