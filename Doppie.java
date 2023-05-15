package lezione8;

import java.util.Scanner;

public class Doppie {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String stringa = scanner.nextLine();
		boolean doppie=false;
		
		for(int i=0; i<stringa.length()-1;i++) {
			
			if(stringa.charAt(i)==stringa.charAt(i+1)) {
				doppie = true;
                break;
            }
		}
		if(doppie) {
            System.out.println("La stringa contiene una doppia.");
        } else {
            System.out.println("La stringa non contiene doppie.");
        }
		scanner.close();
	}
}
