package n2AbstractFactory;

public class DireccioFrança implements IDireccio{

	String adreça;
	String ciutat;
	String cp;
	
	public DireccioFrança(String adreça, String ciutat, String cp) {
		this.adreça= adreça;
		this.ciutat= ciutat;
		this.cp=cp;
	}
	
	
	@Override
	public String getDireccio() {
		String direccio = adreça+"\n"+ciutat+"\n"+cp+"\nLa France";
		return direccio;
	}

}
