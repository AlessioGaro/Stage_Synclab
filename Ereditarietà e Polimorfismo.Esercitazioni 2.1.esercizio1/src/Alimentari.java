import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Alimentari extends Prodotti {
	
	private Date dataScadenza;
	
	
	Scanner sc = new Scanner(System.in);
	
	public Alimentari(String codiceBarre, String descrizione, double prezzoUnitario, String nome) {
		super(codiceBarre, descrizione, prezzoUnitario, nome);
		setDataScadenza();
		
	}
	
	public Date getDataScadenza() {
		return dataScadenza;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	
	public void setDataScadenza() {
		boolean valid = true;
		do {
			
			try {
				System.out.println("Scadenza " + getNome());
				System.out.println("la data deve rispettare il seguente formato: dd.MM.yyyy");
				this.dataScadenza = sdf.parse(sc.next());
				valid = false;
		} 	catch (ParseException e) {
				System.out.println("data non valida");
		}
		}  while(valid);
}

	@Override
	public double applicaSconto() {
		double a = 0;
		Date date = new Date();
		long diffInMillies = Math.abs(getDataScadenza().getTime() - date.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
	    if(diff<9) {
	    	a=getPrezzoUnitario()*0.80; 
	    	return a;
	    }
	    	else {return super.applicaSconto();
	    		
	    	}
	}
	
	
	
	
	

}
