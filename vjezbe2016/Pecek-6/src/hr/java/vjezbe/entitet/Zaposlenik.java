package hr.java.vjezbe.entitet;

public class Zaposlenik extends Osoba {
	private String korisnickoIme;
	private String sifraZaposlenika;
	
	public Zaposlenik(String korisni�koIme, String ime, String prezime, String sifraZaposlenika) {
		super(ime, prezime);
		this.korisnickoIme = korisni�koIme;
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisni�koIme) {
		this.korisnickoIme = korisni�koIme;
	}
	public String getSifraZaposlenika() {
		return sifraZaposlenika;
	}
	public void setSifraZaposlenika(String sifraZaposlenika) {
		this.sifraZaposlenika = sifraZaposlenika;
	}
	
	

}
