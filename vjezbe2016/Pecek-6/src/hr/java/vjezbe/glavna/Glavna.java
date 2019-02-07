package hr.java.vjezbe.glavna;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import hr.java.vjezbe.entitet.Artikl;
import hr.java.vjezbe.entitet.KategorijaArtikla;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.Komunikacija;
import hr.java.vjezbe.entitet.MaloprodajnaTvrtka;
import hr.java.vjezbe.entitet.Osoba;
import hr.java.vjezbe.entitet.Tvrtka;
import hr.java.vjezbe.entitet.VrstaUsluge;
import hr.java.vjezbe.entitet.Zaposlenik;
import hr.java.vjezbe.sortiranje.KomunikacijaSorter;

public class Glavna {

	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<Komunikacija> komunikacija = new ArrayList<>();
		List<Klijent> klijent = new ArrayList<>();
		List<Zaposlenik> zaposlenik = new ArrayList<>();
		List<Artikl> artikl = new ArrayList<>();

//		Tvrtka tvrtka = new Tvrtka(null, null);
		System.out.println("UNOS PODATAKA:");
/*
		artikl.add(setArtikl(1, sc));
		artikl.add(setArtikl(2, sc));
		artikl.add(setArtikl(3, sc));
*/
		String ime = "ime tvrtke";
		MaloprodajnaTvrtka maloprodajnaTvrtka = new MaloprodajnaTvrtka(ime, ime, artikl);
		
		klijent.add(setClient(1, sc));
		klijent.add(setClient(2, sc));
		
		zaposlenik.add(setZaposlenik(1, sc));
		zaposlenik.add(setZaposlenik(2, sc));
		
		//System.out.println(kl1.getEmail());
		
//		tvrtka = setTvrtka(tvrtka, sc, klijent, zaposlenik);
		
		ArrayList<Osoba> osobe = new ArrayList<Osoba>();
		osobe.add(klijent.get(0));
		osobe.add(klijent.get(1));
		osobe.add(zaposlenik.get(0));
		osobe.add(zaposlenik.get(1));
		
		Collections.sort(osobe, (p1, p2) -> p1.getPrezime().compareTo(p2.getPrezime()));
		
/*
		if(osobe.get(0) instanceof Zaposlenik){
			System.out.println("Zaposlenik");
		}
		else{
			System.out.println("Klijent");
		}
*/
		
		
		long pocetakSortiranja = System.currentTimeMillis();
		Collections.sort(komunikacija, new KomunikacijaSorter());
		long krajSortiranja = System.currentTimeMillis();
		System.out.println("Vrijeme sortiranja Comparator: "+ (krajSortiranja - pocetakSortiranja));
		komunikacija.stream().forEach(System.out::println);
		
		
		
		pocetakSortiranja = System.currentTimeMillis();
		Collections.sort(komunikacija, (Komunikacija p1, Komunikacija p2) -> 
			p1.getVrijemeKomunikacije().equals(p2.getVrijemeKomunikacije())?
					p1.getKlijent().getPrezime().compareTo(p2.getKlijent().getPrezime()):
					p1.getVrijemeKomunikacije().compareTo(p2.getVrijemeKomunikacije()));
		krajSortiranja = System.currentTimeMillis();
		System.out.println("Vrijeme sortiranja lambda: "+ (krajSortiranja - pocetakSortiranja));
		
		
		
		pocetakSortiranja = System.currentTimeMillis();
		Function<Komunikacija, LocalDateTime> poVremenu = Komunikacija::getVrijemeKomunikacije;
//		Function<Komunikacija, String> poPrezimenu = Komunikacija::(getKlijent.getPrezime);
//		Comparator<Komunikacija> vrijemePrezime = Comparator.comparing(poVremenu).thenComparing(poPrezimenu);
		komunikacija.stream().sorted();
		krajSortiranja = System.currentTimeMillis();
		System.out.println("Vrijeme sortiranja stream: "+ (krajSortiranja - pocetakSortiranja));
		
		
		
		System.out.println();
		System.out.println("ISPIS PODATAKA:");
		/***********************ispis***********************/
		/*
		System.out.println("Naziv tvrtke:\n"+tvrtka.getNazivTvrtke());
		System.out.println("OIB tvrtke:\n"+tvrtka.getOIBTvrtke());
		System.out.println();
		//System.out.println(tvrtka.getK4()[0].getBroj());
		for(int i=0; i<2; i++){
			System.out.println((i+1)+". KLIJENT:");
			System.out.println("OIB klijenta:\n"+tvrtka.getKlijent().get(i).getOIB());
			System.out.println("Prezime klijenta:\n"+tvrtka.getKlijent().get(i).getPrezime());
			System.out.println("Ime klijenta:\n"+tvrtka.getKlijent().get(i).getIme());
			System.out.println("Broj telefona klijenta:\n"+tvrtka.getKlijent().get(i).getBrojTelefona());
			System.out.println("E-mail adresa klijenta:\n"+tvrtka.getKlijent().get(i).getEmail());
			System.out.println("Datum roðenja klijenta:\n"+tvrtka.getKlijent().get(i).getDatumRodenja());
		}
		System.out.println();
		for(int i=0; i<2; i++){
			System.out.println("Korisnièko ime zaposlenika:\n"+tvrtka.getZaposlenik().get(i).getKorisnickoIme());
			System.out.println("Ime zaposlenika:\n"+tvrtka.getZaposlenik().get(i).getIme());
			System.out.println("Prezime zaposlenika:\n"+tvrtka.getZaposlenik().get(i).getPrezime());
			System.out.println("Šifra zaposlenika:\n"+tvrtka.getZaposlenik().get(i).getSifraZaposlenika());

		}
		*/

	}
	
	
	
	public static Klijent setClient(int num, Scanner sc){
		String s;
		Klijent k = new Klijent(null, null, null, null, null, null);
		System.out.println("UNESITE "+num+". KLIJENTA:");
		
		System.out.println("Unesite OIB klijenta:");
		s = sc.nextLine();
		k.setOIB(s);
		System.out.println("Unesite prezime klijenta:");
		s = sc.nextLine();
		k.setPrezime(s);
		System.out.println("Unesite ime klijenta:");
		s = sc.nextLine();
		k.setIme(s);
		System.out.println("Unesite broj telefona klijenta:");
		s = sc.nextLine();
		k.setBrojTelefona(s);
		System.out.println("Unesite e-mail adresu klijenta:");
		s = sc.nextLine();
		k.setEmail(s);
		System.out.println("Datum roðenja klijenta (dd.MM.yyyy.):");
		s = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		k.setDatumRodenja(LocalDate.parse(s, formatter));
		return k;
	}
	
	
	
	public static Zaposlenik setZaposlenik(int num, Scanner sc){
		String s;
		Zaposlenik z = new Zaposlenik(null, null, null, null);
		
		System.out.println("UNESITE "+num+". ZAPOSLENIKA:");

		System.out.println("Unesite korisnièko ime zaposlenika:");
		s = sc.nextLine();
		z.setKorisnickoIme(s);
		System.out.println("Unesite ime zaposlenika:");
		s = sc.nextLine();
		z.setIme(s);
		System.out.println("Unesite prezime zaposlenika:");
		s = sc.nextLine();
		z.setPrezime(s);
		System.out.println("Unesite šifru zaposlenika:");
		s = sc.nextLine();
		z.setSifraZaposlenika(s);
		return z;
	}
	
	
	
	public static Tvrtka setTvrtka(Tvrtka t, Scanner sc, List<Klijent> klijent, List<Zaposlenik> zaposlenik){
		String s;
		System.out.println("Unesite naziv tvrtke:");
		s = sc.nextLine();
		t.setNazivTvrtke(s);
		System.out.println("Unesite OIB tvrtke:");
		s = sc.nextLine();
		t.setOIBTvrtke(s);
		t.setKlijent(klijent);
		t.setZaposlenik(zaposlenik);
		return t;
	}
	
	public static Artikl setArtikl(int num, Scanner sc){
		String s;
		Artikl a = new Artikl(null, null);
		System.out.println("UNESITE "+num+". ARTIKL:");
		System.out.println("Naziv artikla:");
		s = sc.nextLine();
		a.setNaziv(s);
		KategorijaArtikla kategorija = null;
		for(int i = 0; i < KategorijaArtikla.values().length - 1; i++) { 
				System.out.println((i + 1) + ". " + KategorijaArtikla.values()[i]); 
				} 
		Integer brojUsluge = null; 
		
		while(true) { 
			System.out.print("Odabir >> "); 
		try { 
			brojUsluge = sc.nextInt(); 
			break; 
			}
		
		catch(InputMismatchException ex) { 
			System.out.println("Neispravan unos!");  
			} 
		}
		if(brojUsluge >= 1 && brojUsluge < VrstaUsluge.values().length) { 
			kategorija = KategorijaArtikla.values()[brojUsluge - 1]; 
		} else { 
			kategorija = KategorijaArtikla.OSTALO; 
		}
		a.setKategorija(kategorija.toString());
		return a;
	}
	
	

}
