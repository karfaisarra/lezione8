package lezione8;

public class ProvaVeicolo {
	public static void main(String[] args) {
		
		Vettura macchina = new Vettura("FC520S6", "Renault", "Clio", false, "Segmento B");
		System.out.println(macchina.getTarga());
		System.out.println(macchina.getMarca());
		System.out.println(macchina.getModello());
		System.out.println(macchina.isGuasto());
		System.out.println(macchina.getTipologia());
		
		Motociclo moto = new Motociclo("6620FG", "Honda", "F206", false, 330);
		System.out.println(moto.getTarga());
		System.out.println(moto.getMarca());
		System.out.println(moto.getModello());
		System.out.println(moto.isGuasto());
		System.out.println(moto.getCilindrata());
	}
}
