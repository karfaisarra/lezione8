package lezione8;

import java.util.Scanner;

public class ParoleQuasiUguali {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String parola1=scanner.next();
		
		System.out.println("Inserisci ancora una parola:");
		String parola2=scanner.next();
		
		if(parola1.equals(parola2)) {
			System.out.println("Sono uguali!");
		}else if(parola1.equalsIgnoreCase(parola2)) {
			System.out.println("Sono quasi uguali!");
		}else {
			System.out.println("Non sono uguali!");
		}
		scanner.close();
	}
}
