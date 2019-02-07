package hr.java.vjezbe.entitet;

public class Zaposlenik extends Osoba {
	private String korisnickoIme;
	private String sifraZaposlenika;
	
	public Zaposlenik(String korisnièkoIme, String ime, String prezime, String sifraZaposlenika) {
		super(ime, prezime);
		this.korisnickoIme = korisnièkoIme;
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
