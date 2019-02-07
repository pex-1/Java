package hr.java.vjezbe.entitet;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class Tvrtka implements Serializable {
	private String nazivTvrtke;
	private String OIBTvrtke;
	private List<Klijent> klijent = new ArrayList<>();
	private List<Zaposlenik> zaposlenik = new ArrayList<>();
	private List<Komunikacija> komunikacija = new ArrayList<>();
	private List<Usluga> usluga = new ArrayList<>();
	private List<Alarm> alarm = new ArrayList<>();
	
	public Tvrtka(String nazivTvrtke, String oIBTvrtke) {
		super();
		this.nazivTvrtke = nazivTvrtke;
		OIBTvrtke = oIBTvrtke;
	}
	
	public String getNazivTvrtke() {
		return nazivTvrtke;
	}
	public void setNazivTvrtke(String nazivTvrtke) {
		this.nazivTvrtke = nazivTvrtke;
	}
	public String getOIBTvrtke() {
		return OIBTvrtke;
	}
	public void setOIBTvrtke(String oIBTvrtke) {
		OIBTvrtke = oIBTvrtke;
	}
	public List<Klijent> getKlijent() {
		return klijent;
	}
	public void setKlijent(List<Klijent> klijent) {
		this.klijent = klijent;
	}
	public List<Zaposlenik> getZaposlenik() {
		return zaposlenik;
	}
	public void setZaposlenik(List<Zaposlenik> zaposlenik) {
		this.zaposlenik = zaposlenik;
	}
	public List<Komunikacija> getKomunikacija() {
		return komunikacija;
	}
	public void setKomunikacija(List<Komunikacija> komunikacija) {
		this.komunikacija = komunikacija;
	}
	public List<Usluga> getUsluga() {
		return usluga;
	}
	public void setUsluga(List<Usluga> usluga) {
		this.usluga = usluga;
	}
	public List<Alarm> getAlarm() {
		return alarm;
	}
	public void setAlarm(List<Alarm> alarm) {
		this.alarm = alarm;
	}
	

}
