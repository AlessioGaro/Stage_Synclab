
public class CreditCard {
	
	private int code;
	private double credit;
	
	
	
	public CreditCard(int code, double credit) {
		super();
		this.code = code;
		this.credit = credit;
	}

	public int getCode() {
	return code;
	}
	
	public double getCredit() {
		return credit;
	}
	
	public double caricaTessera(double credit) {
		this.credit = this.credit+credit;
		System.out.println("nuovo credito della tessera "+ this.getCode() + " : " + this.getCredit());
		return this.credit;
	}
	
	
	

}
