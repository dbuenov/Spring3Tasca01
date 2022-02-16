package n1Singleton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//creo dos objectes Undo, per demostrar que traballen amb la mateixa llista de comandos
		Undo u1 = Undo.getUndo();
		Undo u2 = Undo.getUndo();
		
		boolean sortir = false;

		do{
			switch(menu()){
			
			//amb l'objecte u1
			case 1: u1.afegir();
			break;
			case 2: u1.llistar();
			break;
			
			//amb l'objecte u2
			case 3: u2.esborrar();
			break;
			case 4: u2.esborrarUltim();
			break;
			case 0: System.out.println("Gràcies per utilitzar l'aplicació");
			sortir = true;
			break;
			}
		}while(!sortir);
	}

	public static byte menu(){
		Scanner entrada = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do{
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Introduir comando");
			System.out.println("2. Llistar comandos");
			System.out.println("3. Esborrar comandos");
			System.out.println("4. Esborrar ùltim comando");
			System.out.println("0. Sortir de l'aplicació.\n");
			opcio = entrada.nextByte();
			if(opcio < MINIMO || opcio > MAXIMO){
				System.out.println("Escull una opció vàlida");
			}
		}while(opcio < MINIMO || opcio > MAXIMO);
		return opcio;
	}
}

