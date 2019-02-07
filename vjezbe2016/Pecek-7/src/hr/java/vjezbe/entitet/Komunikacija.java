package hr.java.vjezbe.entitet;
import java.time.LocalDateTime;
import java.io.Serializable;

public class Komunikacija implements Serializable{
	private Klijent klijent;
	private Zaposlenik zaposlenik;
	private String vrstaKomunikacije;
	private String sadrzajKomunikacije;
	private LocalDateTime vrijemeKomunikacije;
	public Komunikacija(Klijent klijent, Zaposlenik zaposlenik, String vrstaKomunikacije, String sadrzajKomunikacije,
			LocalDateTime vrijemeKomunikacije) {
		super();
		this.klijent = klijent;
		this.zaposlenik = zaposlenik;
		this.vrstaKomunikacije = vrstaKomunikacije;
		this.sadrzajKomunikacije = sadrzajKomunikacije;
		this.vrijemeKomunikacije = vrijemeKomunikacije;
	}
	public Klijent getKlijent() {
		return klijent;
	}
	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}
	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}
	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
	public String getVrstaKomunikacije() {
		return vrstaKomunikacije;
	}
	public void setVrstaKomunikacije(String vrstaKomunikacije) {
		this.vrstaKomunikacije = vrstaKomunikacije;
	}
	public String getSadrzajKomunikacije() {
		return sadrzajKomunikacije;
	}
	public void setSadrzajKomunikacije(String sadrzajKomunikacije) {
		this.sadrzajKomunikacije = sadrzajKomunikacije;
	}
	public LocalDateTime getVrijemeKomunikacije() {
		return vrijemeKomunikacije;
	}
	public void setVrijemeKomunikacije(LocalDateTime vrijemeKomunikacije) {
		this.vrijemeKomunikacije = vrijemeKomunikacije;
	}
	
	

}
