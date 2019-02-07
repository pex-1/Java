package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Usluga {
	private Klijent klijent;
	private String vrstaUsluge;
	private String opisUsluge;
	private LocalDate datumUsluge;
	private BigDecimal cijenaUsluge;
	private boolean obavljena = false;
	private boolean naplacena = false;
	
	public Usluga(Klijent klijent, String vrstaUsluge, String opisUsluge, LocalDate datumUsluge,
			BigDecimal cijenaUsluge, boolean obavljena, boolean naplacena) {
		super();
		this.klijent = klijent;
		this.vrstaUsluge = vrstaUsluge;
		this.opisUsluge = opisUsluge;
		this.datumUsluge = datumUsluge;
		this.cijenaUsluge = cijenaUsluge;
		this.obavljena = obavljena;
		this.naplacena = naplacena;
	}
	
	public Klijent getKlijent() {
		return klijent;
	}
	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}
	public String getVrstaUsluge() {
		return vrstaUsluge;
	}
	public void setVrstaUsluge(String vrstaUsluge) {
		this.vrstaUsluge = vrstaUsluge;
	}
	public String getOpisUsluge() {
		return opisUsluge;
	}
	public void setOpisUsluge(String opisUsluge) {
		this.opisUsluge = opisUsluge;
	}
	public LocalDate getDatumUsluge() {
		return datumUsluge;
	}
	public void setDatumUsluge(LocalDate datumUsluge) {
		this.datumUsluge = datumUsluge;
	}
	public BigDecimal getCijenaUsluge() {
		return cijenaUsluge;
	}
	public void setCijenaUsluge(BigDecimal cijenaUsluge) {
		this.cijenaUsluge = cijenaUsluge;
	}
	public boolean isObavljena() {
		return obavljena;
	}
	public void setObavljena(boolean obavljena) {
		this.obavljena = obavljena;
	}
	public boolean isNaplacena() {
		return naplacena;
	}
	public void setNaplacena(boolean naplacena) {
		this.naplacena = naplacena;
	}
	

}
