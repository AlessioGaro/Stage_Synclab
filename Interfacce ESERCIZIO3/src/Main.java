import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int b = 0;
		boolean error = true;
		
		sub sub = new sub();
		div div = new div();
		mol mol = new mol();
		
		
		
		
		for(int i=3;i>0;i--) {
			
		
		do {  
			
			System.out.println("operazioni rimanenti: " + i);
			System.out.println("digita il numero corrispondente all'operazione che intendi eseguire");
		    System.out.println("inserendo un valore compreso tra 1 e 3");
			System.out.println("1) sottrazione");
			System.out.println("2) divisione");
			System.out.println("3) moltiplicazione");
			
		try {	String a = s.next();
			b = Integer.parseInt(a);
			error = false; }
		catch (Exception e) {
			System.out.println("hai inserito uno o più caratteri non validi");
			}
		} while (error || b<=0 || b>3);
			
		if(b == 1) {
			sub.operazione();
			sub.stampaResult();
		}
		
		else if(b == 2) {
			div.operazione();
			div.stampaResult();
		}
		
		else {
			mol.operazione();
			mol.stampaResult();
		}
			
			
			
			
			
			
			
			
		}	
			
	}

}
