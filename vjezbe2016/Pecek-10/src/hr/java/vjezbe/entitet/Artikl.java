package hr.java.vjezbe.entitet;
import java.io.Serializable;

public class Artikl implements Serializable{
	private String naziv;
	private String kategorija;
	private String opis;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Artikl(String naziv, String kategorija, String opis) {
		super();
		this.naziv = naziv;
		this.kategorija = kategorija;
		this.opis = opis;
	}
	
	public String getOpis(){
		return opis;
	}
	public void setOpis(String opis){
		this.opis = opis;
	}
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
	

}
