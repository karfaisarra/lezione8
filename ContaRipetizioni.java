package lezione8;

import java.util.Scanner;

public class ContaRipetizioni {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String frase = scanner.nextLine(), ripetuto="";
		
		int max=0;
		
		for(int i=0;i<frase.length();i++) {
			String lettera =""+frase.charAt(i);
			int conta=0;
			
			for(int j=i+1;j<frase.length();j++) {
				String lettera2=""+frase.charAt(j);
				if(lettera.equalsIgnoreCase(lettera2)) {
					conta++;
				}
			}
			if(conta>max) {
				max=conta;
				ripetuto=lettera;
			}
		}
		System.out.println("Il carattere che si ripete di più è: " + ripetuto);
		scanner.close();
	}
}
