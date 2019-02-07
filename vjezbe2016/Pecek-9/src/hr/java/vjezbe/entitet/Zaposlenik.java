package hr.java.vjezbe.entitet;
import java.io.Serializable;

public class Zaposlenik extends Osoba implements Serializable {
	private String korisnickoIme;
	private String sifraZaposlenika;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Zaposlenik(String korisnickoIme, String ime, String prezime, String sifraZaposlenika) {
		super(ime, prezime);
		this.korisnickoIme = korisnickoIme;
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnièkoIme) {
		this.korisnickoIme = korisnièkoIme;
	}
	public String getSifraZaposlenika() {
		return sifraZaposlenika;
	}
	public void setSifraZaposlenika(String sifraZaposlenika) {
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	

}
