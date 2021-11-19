
public class Main {

	public static void main(String[] args) {
		
		Cilindro cilindro1 = new Cilindro();
		Parallelepipedo parall1 = new Parallelepipedo();
		
		cilindro1.raggio = 2;
		cilindro1.nome = "cilindro";
		cilindro1.altezza = 8;
		
		parall1.lato1 = 5;
		parall1.lato2 = 3;
		parall1.nome = "parallelepipedo";
		parall1.altezza = 3.5;
		
		cilindro1.calcolaArea();
		cilindro1.calcolaVolume();
		
		parall1.calcolaArea();
		parall1.calcolaVolume();
	}

}
