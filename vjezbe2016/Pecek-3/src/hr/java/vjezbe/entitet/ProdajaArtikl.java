package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdajaArtikl extends Usluga implements Robna {
	private Artikl artikl;

	public ProdajaArtikl(Klijent k2, String serviceType, String service, LocalDate date, BigDecimal price, boolean paid,
			boolean done, Artikl a) {
		super(k2, serviceType, service, date, price, paid, done);
		this.artikl = a;
	}
	//get i set
	public Artikl getA() {
		return artikl;
	}

	public void setA(Artikl a) {
		this.artikl = a;
	}
	
	public BigDecimal prodaja(int brojArtikala){
		setPaid(true);
		setDone(true);
		return getPrice().multiply(new BigDecimal(brojArtikala));
	}
	

}
