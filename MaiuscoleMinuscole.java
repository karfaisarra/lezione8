package lezione8;

import java.util.Scanner;

public class MaiuscoleMinuscole {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String parola=scanner.next();
		String parolaMaiuscola=parola.toUpperCase();
		String newString = "";
		
		for (int i = 0, j=0; i < parola.length() && j < parolaMaiuscola.length(); i++, j++) {
			String c1 = ""+parola.charAt(i);
			String c2 = ""+parolaMaiuscola.charAt(j);
			if(c1.equals(c2)) {
				newString+=c1.toLowerCase();
			}else {
				newString+=c1.toUpperCase();
			}
            
        }
		
		System.out.println("Parola modificata: " + newString);
		scanner.close();
	}
}
