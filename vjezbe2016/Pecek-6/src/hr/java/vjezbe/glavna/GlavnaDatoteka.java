package hr.java.vjezbe.glavna;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import hr.java.vjezbe.entitet.Artikl;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.Tvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;

public class GlavnaDatoteka {
//	private static Formatter output;

	public static void main(String[] args) {
		List<Klijent> klijenti = new ArrayList<>();
		List<Zaposlenik> zaposlenici = new ArrayList<>();
		List<Artikl> artikli = new ArrayList<>();
		List<Tvrtka> tvrtke = new ArrayList<>();
		
		
		ucitajKlijente(klijenti);
		ucitajZaposlenike(zaposlenici);
		ucitajArtikle(artikli);
		ucitajTvrtke(tvrtke);
//		System.out.println(klijenti.get(0).getBrojTelefona());
		
		
		
		/*
		try{
			output = new Formatter("klijenti.txt");
			int brojevi = 123;
			output.format("Brojevi %d %n", brojevi);
			output.close();
		}
		catch(SecurityException securityException){
			System.err.println("Write permission denied!");
			System.exit(1);			
		}
		catch(FileNotFoundException fileNotFoundException){
			System.err.println("Error opening file");
			System.exit(1);
		}
		*/

	}
	
	public static void ucitajKlijente(List<Klijent> klijenti){
		try(BufferedReader in = new BufferedReader(new FileReader("dat/klijenti.txt"))) {
			String line;
			Klijent k= new Klijent(null, null, null, null, null, null);
			while((line = in.readLine()) != null) {
			k.setOIB(line);
			k.setPrezime(in.readLine());
			k.setIme(in.readLine());
			k.setBrojTelefona(in.readLine());
			k.setEmail(in.readLine());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			k.setDatumRodenja(LocalDate.parse(in.readLine(), formatter));
			
			klijenti.add(k);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
	
	
	public static void ucitajZaposlenike(List<Zaposlenik> zaposlenici){
		try(BufferedReader in = new BufferedReader(new FileReader("dat/zaposlenici.txt"))) {
			String line;
			Zaposlenik z = new Zaposlenik(null, null, null, null);
			while((line = in.readLine()) != null) {
			z.setKorisnickoIme(line);
			z.setIme(in.readLine());
			z.setPrezime(in.readLine());
			z.setSifraZaposlenika(in.readLine());
			zaposlenici.add(z);
			}
		} catch(IOException e) {
			System.out.println(e);
		}	
	}
	
	public static void ucitajArtikle(List<Artikl> artikli){
		try(BufferedReader in = new BufferedReader(new FileReader("dat/artikli.txt"))) {
			String line;
			Artikl a = new Artikl(null, null);
			while((line = in.readLine()) != null) {
			a.setNaziv(line);
			a.setKategorija(in.readLine());
			artikli.add(a);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void ucitajTvrtke(List<Tvrtka> tvrtke){
		try(BufferedReader in = new BufferedReader(new FileReader("dat/tvrtke.txt"))) {
			String line;
			Tvrtka t = new Tvrtka(null, null);
			while((line = in.readLine()) != null) {
			t.setNazivTvrtke(line);
			t.setOIBTvrtke(in.readLine());
			tvrtke.add(t);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
		
	
	
	

}
