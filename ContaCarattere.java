package lezione8;

import java.util.Scanner;

public class ContaCarattere {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        System.out.print("Inserisci un carattere: ");
        String carattere = scanner.next();

        int conta = 0;
        
        for(int i=0; i<stringa.length(); i++) {
        	String c = ""+ stringa.charAt(i);
        	if(c.equalsIgnoreCase(carattere)) {
        		conta++;
        	}
        }
        System.out.println("Il carattere " + carattere + " è presente " + conta + " volte");
        scanner.close();
	}
}
