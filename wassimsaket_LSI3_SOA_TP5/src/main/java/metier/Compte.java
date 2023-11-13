package metier;

import java.sql.Time;
import java.util.Date;

public class Compte {
	private int code;
	private double solde;
	private Date date;
	
	public Compte() {
		super();
	}

	public Compte(int code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.date = date;
	}

	
	public int getCode() {
		return code;
	}
	
	public double getSolde() {
		return solde;
	}

	public Date getDate() {
		return date;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
