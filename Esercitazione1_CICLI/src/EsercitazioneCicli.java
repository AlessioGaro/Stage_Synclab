import java.util.Scanner;

public class EsercitazioneCicli {

	public static void main(String[] args) {
		
	/* Scrivere un programma / metodo che data una sequenza di interi stampi "tutti positivi e pari "; se i numeri
	   inseriti sono tutti positivi e pari, altrimenti stampa  "NO" Risolvere questo esercizio senza usare array. */
		
		System.out.println("ESERCIZIO 1");
		
		System.out.println("How manies values do you want to insert? (must be greater than 0)");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b;
		boolean TuttiPariEMaggioriDiZero = true;
		
		
		do {
			System.out.println("Insert a value: " + a + " values remain to be entered");
			b = sc.nextInt();
			if(b<0 || b%2==1) {
				TuttiPariEMaggioriDiZero = false;
			}
			a--;
		}	while (b>=0 && b%2==0 && a>0 && TuttiPariEMaggioriDiZero == true );
			
		if(TuttiPariEMaggioriDiZero == true) {
			System.out.println("Tutti positivi e Pari");
		}	else System.out.println("NO");
		
   /* Scrivere un programma / metodo che data una sequenza di interi stampi la media di tutti i numeri inseriti
      che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato
      dovrà essere 9. Risolvere questo esercizio senza usare array. */
		
		System.out.println("ESERCIZIO 2");
		
		System.out.println("How manies values do you want to insert? (must be greater than 0)");
		a = sc.nextInt();
		int media = 0;
		int divisibiliPerTre = 0;
		
		for (int i=a; i>0; i--) {
			System.out.println("Insert a value: " + i + " values remain to be entered");
			b = sc.nextInt();
			if (b%3==0) {
				media+=b;
				divisibiliPerTre ++;
			}
		}
		if (divisibiliPerTre == 0) {
			System.out.println("none of your values is divisible by three");
		} 	else {
		System.out.println("la media dei valori inseriti che siano divisibili per 3 è: " + (double) media/divisibiliPerTre);
			}
		
	/* Scrivere un programma / metodo che chiede all’utente di inserire una sequenza di caratteri (chiedendo
	   prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti. L’intero procedimento
       (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli) dovrà essere ripetuto 5
       volte. Risolvere questo esercizio senza usare array. */
		
		System.out.println("ESERCIZIO 3");
		
		char d;
		
		for (int i=0; i<5; i++) {
			System.out.println("How manies char do you want to insert? (must be greater than 0)");
			System.out.println(5-i + " sequences of char remained to be entered");
			a = sc.nextInt();
			do {
				System.out.println("Insert a char: " + a + " chars remain to be entered");
				System.out.println("if entered more than one char at time, only the first will be considered");
				d = sc.next().charAt(0);
				System.out.println(d);
				a--;
			}	while (a>0);
			
		}
		
		
		
	}

}
