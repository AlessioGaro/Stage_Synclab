import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	HashMap <Integer, Double> listaCarte;
	
	public void leggiCredito(Integer codex) throws TesseraNonValidaException {
		boolean found = false;
		for(Map.Entry<Integer, Double> b : listaCarte.entrySet()) {
			
			if(b.getKey().equals(codex)) {
				found = true;
				System.out.println("credito rimasto per la carta " + b.getKey() + " : " + b.getValue());
			
			}
		}
		if (found == false) {
			throw new TesseraNonValidaException("nessuna tessera associata al codice inserito");
			
		}
		
	}
	
	public boolean prelievo(Integer code, double price) throws CreditoInsufficienteException, TesseraNonValidaException {
		boolean found = false;
		for(Map.Entry<Integer, Double> b : listaCarte.entrySet()) {
			
			if(b.getKey().equals(code)) {
				found = true;
				if(b.getValue()>=price) {
					b.setValue(b.getValue()-price);
					System.out.println("transazione eseguita, credito rimasto: " + b.getValue());
					
				} else  { throw new CreditoInsufficienteException("credito insufficiente"); }
					
				
			}
		} 	
		if (found == false) {
			throw new TesseraNonValidaException("tessera non riconosciuta dal sistema");
			
		}
		else return true;
	
	}	

}
