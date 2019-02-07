package hr.java.vjezbe.entitet;

public class Zaposlenik {
	private String userName, name, surname, code;
	
	public Zaposlenik(String userName, String name, String surname, String code){
		super();
		this.userName = userName;
		this.name = name;
		this.surname = surname;
		this.code = code;
	}
	
	//get metode
	public String getUserName(){
		return userName;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getCode(){
		return code;
	}
	
	//get metode
		public void setUserName(String userName){
			this.userName = userName;
		}
		public void setName(String name){
			this.name = name;
		}
		public void setSurname(String surname){
			this.surname = surname;
		}
		public void setCode(String code){
			this.code = code;
		}


}
