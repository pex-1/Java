package hr.java.vjezbe.entitet;

public class Tvrtka {
	private String companyName;
	private String companyOIB;
	private Klijent[] k4;
	private Zaposlenik[] z3;
	private Komunikacija[] k;
	private Usluga[] u;
	private Alarm[] a;
	
	
	public Tvrtka(String companyName, String companyOIB) {
		super();
		this.companyName = companyName;
		this.companyOIB = companyOIB;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyOIB() {
		return companyOIB;
	}
	public void setCompanyOIB(String companyOIB) {
		this.companyOIB = companyOIB;
	}
	public Klijent[] getK4() {
		return k4;
	}
	public void setK4(Klijent[] k4) {
		this.k4 = k4;
	}
	public Zaposlenik[] getZ3() {
		return z3;
	}
	public void setZ3(Zaposlenik[] z3) {
		this.z3 = z3;
	}
	public Komunikacija[] getK() {
		return k;
	}
	public void setK(Komunikacija[] k) {
		this.k = k;
	}
	public Usluga[] getU() {
		return u;
	}
	public void setU(Usluga[] u) {
		this.u = u;
	}
	public Alarm[] getA() {
		return a;
	}
	public void setA(Alarm[] a) {
		this.a = a;
	}
	
	

}
