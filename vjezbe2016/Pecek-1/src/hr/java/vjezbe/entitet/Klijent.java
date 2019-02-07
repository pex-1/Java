package hr.java.vjezbe.entitet;


public class Klijent {

	private String OIB, prezime, ime, brojTelefona, email, datum;

	
	public Klijent(String OIB, String prezime, String ime, String broj_telefona, String email, String datum){
		super();
		this.OIB = OIB;
		this.prezime = prezime;
		this.ime = ime;
		this.brojTelefona = broj_telefona;
		this.email = email;
		this.datum = datum;
	}
	//get metode
	public String getOIB(){
		return OIB;
	}
	public String getPrezime(){
		return prezime;
	}
	public String getIme(){
		return ime;
	}
	public String getBroj(){
		return brojTelefona;
	}
	public String getEmail(){
		return email;
	}
	public String getDate(){
		return datum;
	}
	
	//set metode
	public void setOIB(String OIB){
		this.OIB = OIB;
	}
	public void setPrezime(String prezime){
		this.prezime = prezime;
	}
	public void setIme(String ime){
		this.ime = ime;
	}
	public void setBroj(String broj){
		this.brojTelefona = broj;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setDate(String datum){
		this.datum = datum;
	}
	
	
	
}
