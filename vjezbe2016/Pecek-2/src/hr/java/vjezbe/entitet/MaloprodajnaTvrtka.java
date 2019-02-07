package hr.java.vjezbe.entitet;

public class MaloprodajnaTvrtka extends Tvrtka {
	private Artikl[] artikl;
	
	public MaloprodajnaTvrtka(String companyName, String companyOIB, Artikl[] artikl) {
		super(companyName, companyOIB);
		this.artikl = artikl;
		
	}

}
