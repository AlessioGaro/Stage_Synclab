import java.util.LinkedList;
import java.util.Random;

public class Main {

	static LinkedList<Integer> creaRandomCrescente(int n) {
		Random rd = new Random();
		int temp;
		System.out.println("increasing random values");
		LinkedList <Integer> list = new LinkedList <Integer>();
		list.add(rd.nextInt(100));
		int tempPrev = list.get(0);
		System.out.println(list.get(0));
		for(int i=1; i< n; i++) {
			temp = rd.nextInt(10)+1;
			tempPrev = tempPrev+temp;
			list.add(tempPrev);
			System.out.println(list.get(i));
		}
		return list;
	} 
	
	static LinkedList<Integer> parseString(LinkedList<String> a) {
		 LinkedList<Integer> Def = new LinkedList();
		for(String temp : a) {
			int tempInt = Integer.parseInt(temp);
			Def.add(tempInt);
			System.out.println(temp);
		}	return Def;
	}
	
	static void provaEx2() {
		Main main = new Main();
		LinkedList<String> fromString = new LinkedList();
		System.out.println("from String....");
		for(int i=0; i<10; i++) {
			fromString.add(main.getAlphaNumericString(2));
			System.out.println(fromString.get(i));
		}
		System.out.println("...to Integer");
		main.parseString(fromString);
	}
	
	 static String getAlphaNumericString(int n) { 
		
		 //rimuovendo la A dai caratteri validi per formare le stringhe non genereremo più eccezioni
		 //durante la trasformazione da String a Integer
		 
		 String AlphaNumericString = "0123456789" + "A";
	     StringBuilder sb = new StringBuilder(n);
	  
	    for (int i = 0; i < n; i++) {
	        int index = (int)(AlphaNumericString.length() * Math.random());
	        sb.append(AlphaNumericString.charAt(index));
	    }
	    return sb.toString();
	 }
	
	public static void main(String[] args) {
	
		Main.creaRandomCrescente(5);
		Main.provaEx2();
	}

}
