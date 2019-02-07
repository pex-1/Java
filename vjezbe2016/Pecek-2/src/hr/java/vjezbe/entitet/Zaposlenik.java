package hr.java.vjezbe.entitet;

public class Zaposlenik extends Osoba {
	private String userName, code;
	
	public Zaposlenik(String ime, String prezime, String surname, String code){
		super(ime, prezime);
		this.userName = userName;
		this.code = code;
	}
	
	//get metode
	public String getUserName(){
		return userName;
	}

	public String getCode(){
		return code;
	}
	
	//get metode
		public void setUserName(String userName){
			this.userName = userName;
		}

		public void setCode(String code){
			this.code = code;
		}


}
