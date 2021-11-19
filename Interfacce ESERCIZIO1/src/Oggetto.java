import java.util.Scanner;

public class Oggetto implements QuadratoCubo{
	
	int valore;
	
	Scanner sc = new Scanner(System.in);
	
	public Oggetto(int valore) {
		this.valore = valore;
	}
	
	public Oggetto() {
		System.out.println("inserire il valore desiderato");
		this.valore = sc.nextInt();
	}
	
	public int calcolaQuadrato() {
		Oggetto quadrato = new Oggetto(valore*valore);
		System.out.println("generata nuova istanza avente indirizzo di memoria: " + quadrato + " e valore: " + quadrato.valore);
		return valore*valore;
	}
	
	public int calcolaCubo() {
		Oggetto cubo = new Oggetto(valore*valore*valore);
		System.out.println("generata nuova istanza avente indirizzo di memoria: " + cubo + " e valore: " + cubo.valore);
		
		return valore*valore*valore;
	}
}
