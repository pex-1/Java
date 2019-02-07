package hr.java.vjezbe.entitet;

import java.time.LocalDateTime;

public class Alarm {
	private Klijent k3;
	private String description;
	private LocalDateTime alarmTime;
	private boolean status;
	public Alarm(Klijent k3, String description, LocalDateTime alarmTime, boolean status) {
		super();
		this.k3 = k3;
		this.description = description;
		this.alarmTime = alarmTime;
		this.status = status;
	}
	public Klijent getK3() {
		return k3;
	}
	public void setK3(Klijent k3) {
		this.k3 = k3;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getAlarmTime() {
		return alarmTime;
	}
	public void setAlarmTime(LocalDateTime alarmTime) {
		this.alarmTime = alarmTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
