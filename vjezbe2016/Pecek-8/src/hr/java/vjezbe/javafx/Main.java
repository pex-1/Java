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
import hr.java.vjezbe.entitet.Artikl;
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
	private static BorderPane root;
	private static Stage primaryStage;
	@Override
	public void start(Stage stage) {
		primaryStage = stage;
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource("Klijenti.fxml"));
			Scene scene = new Scene(root,600,600);
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
	
	
	public static void setCenterPane(BorderPane centerPane) { 
		root.setCenter(centerPane); 
		}

	
	//uèitavanje podataka
	public static List<Klijent> ucitavanjeKlijenata() {
		List<Klijent> klijenti = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/klijenti.txt"))) {
			String line;
			while((line = in.readLine()) != null) {
				Klijent k= new Klijent(null, null, null, null, null, null);
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

	public static List<Zaposlenik> ucitajZaposlenike() {
		List<Zaposlenik> zaposlenici = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/zaposlenici.txt"))) {
			String line;
			while((line = in.readLine()) != null) {
				Zaposlenik z = new Zaposlenik(null, null, null, null);
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
	
	public static List<Artikl> ucitajArtikle(){
		List<Artikl> artikli = new ArrayList<Artikl>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/artikli.txt"))) {
			String line;
			
			while((line = in.readLine()) != null) {
				Artikl a = new Artikl(null, null);
				a.setNaziv(line);
				a.setKategorija(in.readLine());
				artikli.add(a);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		return artikli;
	}

	public static List<Alarm> ucitavanjeAlarma() {
		List<Alarm> alarmi = new ArrayList<>();
		try(BufferedReader in = new BufferedReader(new FileReader("dat/alarmi.txt"))) {
			String line;
			while((line = in.readLine()) != null) {
				Alarm a = new Alarm(null, null, null, false);
				Klijent k= new Klijent(null, null, null, null, null, null);
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

}
