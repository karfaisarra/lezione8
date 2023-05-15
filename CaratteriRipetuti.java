package lezione8;

import java.util.Scanner;

public class CaratteriRipetuti {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = scanner.nextLine();
		scanner.close();
		
		for (int i=0;i<s.length();i++) {
            if (s.substring(i+1, s.length()).contains(s.substring(i, i+1).toUpperCase())  || s.substring(i+1, s.length()).contains(s.substring(i, i+1).toLowerCase())) {
                System.out.println("La stringa contiene ripetizioni");
                return;
            }
        } System.out.println("La stringa non contiene ripetizioni");
		
	}
}
