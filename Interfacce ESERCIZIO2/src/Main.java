
public class Main {

	public static void main(String[] args) {
		
		Distributore dis1 = new Distributore("Legnano","Marelli", 500, 90);
		Distributore dis2 = new Distributore("Milano", "Caratelli", 800,45);
		
		dis1.rifornimento();
		
		dis1.compareTo(dis2);

	}

}
