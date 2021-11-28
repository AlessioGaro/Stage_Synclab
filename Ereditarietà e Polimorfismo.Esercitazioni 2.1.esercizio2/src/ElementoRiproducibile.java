import java.util.Scanner;

public abstract class ElementoRiproducibile extends ElementoMultimediale {

	Scanner scc = new Scanner(System.in);
	private int durata;
	
	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public String getExclamation() {
		String temp = "";
		for(int i=0;i<volume;i++) {
			temp = temp + "!";
		}	return temp;
	}	

	public void setVolume(int volume) {
		if (volume>=0 && volume <=10) {
			this.volume = volume;
		} else if (volume >10) {
			this.volume = 10;
		} else this.volume = 0;
	}

	public void weaker() {
		if(volume == 0);
		else volume--;
	}
	
	public void louder() {
		if(volume == 10);
		else volume++;
	}



	public int getDurata() {
		return durata;
	}



	public void setDurata(int durata) {
		this.durata = durata;
	}

	

	public abstract void play();
	
	public void modificaVolume() {
		boolean valid = false;
		do {
			System.out.println("vuoi alzare o abbassare il volume del file?");
			System.out.println("digita 1 per aumentarlo");
			System.out.println("digita 0 per diminuirlo");
			System.out.println("digita -1 per non modificarlo");
		try {
				int vol = scc.nextInt();
				if(vol!=0 && vol!=1 && vol!=-1) System.out.println("inserisci un valore valido");
				else if(vol == 0) {
					weaker();
					valid = true;
				}
				else if (vol ==1)  {
					louder();
					valid = true;
				}
				else valid = true;
			} catch(Exception e) {
				System.out.println("inserisci un valore numerico che sia 0 oppure 1");
				scc.next();
			}
	} while(valid == false);
	
}	
	
	
	
	
	
	
}
