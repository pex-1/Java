package hr.java.vjezbe.glavna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import hr.java.vjezbe.entitet.Artikl;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.MaloprodajnaTvrtka;
import hr.java.vjezbe.entitet.Tvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;
import hr.java.vjezbe.entitet.Osoba;

public class Glavna {

	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Osoba> osobe = new ArrayList<Osoba>();
		
		Artikl[] a = new Artikl[3];
		Klijent[] k = new Klijent[2];
		k[0] = new Klijent(null, null, null, null, null, null);
		k[1] = new Klijent(null, null, null, null, null, null);
		//Klijent kl2 = new Klijent(null, null, null, null, null, null);
		Zaposlenik[] z = new Zaposlenik[2];
		z[0] = new Zaposlenik(null, null, null, null);
		z[1] = new Zaposlenik(null, null, null, null);
//		MaloprodajnaTvrtka tvrtka = new MaloprodajnaTvrtka(null, null, null);
		System.out.println("UNOS PODATAKA:");

		
		k[0] = setClient(1, k[0], sc);
		k[1] = setClient(2, k[1], sc);
		//System.out.println(kl1.getEmail());
		
		z[0] = setEmployee(1, z[0], sc);
		z[1] = setEmployee(2, z[1], sc);
		
			
		
		osobe.add(k[0]);
		osobe.add(z[0]);
		// Sorting
		Collections.sort(osobe, new Comparator<Osoba>() {
	        @Override
	        public int compare(Osoba fruit2, Osoba fruit1)
	        {

	            return  fruit1.getPrezime().compareTo(fruit2.getPrezime());
	        }
	    });
		
		a[0] = setArtikl(a[0], 1, sc);
		a[1] = setArtikl(a[1], 2, sc);
		a[2] = setArtikl(a[2], 3, sc);
		
		
		String ime = "whatever";
		MaloprodajnaTvrtka tvrtka = new MaloprodajnaTvrtka(ime, ime, a);
		//tvrtka = (MaloprodajnaTvrtka) setCompany(tvrtka, sc, a[0]);
		
		
		tvrtka.setK4(k);
		tvrtka.setZ3(z);
		
		System.out.println("Unesite broj usluga: ");
		String temp = sc.nextLine();
		int odabir = Integer.parseInt(temp);
		System.out.println("Unesite redni broj klijenta");
		temp = sc.nextLine();
		int klijent_br = Integer.parseInt(temp);
		for(int i=0; i<2; i++){
			System.out.println(i+". KLIJENT:");
			System.out.println("OIB klijenta:\n"+tvrtka.getK4()[i].getOIB());
			System.out.println("Prezime klijenta:\n"+tvrtka.getK4()[i].getPrezime());
			System.out.println("Ime klijenta:\n"+tvrtka.getK4()[i].getIme());
			System.out.println("Broj telefona klijenta:\n"+tvrtka.getK4()[i].getBroj());
			System.out.println("E-mail adresa klijenta:\n"+tvrtka.getK4()[i].getEmail());
			System.out.println("Datum ro�enja klijenta:\n"+tvrtka.getK4()[i].getDate());
		}
		
		System.out.println("Odabir: "+klijent_br);
		
		
		
		
		System.out.println();
		System.out.println("ISPIS PODATAKA:");
		/***********************ispis***********************/
		System.out.println("Naziv tvrtke:\n"+tvrtka.getCompanyName());
		System.out.println("OIB tvrtke:\n"+tvrtka.getCompanyOIB());
		System.out.println();
		//System.out.println(tvrtka.getK4()[0].getBroj());
		
		/*
		for(int i=0; i<2; i++){
			System.out.println("OIB klijenta:\n"+tvrtka.getK4()[i].getOIB());
			System.out.println("Prezime klijenta:\n"+tvrtka.getK4()[i].getPrezime());
			System.out.println("Ime klijenta:\n"+tvrtka.getK4()[i].getIme());
			System.out.println("Broj telefona klijenta:\n"+tvrtka.getK4()[i].getBroj());
			System.out.println("E-mail adresa klijenta:\n"+tvrtka.getK4()[i].getEmail());
			System.out.println("Datum ro�enja klijenta:\n"+tvrtka.getK4()[i].getDate());
		}
		System.out.println();
		for(int i=0; i<2; i++){
			System.out.println("Korisni�ko ime zaposlenika:\n"+tvrtka.getZ3()[i].getUserName());
			System.out.println("Ime zaposlenika:\n"+tvrtka.getZ3()[i].getIme());
			System.out.println("Prezime zaposlenika:\n"+tvrtka.getZ3()[i].getPrezime());
			System.out.println("�ifra zaposlenika:\n"+tvrtka.getZ3()[i].getCode());

		}
		*/
		
	}
	
	public static Artikl setArtikl(Artikl a, int num, Scanner sc){
		String s;
		System.out.println("UNESITE "+num+". ARTIKL:");
		System.out.println("Naziv artikla:");
		s = sc.nextLine();
		a.setNaziv(s);
		System.out.println("Kategorija artikla:");
		s = sc.nextLine();
		a.setKategorija(s);
		return a;
	}
	
	public static Klijent setClient(int num, Klijent k, Scanner sc){
		String s;
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
		k.setBroj(s);
		System.out.println("Unesite e-mail adresu klijenta:");
		s = sc.nextLine();
		k.setEmail(s);
		System.out.println("Datum ro�enja klijenta (dd.MM.yyyy.):");
		s = sc.nextLine();
		k.setDate(s);
		return k;
	}
	
	
	
	public static Zaposlenik setEmployee(int num, Zaposlenik z, Scanner sc){
		String s;
		
		System.out.println("UNESITE "+num+". ZAPOSLENIKA:");
		s = sc.nextLine();

		System.out.println("Unesite korisni�ko ime zaposlenika:");
		s = sc.nextLine();
		z.setUserName(s);
		System.out.println("Unesite ime zaposlenika:");
		s = sc.nextLine();
		z.setIme(s);
		System.out.println("Unesite prezime zaposlenika:");
		s = sc.nextLine();
		z.setPrezime(s);
		System.out.println("Unesite �ifru zaposlenika:");
		s = sc.nextLine();
		z.setCode(s);
		return z;
	}
	
	
	
	public static Tvrtka setCompany(MaloprodajnaTvrtka t, Scanner sc, Artikl a){
		String s;
		System.out.println("Unesite naziv tvrtke:");
		s = sc.nextLine();
		t.setCompanyName(s);
		System.out.println("Unesite OIB tvrtke:");
		s = sc.nextLine();
		t.setCompanyOIB(s);
		return t;
	}
	
	

}
