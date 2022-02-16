package n2AbstractFactory;

public class DireccioItalia implements IDireccio{

	String adre�a;
	String ciutat;
	String cp;
	
	public DireccioItalia(String adre�a, String ciutat, String cp) {
		this.adre�a= adre�a;
		this.ciutat= ciutat;
		this.cp=cp;
	}
	
	
	@Override
	public String getDireccio() {
		String direccio = adre�a+"\n"+ciutat+"\n"+cp+"\nItalia";
		return direccio;
	}

}
