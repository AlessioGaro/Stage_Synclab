package classiTabelle;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="figure")


public class Figure {
	
	@Id
	@Column(name="fiscal_code")
	private String fiscalCode;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	public Figure() {
		
	}

	public Figure(String fiscalCode, String name, String surname) {
		this.fiscalCode = fiscalCode;
		this.name = name;
		this.surname = surname;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "Figure [fiscalCode=" + fiscalCode + ", name=" + name + ", surname=" + surname + ", employee=" + employee
				+ ", candidate=" + candidate + "]";
	}
	
	
	
	

}
