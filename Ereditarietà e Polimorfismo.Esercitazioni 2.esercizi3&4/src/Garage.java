
public class Garage {
	
	public int repair(Veichle veicolo) {
		if (veicolo.isGuasto() == true && veicolo instanceof Car) {
			veicolo.setGuasto(false);
			System.out.println("l'automobile targata " + veicolo.getTarga() + " è stata riparata al costo di 2000 dollari: ");
			return 2000;
			}
			else if (veicolo.isGuasto() == true && veicolo instanceof MotorCycle) {
				veicolo.setGuasto(false);
				System.out.println("la moto targata " + veicolo.getTarga() + " è stata riparata al costo di 1000 dollari");
				return 1000;
				}
			else if (veicolo.isGuasto() == false && veicolo instanceof Car) {
				System.out.println("l'automobile targata " + veicolo.getTarga() + " non necessita di riparazioni; spese totali 100 dollari");
				return 150; 
				}
			else  {
				System.out.println("la moto targata " + veicolo.getTarga() + " non necessita di riparazioni; spese totali 50 dollari");
				return 50;  
		}
		
	}

}
