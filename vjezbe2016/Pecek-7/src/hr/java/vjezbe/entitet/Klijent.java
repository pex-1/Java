package hr.java.vjezbe.entitet;
import java.io.Serializable;

import java.time.LocalDate;

public class Klijent extends Osoba implements Serializable {
	private String OIB;
	private String brojTelefona;
	private String email;
	private LocalDate datumRodenja;
	
	public Klijent(String oIB, String ime, String prezime, String brojTelefona, String email, LocalDate datumRođenja) {
		super(ime, prezime);
		OIB = oIB;
		this.brojTelefona = brojTelefona;
		this.email = email;
		this.datumRodenja = datumRođenja;
	}
	
	public String getOIB() {
		return OIB;
	}
	public void setOIB(String oIB) {
		OIB = oIB;
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
	public void setDatumRodenja(LocalDate datumRođenja) {
		this.datumRodenja = datumRođenja;
	}
	
	

}
