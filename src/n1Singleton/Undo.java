package n1Singleton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Undo {

	private static Undo undo;
	
	private Undo() {

	}
	
	public static Undo getUndo() {
		if(undo == null) {
			undo = new Undo();
		}
		return undo;
	}
	
	ArrayList<String> llista = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public void afegir() {
		String comando = sc.nextLine();
		llista.add(comando);		
	}
	
	public void llistar() {
		for (String string : llista) {
			System.out.println(string);
		}		
	}
	
	public void esborrar() {
		
		System.out.println("Comando a esborrar?");
		String comando = sc.nextLine();
		Iterator<String> it = llista.iterator();
		while (it.hasNext()) {
			if (it.next().equals(comando)){
				it.remove();
			}
		}	
		
	}	
	
	public void esborrarUltim() {
		int size = llista.size();
		if (size == 0) {
			System.out.println("No hi ha elements a esborrar");
		}else {			
			llista.remove(size-1);
		}		
	}
	
}
