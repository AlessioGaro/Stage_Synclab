import java.util.Scanner;

public class Distributore implements Confronto{
	
	private String citt�;
	private String proprietario;
	private double capacit�;
	private double residuo;
	private double incassi;
	Scanner sc = new Scanner(System.in);
	boolean error = true;
	double benzina;
	
	public Distributore(String citt�, String proprietario, double capacit�, double residuo) {
		this.citt� = citt�;
		this.proprietario = proprietario;
		this.capacit� = capacit�;
		this.residuo = residuo;
		
		
	}
	
	public void rifornimento() {
		
		do {
			System.out.println("quanti litri di benzina vuole?");
			try{
				benzina = sc.nextDouble();
				
				if(benzina >45) {
					System.out.println("pu� rifornirsi al massimo di 45 litri, che corrsiponde ad un pieno");
				}
				else if(benzina<0) {
					System.out.println("il numero inserito dev'essere positivo e maggiore di zero");
				}
				else if(benzina>residuo ) {
					System.out.println("mi dispiace, l'autonomia della pompa � di " + residuo);
					System.out.println("procediamo a rifornirla fino a svuotare la pompa");
					benzina = residuo;
					error = false;
				} else {
					error = false; 
					}
			}
			catch (Exception e){
				System.out.println("il valore dev'essere espresso in cifra!");
				sc.next();
			}
		} while(error );
		
		incassi = 1.70*benzina;
		residuo = residuo-benzina;
		
		System.out.println("PREZZO AL LITRO: 1,70$, costo dell'ultimo rifornimento: " + incassi);
		System.out.println("nella pompa rimangono " + residuo + " litri di benzina");
		
		
	}
	
	public double compareTo(Distributore dis) {
		System.out.println("la pompa situata a " + this.citt� + ", appartenente a " + this.proprietario + " ha ancora la seguente disponibilit� espressa in litri: " +this.residuo);
		System.out.println("la pompa situata a " + dis.citt� + ", appartenente a " + dis.proprietario + " ha ancora la seguente disponibilit� espressa in litri: " +dis.residuo);
		double differenza = residuo-dis.residuo;
		if(differenza>0) 
			System.out.println("la pompa di " + this.proprietario + " ha disponibilit� maggiore");
		else if (differenza<0)
			System.out.println("la pompa di " + dis.proprietario + " ha disponibilit� maggiore");
		else System.out.println("le due pompe hanno pari disponibilit�");
		return differenza;
	}

}
