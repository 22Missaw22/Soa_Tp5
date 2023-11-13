package service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

@WebService(name = "BS")
public class BanqueService {
	@WebMethod(operationName = "cnv")
	public double conversion (@WebParam(name = "mt") double montant) {
		return montant * 3.36;
	}
	
	@WebMethod(operationName = "cpt")
	public Compte getCompte(@WebParam(name = "c") int code) {
		return new Compte(code,0, new Date());
	}
	
	@WebMethod(operationName = "gcpt")
	public ArrayList<Compte> getComptes(@WebParam(name = "n") int nbr) {
		ArrayList<Compte> cs = new ArrayList<>();
		BanqueService bs = new BanqueService();
		for (int i=0;i<nbr;i++) {
			cs.add(bs.getCompte(i));
		}
		return cs;
	}
	
}
