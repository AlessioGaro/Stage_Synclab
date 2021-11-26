import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
	
	static LinkedList<Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
		
		 LinkedList<Integer> merged = new LinkedList<Integer>();
		 
		 Integer value1 = (a.hasNext() ? a.next() : null);
		 Integer value2 = (b.hasNext() ? b.next() : null);
		 while (value1 != null || value2 != null) {
			 if (value2 == null || (value1 != null && value1.compareTo(value2) <= 0)) {
				 	merged.add(value1);
		            value1 = (a.hasNext() ? a.next() : null);
			 } else {
				 merged.add(value2);
		         value2 = (b.hasNext() ? b.next() : null);
			 }
	
	
		 } return merged;
	}
	
	static void provaEx3() {
		
		Random rd = new Random();
		int temp;
		LinkedList <Integer> list1 = new LinkedList <Integer>();
		LinkedList <Integer> list2 = new LinkedList <Integer>();
		
		System.out.println("lista 1");
		
		list1.add(rd.nextInt(10));
		int tempPrev = list1.get(0);
	
		for(int i=1; i< 5; i++) {
			temp = rd.nextInt(10)+1;
			tempPrev = tempPrev+temp;
			list1.add(tempPrev);
			
		}
		System.out.println(list1);
		temp = 0;
		
		System.out.println("lista 2");
		
		list2.add(rd.nextInt(10));
		tempPrev = list2.get(0);
		
		for(int i=1; i< 5; i++) {
			temp = rd.nextInt(10)+1;
			tempPrev = tempPrev+temp;
			list2.add(tempPrev);
			
		}
		System.out.println(list2);
		Iterator<Integer> a = list1.iterator();
		Iterator<Integer> b = list2.iterator();
		
		System.out.println("liste mergiate");
		
		System.out.println(Main.mergeOrdinato(a, b));
	
	}
	
	public static void main(String[] arg) {
		
		
		Main.provaEx3();
	}

}
