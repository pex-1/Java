package hr.java.vjezbe.entitet;

public class Artikl {
	private String naziv;
	private String kategorija;
	//getteri i setteri
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	//konstruktor
	public Artikl(String naziv, String kategorija) {
		super();
		this.naziv = naziv;
		this.kategorija = kategorija;
	}
	

}
