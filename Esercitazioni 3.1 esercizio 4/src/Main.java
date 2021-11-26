import java.util.LinkedList;

public class Main {
	
	static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n) {
		LinkedList<LinkedList<Integer>> contenitore = new LinkedList();
		
			for(int i=0; i<n; i++) {
				contenitore.add(new LinkedList<Integer>());
				for(int j=0;j<=i;j++) {
					contenitore.get(i).add(j);
				}
			}
		return contenitore;
} 
	
	static void stampa(LinkedList<LinkedList<Integer>> a) {
		System.out.println(a);
	}
	
	
	public static void main(String [] args) {
		
		Main.stampa(Main.insiemeDiInsiemi(5));
		
	}

}
