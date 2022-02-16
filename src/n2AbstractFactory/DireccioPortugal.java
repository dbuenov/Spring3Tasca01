package n2AbstractFactory;

public class DireccioPortugal implements IDireccio{

	String adreça;
	String ciutat;
	String cp;
	
	public DireccioPortugal(String adreça, String ciutat, String cp) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp=cp;
	}
	
	
	@Override
	public String getDireccio() {
		String direccio = adreça+"\n"+ciutat+"\n"+cp+"\nPortugal";
		return direccio;
	}

}
