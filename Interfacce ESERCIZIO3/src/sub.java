
public class sub extends Common implements Operazione {
	
	public double operazione() {
		System.out.println("inserisci il primo valore");
		double a = sc.nextDouble();
		System.out.println("inserisci il secondo valore");
		double b = sc.nextDouble();
		result = a-b;
		return result;
	}
	

}
