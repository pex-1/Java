package hr.java.vjezbe.javafx;
	
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import hr.java.vjezbe.entitet.Alarm;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.MaloprodajnaTvrtka;
import hr.java.vjezbe.entitet.Tvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("PocetniEkran.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	private static BorderPane root; 
	private Stage primaryStage; 
//	@Override 
//	public void start(Stage stage) { 
//		primaryStage = stage; 
//		try { 
//			root = (BorderPane)FXMLLoader.load(getClass().getResource( "PocetniEkran.fxml")); 
//			Scene scene = new Scene(root,600,400); 
//			scene.getStylesheets().add(getClass().getResource( "application.css").toExternalForm()); 
//			primaryStage.setScene(scene); 
//			primaryStage.show(); 
//			} 
//		catch(Exception e) { 
//			e.printStackTrace(); 
//			} 
//		} 
	
	public static void setCenterPane(BorderPane centerPane) { 
		root.setCenter(centerPane); 
		}

	public static List<Klijent> ucitavanjeKlijenata() {
		List<Klijent> klijenti = new ArrayList<>();
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
		return klijenti;
	}

	public static List<Zaposlenik> ucitavanjeZaposlenika() {
		List<Zaposlenik> zaposlenici = new ArrayList<>();
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
		return zaposlenici;
	}

	public static List<Alarm> ucitavanjeAlarma() {
		List<Alarm> alarmi = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/alarmi.txt"))) {
			String line;
			Alarm a = new Alarm(null, null, null, false);
			Klijent k= new Klijent(null, null, null, null, null, null);
			while((line = in.readLine()) != null) {
				k.setOIB(line);
				k.setPrezime(in.readLine());
				k.setIme(in.readLine());
				k.setBrojTelefona(in.readLine());
				k.setEmail(in.readLine());
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
				k.setDatumRodenja(LocalDate.parse(in.readLine(), formatter));
				
				a.setKlijent(k);
				a.setOpisAlarma(in.readLine());
				a.setAktivan(true);
				a.setStatusAlarma(LocalDateTime.now());
				alarmi.add(a);
				
			}
		} catch(IOException e) {
			System.out.println(e);
		}	
		return alarmi;
	}

	public static MaloprodajnaTvrtka ucitavanjeTvrtke() {
		List<MaloprodajnaTvrtka> tvrtke = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/tvrtke.txt"))) {
			String line;
			MaloprodajnaTvrtka t = new MaloprodajnaTvrtka(null, null, null);
			while((line = in.readLine()) != null) {
			t.setNazivTvrtke(line);
			t.setOIBTvrtke(in.readLine());
			tvrtke.add(t);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		return (MaloprodajnaTvrtka) tvrtke;
	}
}
