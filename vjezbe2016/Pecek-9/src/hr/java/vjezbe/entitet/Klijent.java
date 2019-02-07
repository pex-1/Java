package hr.java.vjezbe.entitet;
import java.io.Serializable;

import java.time.LocalDate;

public class Klijent extends Osoba implements Serializable {
	private String oib;
	private String brojTelefona;
	private String email;
	private LocalDate datumRodenja;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Klijent(String oib, String ime, String prezime, String brojTelefona, String email, LocalDate datumRodenja) {
		super(ime, prezime);
		oib = oib;
		this.brojTelefona = brojTelefona;
		this.email = email;
		this.datumRodenja = datumRodenja;
	}
	
	public String getOIB() {
		return oib;
	}
	public void setOIB(String oIB) {
		oib = oIB;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDatumRodenja() {
		return datumRodenja;
	}
	public void setDatumRodenja(LocalDate datumRoðenja) {
		this.datumRodenja = datumRoðenja;
	}
	
	

}
