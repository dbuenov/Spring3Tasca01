package n2AbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		IAgenda agenda = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pais?");
		String pais = sc.nextLine().toUpperCase();
		System.out.println("Adreça?");
		String adreça = sc.nextLine();
		System.out.println("Ciutat?");
		String ciutat = sc.nextLine();
		System.out.println("CP?");
		String cp = sc.nextLine();
		System.out.println("Telefon?");
		String telefon = sc.nextLine();
		
		if (pais.equals("ESPANYA")) {
			agenda = new AgendaEspanya(adreça, ciutat, cp, telefon);			
		}else if (pais.equals("PORTUGAL")) {
			agenda = new AgendaPortugal(adreça, ciutat, cp, telefon);
		}else if (pais.equals("FRANÇA")) {
			agenda = new AgendaFrança(adreça, ciutat, cp, telefon);
		}else if (pais.equals("ITALIA")) {
			agenda = new AgendaItalia(adreça, ciutat, cp, telefon);
		}else {
			System.out.println("Pais incorrecte");
		}
		
		try {
			System.out.println(agenda.creaDireccio()+"\n"+agenda.creaTelefon());			
		}catch(Exception e) {
			System.err.println("No puc mostrar l'agenda");
		}
		
		sc.close();
		
		
	}

}
