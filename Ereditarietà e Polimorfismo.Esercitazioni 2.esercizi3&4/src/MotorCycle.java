

public class MotorCycle extends Veichle {
	
	
	public int cilindrata;

	public MotorCycle() {
		super();
		cilindrata = 0;
	}
	public MotorCycle(String targa, String marca, String modello, boolean guasto, int cilindrata) {
		super(targa, marca, modello, guasto);
		this.cilindrata = cilindrata; }
		
		
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
		
	
	

	
	
	
	

}
