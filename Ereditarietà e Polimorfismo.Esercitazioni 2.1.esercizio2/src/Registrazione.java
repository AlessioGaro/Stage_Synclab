
public class Registrazione extends ElementoRiproducibile{
	
	
	
	
	public void play() {
		for(int i=0; i<getDurata();i++) {
			System.out.println(getTitolo() + getExclamation());
		}
	}
}
