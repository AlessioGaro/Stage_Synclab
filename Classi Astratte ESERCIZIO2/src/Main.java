
public class Main {

	public static void main(String[] args) {
		
		Moneta moneta = new Moneta("euro");
		Dado dado6facce = new Dado("dado1", 6);
		Dado dado20facce = new Dado("dado2", 20);

		moneta.determinaResult();
		dado6facce.determinaResult();
		dado20facce.determinaResult();
	}

}
