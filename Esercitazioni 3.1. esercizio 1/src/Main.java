import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
	
	public static LinkedList<Integer> creaRandom(int n, int max) {
		Random rd = new Random();
		int temp;
		LinkedList <Integer> list = new LinkedList <Integer>();
		for(int i=0; i< n; i++) {
			temp = rd.nextInt(max);
			list.add(temp);
			
		} 
		return list;
	}
	
	static void Stamp(Iterator<Integer> i) {  
		while(i.hasNext()){  
			System.out.println(i.next());  
				  } 
	}
	
	static void provaEx1() {
		
		LinkedList<Integer> temp = Main.creaRandom(20, 100);
		Iterator<Integer> iter = temp.iterator();
		
		System.out.println("notSorted");
		Main.Stamp(iter);
		
		System.out.println("sorted");
		Comparator<Integer> order = Integer::compare;
		temp.sort(order);
		Iterator<Integer> iter2 = temp.iterator();
		Main.Stamp(iter2);
		 
		
	}
	
	public static ArrayList<Integer> creaRandom1(int n, int max) {
		Random rd = new Random();
		int temp;
		ArrayList <Integer> list2 = new ArrayList <Integer>();
		for(int i=0; i< n; i++) {
			temp = rd.nextInt(max);
			list2.add(temp);
			
		} 
		return list2;
	}
	
	
	
	
	static void provaEx12() {
		
		ArrayList<Integer> temp = Main.creaRandom1(20, 100);
		Iterator<Integer> iter = temp.iterator();
		
		System.out.println("notSorted");
		Main.Stamp(iter);
		
		System.out.println("sorted");
		Comparator<Integer> order = Integer::compare;
		temp.sort(order);
		Iterator<Integer> iter2 = temp.iterator();
		Main.Stamp(iter2);
		 
		
	}

	public static void main(String[] args) {
		
	System.out.println("LinkedList");
		Main.provaEx1();
	System.out.println("ArrayList");	
		Main.provaEx12();
	
		
		
		
		
		
		
		
		

	}

}
