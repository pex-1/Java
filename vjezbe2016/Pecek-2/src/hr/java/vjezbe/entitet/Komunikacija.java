package hr.java.vjezbe.entitet;

import java.time.LocalDate;

public class Komunikacija {
	private Klijent k1;
	private Zaposlenik z1;
	private String type;
	private String content;
	private LocalDate time;
	
	public Komunikacija(Klijent k1, Zaposlenik z1, String type, String content, LocalDate time){
		super();
		this.k1 = k1;
		this.z1 = z1;
		this.type = type;
		this.content = content;
		this.time = time;
	}

	public Klijent getK1() {
		return k1;
	}

	public void setK1(Klijent k1) {
		this.k1 = k1;
	}

	public Zaposlenik getZ1() {
		return z1;
	}

	public void setZ1(Zaposlenik z1) {
		this.z1 = z1;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}
	



}
