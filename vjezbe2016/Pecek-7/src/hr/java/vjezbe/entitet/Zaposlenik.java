package hr.java.vjezbe.entitet;
import java.io.Serializable;

public class Zaposlenik extends Osoba implements Serializable {
	private String korisnickoIme;
	private String sifraZaposlenika;
	
	public Zaposlenik(String korisničkoIme, String ime, String prezime, String sifraZaposlenika) {
		super(ime, prezime);
		this.korisnickoIme = korisničkoIme;
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisničkoIme) {
		this.korisnickoIme = korisničkoIme;
	}
	public String getSifraZaposlenika() {
		return sifraZaposlenika;
	}
	public void setSifraZaposlenika(String sifraZaposlenika) {
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	

}
