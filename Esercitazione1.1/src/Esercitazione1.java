import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;

public class Esercitazione1 {
	
	public static void main (String[] args) {
	
/* dato un array di interi, popolato casualmente, ordinarlo in ordine crescente e stampare a video il risultato
   di tale ordinamento.  */	
		
		
	System.out.println("ESERCIZIO 1");
	
	Scanner sc = new Scanner(System.in);
	
	int a = -1;
	
	while(a<=0) {
		try {
			System.out.println("PLEASE, ENTER THE LENGTH OF THE ARRAY TO SORT");
			System.out.println("(must be a value greater than zero)");
			a = sc.nextInt();
		}	catch (InputMismatchException exc) {
			sc.next();
		}
	}
	
	
	int [] array = new int[a];
	
	Random rd = new Random();
	System.out.println("starting random elements of array");
	for(int i=0;i<array.length;i++) {
		int b = rd.nextInt()/10000000;
		array[i] = b;
		System.out.println(array[i]);
	}
	
	int temp;
	
	for(int i=1;i<array.length;i++) {
		for(int j=i;j>0;j--) {
			if (array[j]<array[j-1]) {
				temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}	
		}
	}
	System.out.println("that is your sorted array:");
	for(int i=0; i<array.length;i++) {
		System.out.println(array[i]);
	}
	
/* Scrivere un metodo che verifichi se una data stringa inserita in input è palindroma, tale metodo dovrà
   restituire un booleano. */
	
	System.out.println("ESERCIZIO 2");
	
	System.out.println("insert String here without spaces"); 
	String b = sc.next();
	
	int j = b.length()-1;
	boolean palindroma = true;
	
	for(int i=0; i< b.length()/2; i++) {
		if(b.charAt(i) == (b.charAt(j))) {
			j--;
		}	else {
				palindroma = false;
		}
	}
	
	System.out.println ("la stringa è palindroma? " + palindroma);
	
/* Scrivere un metodo che mostri i primi 50 numeri della serie di fibonacci (i primi due numeri di fibonacci
   sono 0 e 1 i successivi si calcolano come somma dei 2 precedenti). */
	
	System.out.println("ESERCIZIO 3");
	
	long[] fib = new long[50];
	fib[0] = 0;
	fib[1] = 1;
	
	System.out.println(fib[0]);
	System.out.println(fib[1]);
	
	for (int i=2; i<fib.length; i++ ) {
		fib[i] = fib[i-1] + fib[i-2];
		System.out.println(fib[i]);
	}
	
/* Data una matrice effettuare la trasposta della stessa.*/
	
	System.out.println("ESERCIZIO 4");
	


	// nextInt is normally exclusive of the top value,
	// so add 1 to make it inclusive
	
	int x = ThreadLocalRandom.current().nextInt(1, 10+1);
	int y = ThreadLocalRandom.current().nextInt(1, 10+1);
	
	System.out.println("matrix has " + x + " rows and " + y + " columns");
	
	int [][] matrix = new int [x][y] ;
	int [][] matrixTrasposta = new int [y][x];
	
	for (int i=0; i<matrix.length; i++) {
		for(int z=0; z<matrix[i].length; z++) {
			matrix[i][z] = ThreadLocalRandom.current().nextInt(1, 50); 
			System.out.print(matrix[i][z] + " ");
		}
		System.out.println();
	}
	
	System.out.println("that is the previous matrix transposed");
	
	
	for (int i=0;i<matrix[0].length;i++) {
		for (int z=0;z<matrix.length; z++) {
			matrixTrasposta[i][z] = matrix[z][i];
			System.out.print(matrixTrasposta[i][z] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	}
}
