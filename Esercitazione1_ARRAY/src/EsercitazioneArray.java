
import java.util.Random;

public class EsercitazioneArray {

	public static void main(String[] args) {
		
	/* Scrivere un programma / metodo che preveda un array di 10 numeri interi
	   contenente valori a piacere e ne stampa gli elementi secondo il seguente
	   ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc.  */
		
		System.out.println("ARRAY ESERCIZIO 1");
		
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int j = arr1.length-1;
		
		for (int i=0; i<arr1.length/2; i++) {
			System.out.println("elemento in posizione " + i + " = " + arr1[i]);
			System.out.println("elemento in posizione " + j + " = " + arr1[j]);
			j--;
		}
		
	// aggiungo un modo forse bruttino per ovviare al caso in cui in input abbiamo un numero dispari di elementi
			
		if(arr1.length%2 == 1) {
				System.out.println("elemento in posizione " + (arr1.length/2) + " = " + arr1[arr1.length/2]);
			}
	
	/* Scrivere un programma / metodo che preveda un array di 10 numeri interi contenente
	   valori random. Tale programma dovrà stampare la dicitura "Pari e dispari uguali"
	   se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei
	   numeri in posizioni dispari, altrimenti il programma dovrà stampare la dicitura 
	   "Pari e dispari diversi".  */
		
		System.out.println(" ARRAY ESERCIZIO 2");
		
		 Random rd = new Random();
	     int[] arr2 = new int[10];
	     int sommaPari = 0;
	     int sommaDispari = 0;
	     
	     System.out.println("elementi dell'array:");
	     
	     for (int i = 0; i < arr2.length; i++) {
	    	 arr2[i] = rd.nextInt()/1000000000;
	    	 System.out.println(arr2[i]);
	     }
	     
	     for (int i = 0; i < arr2.length; i++) {
	    	 if (i%2==0) {
	    		 sommaPari += arr2[i];
	    	 }	
	    	 	else sommaDispari += arr2[i];
	     }
	     
	     System.out.println("sommaPari = " + sommaPari);
	     System.out.println("sommaDispari = " + sommaDispari);
	     
	     if (sommaPari == sommaDispari) {
	    	 System.out.println("pari e dispari uguali");
	     }
	     	else  System.out.println("pari e dispari diversi"); 

	/* Scrivere un programma / metodo che preveda un array di 10 numeri interi contenente valori random e che
	   stampi la dicitura "Tre valori consecutivi uguali" se contiene tre valori uguali in tre posizioni
       consecutive,qualora la condizione non dovesse essere verificata dovrà stampare "NO" */
	    
	     System.out.println(" ARRAY ESERCIZIO 3");
	     
	     int [] arr3 = new int[10];
	     
	     System.out.println("elementi dell'array:");
	     
	     for (int i = 0; i < arr3.length; i++) {
	    	 arr3[i] = rd.nextInt()/1000000000;
	    	 System.out.println(arr3[i]); 
	    }
	     
	     boolean treConsecutivi = false;
		
	     for (int i = 0; i < arr3.length-2; i++) {
	    	 if (arr3[i] == arr3[i+1] && arr3[i] == arr3[i+2]) {
	    		 treConsecutivi = true;
	    		 break;
	    	 }
	     }
	     
	     if (treConsecutivi == true) {
	    	 System.out.println("Tre valori consecutivi uguali"); }
	    
	    	 else   System.out.println("NO");
	     
	/* Scrivere un programma / metodo che date due sequenze di stringhe, ciascuna di 5 elementi, stampi il
       messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda, altrimenti sarà
       stampato il messaggio "KO".
        Qualora vengano trovate due stringhe uguali i confronti tra le sequenze devono essere interrotti. */
	    	 
	     
	     System.out.println("ARRAY ESERCIZIO 4");
	     
	     String[] arrString1 = new String[5];
	     String[] arrString2 = new String[5];
	     
	     System.out.println("ELEMENTI DELLA PRIMA STRINGA");
	     for (int i=0; i<arrString1.length;i++) {
	    	 arrString1[i] = RandomString.getString(1);
	    	 System.out.println(arrString1[i]);
	     }
	     
	     System.out.println("ELEMENTI DELLA SECONDA STRINGA");
	     for (int i=0; i<arrString2.length;i++) {
	    	 arrString2[i] = RandomString.getString(1);
	    	 System.out.println(arrString2[i]);
	     }
	     
	     boolean OK = false;
	     for(int i=0; i<arrString1.length;i++) {
	    	 for(int k=0; k<arrString2.length; k++) {
	    		 if (arrString1[i].equals(arrString2[k])) {
	    			 OK = true;
	    			 break;
	    		 }
	    	 }
	     }
	     
	     System.out.println("Risultato");
	     if (OK == true)
	    	 System.out.println("OK");
	     else System.out.println("KO");
	     
	     
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
