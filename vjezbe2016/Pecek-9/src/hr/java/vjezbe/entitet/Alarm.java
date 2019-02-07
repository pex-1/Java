package hr.java.vjezbe.entitet;
import java.io.Serializable;

import java.time.LocalDateTime;

public class Alarm implements Serializable{
	private Klijent klijent;
	private String opisAlarma;
	private LocalDateTime statusAlarma;
	private boolean aktivan;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alarm(Klijent klijent, String opisAlarma, LocalDateTime statusAlarma, boolean aktivan) {
		super();
		this.klijent = klijent;
		this.opisAlarma = opisAlarma;
		this.statusAlarma = statusAlarma;
		this.aktivan = aktivan;
	}
	
	public Klijent getKlijent() {
		return klijent;
	}
	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}
	public String getOpisAlarma() {
		return opisAlarma;
	}
	public void setOpisAlarma(String opisAlarma) {
		this.opisAlarma = opisAlarma;
	}
	public LocalDateTime getStatusAlarma() {
		return statusAlarma;
	}
	public void setStatusAlarma(LocalDateTime statusAlarma) {
		this.statusAlarma = statusAlarma;
	}
	public boolean isAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	

}
