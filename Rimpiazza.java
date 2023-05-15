package lezione8;

import java.util.Scanner;

public class Rimpiazza {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:");
		String stringa=scanner.nextLine();
		
		System.out.println("Inserisci il carattere da rimpiazzare:");
		char carattereDaRimpiazzare = scanner.next().charAt(0);
		
		System.out.println("Inserisci il carattere con cui sostituirlo:");
		char carattereNuovo = scanner.next().charAt(0);
		
		System.out.println(stringa.replace(carattereDaRimpiazzare, carattereNuovo));
		scanner.close();
	}
}
