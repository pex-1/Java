package hr.java.vjezbe.entitet;


public class Klijent extends Osoba {

	private String OIB, brojTelefona, email, datum;

	
	public Klijent(String OIB, String prezime, String ime, String broj_telefona, String email, String datum){
		super(ime,prezime);
		this.OIB = OIB;
		this.brojTelefona = broj_telefona;
		this.email = email;
		this.datum = datum;
	}
	//get metode
	public String getOIB(){
		return OIB;
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
