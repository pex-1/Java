package hr.java.vjezbe.glavna;

import java.util.Scanner;

import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.Tvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;

public class Glavna {

	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Klijent[] k = new Klijent[2];
		k[0] = new Klijent(null, null, null, null, null, null);
		k[1] = new Klijent(null, null, null, null, null, null);
		//Klijent kl2 = new Klijent(null, null, null, null, null, null);
		Zaposlenik[] z = new Zaposlenik[2];
		z[0] = new Zaposlenik(null, null, null, null);
		z[1] = new Zaposlenik(null, null, null, null);
		Tvrtka tvrtka = new Tvrtka(null, null);
		System.out.println("UNOS PODATAKA:");

		
		k[0] = setClient(1, k[0], sc);
		k[1] = setClient(2, k[1], sc);
		//System.out.println(kl1.getEmail());
		
		z[0] = setEmployee(1, z[0], sc);
		z[1] = setEmployee(2, z[1], sc);
		
		tvrtka = setCompany(tvrtka, sc);
		
		tvrtka.setK4(k);
		tvrtka.setZ3(z);
		
		System.out.println();
		System.out.println("ISPIS PODATAKA:");
		/***********************ispis***********************/
		System.out.println("Naziv tvrtke:\n"+tvrtka.getCompanyName());
		System.out.println("OIB tvrtke:\n"+tvrtka.getCompanyOIB());
		System.out.println();
		//System.out.println(tvrtka.getK4()[0].getBroj());
		for(int i=0; i<2; i++){
			System.out.println("OIB klijenta:\n"+tvrtka.getK4()[i].getOIB());
			System.out.println("Prezime klijenta:\n"+tvrtka.getK4()[i].getPrezime());
			System.out.println("Ime klijenta:\n"+tvrtka.getK4()[i].getIme());
			System.out.println("Broj telefona klijenta:\n"+tvrtka.getK4()[i].getBroj());
			System.out.println("E-mail adresa klijenta:\n"+tvrtka.getK4()[i].getEmail());
			System.out.println("Datum roðenja klijenta:\n"+tvrtka.getK4()[i].getDate());
		}
		System.out.println();
		for(int i=0; i<2; i++){
			System.out.println("Korisnièko ime zaposlenika:\n"+tvrtka.getZ3()[i].getUserName());
			System.out.println("Ime zaposlenika:\n"+tvrtka.getZ3()[i].getName());
			System.out.println("Prezime zaposlenika:\n"+tvrtka.getZ3()[i].getSurname());
			System.out.println("Šifra zaposlenika:\n"+tvrtka.getZ3()[i].getCode());

		}
		

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
		System.out.println("Datum roðenja klijenta (dd.MM.yyyy.):");
		s = sc.nextLine();
		k.setDate(s);
		return k;
	}
	
	
	
	public static Zaposlenik setEmployee(int num, Zaposlenik z, Scanner sc){
		String s;
		
		System.out.println("UNESITE "+num+". ZAPOSLENIKA:");
		s = sc.nextLine();

		System.out.println("Unesite korisnièko ime zaposlenika:");
		s = sc.nextLine();
		z.setUserName(s);
		System.out.println("Unesite ime zaposlenika:");
		s = sc.nextLine();
		z.setName(s);
		System.out.println("Unesite prezime zaposlenika:");
		s = sc.nextLine();
		z.setSurname(s);
		System.out.println("Unesite šifru zaposlenika:");
		s = sc.nextLine();
		z.setCode(s);
		return z;
	}
	
	
	
	public static Tvrtka setCompany(Tvrtka t, Scanner sc){
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
