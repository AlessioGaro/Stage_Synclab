import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class TestVeichles {

	public static int selectRandomCilindrata() {
		List<Integer> cilindrataBike =Arrays.asList(50, 125, 150, 250, 600, 1000, 1200);
			Random r = new Random();
			int randomitem = r.nextInt(cilindrataBike.size());
		    int randomElement = cilindrataBike.get(randomitem);
		    return randomElement; 
	}
	
	public static String selectRandomTipo() {
		List<String> tipoVettura = Arrays.asList("berlina", "monovolume", "compatta", "spider", "suv", "stationWagon");
		  Random r = new Random();
		  		int randomitem = r.nextInt(tipoVettura.size());
		  		String randomElement = tipoVettura.get(randomitem);
		  		return randomElement;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Veichle[] veicoli = new Veichle[10];
		
		//i primi 5 elementi sono motveicoli, i secondi 5 sono auto"
		//genero casualmente cilindrata e tipo rispettivamente pescando casualmente dalle liste sopra
		//rendo guasti gli elementi di indice dispari
		
		
		for (int i=0; i<veicoli.length; i++) {
			if (i<5) {
			veicoli[i] = new MotorCycle();
			((MotorCycle) veicoli[i]).setCilindrata(selectRandomCilindrata());
			System.out.println(((MotorCycle) veicoli[i]).getCilindrata()); 
			} else {
				veicoli[i] = new Car();
				((Car) veicoli[i]).setTipo(selectRandomTipo());
				System.out.println(((Car) veicoli[i]).getTipo());
			}
			if (i%2==1) {
				veicoli[i].setGuasto(true);
			}
		}
		
		veicoli[0].setTarga("GG666GG");
		veicoli[1].setTarga("DX562EF");
		veicoli[2].setTarga("CD639RT");
		veicoli[3].setTarga("QW491OR");
		veicoli[4].setTarga("FF56PUY");
		veicoli[5].setTarga("CD411QQ");
		veicoli[6].setTarga("JD599ML");
		veicoli[7].setTarga("VO690YG");
		veicoli[8].setTarga("QW123QW");
		veicoli[9].setTarga("YJ123JH");
		
		for (int i=0; i<veicoli.length; i++) {
			if (veicoli[i].isGuasto() == true) {
				System.out.println("il veicolo targato: " + veicoli[i].getTarga() + " si è guastato.");
			}
		}
		
	//ESERCIZIO 2
		
		System.out.println("ESERCIZIO 2");
		
		Garage garage = new Garage();
		
		for (int i=0; i<veicoli.length; i++) {
			garage.repair(veicoli[i]);
		}
		
		
	}
}

	


