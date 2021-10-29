import java.util.Scanner;
import java.util.Random;


public class EsercitazioneStringhe {

	public static void main(String[] args) {
		
	// Scrivere un programma / metodo che data una stringa in input la stampi al contrario.
	
		System.out.println("ESERCIZIO 1");
		
		System.out.println("immettere la stringa desiderata");
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		StringBuilder string1Reverse = new StringBuilder(string1.length());
		
		for (int i = string1.length()-1; i>=0; i--) {
			string1Reverse.append(string1.charAt(i));
		}
		 
		System.out.println(string1Reverse);
		
	// Scrivere un programma / metodo che data una stringa in input ne stampi le sole vocali.
		
		System.out.println("ESERCIZIO 2");
		
	// per semplicità utilizzo come input la stessa stringa richiesta in ingresso per l'esercizio precedente
		
		String string1OnlyVowels = "";
		
		for (int i = 0; i<string1.length(); i++) {
			char c = string1.charAt(i);
			if (c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'|| c == 'I' || c == 'O' || c == 'U')
			string1OnlyVowels += c;
		}
		
		System.out.println(string1OnlyVowels);
		
	/* Scrivere un programma / metodo che data una sequenza di stringhe, conclusa dalla stringa vuota, stampi
       la somma delle lunghezze delle stringhe che iniziano con una lettera maiuscola. */
		
		System.out.println("ESERCIZIO 3");
	
		 Random rd = new Random();
		 
		  String [] str1 = new String[10];
		
		 for (int i=0; i<str1.length-1; i++) {
			 str1[i] = RandomString1.getString( rd.nextInt(10)+1);
			 System.out.println(str1[i]);
		 }
		 
		 str1[9] = "";
		 System.out.println(str1[9]);
		 
		 int sommaMaiuscole = 0;
		 
		 for (int i=0; i< str1.length-1; i++) {
			 char c = str1[i].charAt(0);
			 if (Character.isUpperCase(c)) {
				 sommaMaiuscole += str1[i].length();
			 }
		 }
		 
		 System.out.println("la somma delle lunghezze delle stringhe che iniziano con una lettera maiuscola è: " + sommaMaiuscole);
	
	
	
	
	
	
	
	
	
	}

}
