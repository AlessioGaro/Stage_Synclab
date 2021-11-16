

public class Car extends Veichle {
	
	public String tipo;

	public Car(String targa, String marca, String modello, boolean guasto, String tipo) {
		super(targa, marca, modello, guasto);
		this.tipo = tipo;
	}
	
	public Car() {
		super();
		tipo = null;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	

	
	

}
