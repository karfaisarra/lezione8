package lezione8;

import java.util.Scanner;

public class ContaVocali {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String stringa = scanner.nextLine();

		int vocali = 0;
        for (int i = 0; i < stringa.length(); i++) {
            String c = ""+ stringa.charAt(i);
            if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")) {
                vocali++;
            }
        }

        System.out.println("La stringa contiene " + vocali + " vocali.");
        scanner.close();
	}
}
