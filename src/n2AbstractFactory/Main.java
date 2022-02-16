package n2AbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		IAgenda agenda = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pais?");
		String pais = sc.nextLine().toUpperCase();
		System.out.println("Adre�a?");
		String adre�a = sc.nextLine();
		System.out.println("Ciutat?");
		String ciutat = sc.nextLine();
		System.out.println("CP?");
		String cp = sc.nextLine();
		System.out.println("Telefon?");
		String telefon = sc.nextLine();
		
		if (pais.equals("ESPANYA")) {
			agenda = new AgendaEspanya(adre�a, ciutat, cp, telefon);			
		}else if (pais.equals("PORTUGAL")) {
			agenda = new AgendaPortugal(adre�a, ciutat, cp, telefon);
		}else if (pais.equals("FRAN�A")) {
			agenda = new AgendaFran�a(adre�a, ciutat, cp, telefon);
		}else if (pais.equals("ITALIA")) {
			agenda = new AgendaItalia(adre�a, ciutat, cp, telefon);
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
