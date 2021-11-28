
public class Filmato extends ElementoRiproducibile implements Luminosita {
	
	private int luminosita;

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		if (luminosita>=0 && luminosita <=5) {
			this.luminosita = luminosita;
		} else if (luminosita >5) {
			this.luminosita = 5;
		} else this.luminosita = 0;
	}
	
	public void darker() {
		if(luminosita == 0);
		else luminosita--;
		
	}
	
	public void brighter() {
		if(luminosita == 5);
		else luminosita++;
	}
	
	public String getAsterischi() {
		String temp = "";
		for(int i=0;i<luminosita;i++) {
			temp = temp + "*";
		}	return temp;
	}
	
	public void modificaLuminosita() {
		boolean valid = false;
		do {
			System.out.println("vuoi alzare o abbassare la luminosità del file?");
			System.out.println("digita 1 per aumentarla");
			System.out.println("digita 0 per diminuirla");
			System.out.println("digita -1 per non modificarla");
		try {
				int lum = scc.nextInt();
				if(lum!=0 && lum!=1 && lum!=-1) System.out.println("inserisci un valore valido");
				else if(lum == 0) {
					darker();
					valid = true;
				}
				else if(lum ==1) {
					brighter();
					valid = true;
				}
				else valid = true;
			} catch(Exception e) {
				System.out.println("inserisci un valore numerico che sia 0 oppure 1");
				scc.next();
			}
	} while(valid == false);
	
}	
	
	public void play() {
		for(int i=0; i<getDurata();i++) {
			System.out.println(getTitolo() + getExclamation() + getAsterischi());
		}
	}
}
