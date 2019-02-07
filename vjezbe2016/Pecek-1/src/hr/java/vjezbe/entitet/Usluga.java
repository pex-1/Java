package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Usluga {
	private Klijent k2;
	private String serviceType;
	private String service;
	private LocalDate date;
	private BigDecimal price;
	private boolean paid = false;
	private boolean done = false;
	
	public Usluga(Klijent k2, String serviceType, String service, LocalDate date, BigDecimal price, boolean paid, boolean done){
		super();
		this.k2 = k2;
		this.serviceType = serviceType;
		this.service = service;
		this.date = date;
		this.price = price;
		this.paid = paid;
		this.done = done;
	}

	public Klijent getK2() {
		return k2;
	}

	public void setK2(Klijent k2) {
		this.k2 = k2;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	


}
