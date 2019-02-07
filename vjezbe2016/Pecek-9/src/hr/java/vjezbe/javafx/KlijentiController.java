package hr.java.vjezbe.javafx;

import javafx.scene.control.TextField;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.auth.callback.Callback;

import hr.java.vjezbe.entitet.Alarm;
import hr.java.vjezbe.entitet.Artikl;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.MaloprodajnaTvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class KlijentiController {
	private List<Klijent> listaKlijenata; 

	
	@FXML
	private TextField klijentiText; 
	@FXML 
	private TableView<Klijent> klijentiTable; 
	@FXML 
	private TableColumn<Klijent, String> OIBColumn; 
	@FXML 
	private TableColumn<Klijent, String> prezimeColumn; 
	@FXML 
	private TableColumn<Klijent, String> imeColumn;
	@FXML 
	private TableColumn<Klijent, String> brTelefonaColumn; 
	@FXML 
	private TableColumn<Klijent, String> emailColumn; 
	@FXML 
	private TableColumn<Klijent, LocalDate> datumColumn;
	
	@FXML 
	public void initialize(){
		OIBColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("OIB")); 
		prezimeColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("prezime"));
		imeColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("ime"));
		brTelefonaColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("brojTelefona"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("email"));
		datumColumn.setCellValueFactory(new PropertyValueFactory<Klijent, LocalDate>("datumRodenja"));
		listaKlijenata = Main.ucitavanjeKlijenata();
	}

	
	public void print(){
		List<Klijent> filter = new ArrayList<Klijent>();
		if (klijentiText.getText().isEmpty() == false) {
			for(int i=0; i<listaKlijenata.size(); i++){
				if(listaKlijenata.get(i).getPrezime().toLowerCase().contains(klijentiText.getText().toLowerCase())) filter.add(listaKlijenata.get(i));
			}
		}
		else{
			filter = listaKlijenata;
		}
		
		ObservableList<Klijent> lista = FXCollections.observableArrayList(filter); 
		klijentiTable.setItems(lista); 
//		System.out.println(listaKlijenata.get(0).getOIB());
		
	}
	
	
	public void prikaziEkranZaNovogKlijenta() {
		try {
		BorderPane noviKlijentPane = FXMLLoader.load(Main.class.getResource("NoviKlijent.fxml"));
		Scene scene = new Scene(noviKlijentPane,600,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	public void prikaziEkranZaNovogZaposlenika() {
		try {
		BorderPane noviKlijentPane = FXMLLoader.load(Main.class.getResource("NoviZaposlenik.fxml"));
		Scene scene = new Scene(noviKlijentPane,600,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	public void prikaziEkranZaNoviArtikl() {
		try {
		BorderPane noviKlijentPane = FXMLLoader.load(Main.class.getResource("NoviArtikl.fxml"));
		Scene scene = new Scene(noviKlijentPane,600,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	
	public void prikaziKlijenate() {
		try{
		BorderPane klijentiPane= FXMLLoader.load(Main.class.getResource("Klijenti.fxml"));
		Main.setCenterPane(klijentiPane);
		} catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	public void prikaziZaposlenike() {
		try{
		BorderPane zaposleniciPane= FXMLLoader.load(Main.class.getResource("Zaposlenici.fxml"));
		Main.setCenterPane(zaposleniciPane);
		} catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	public void prikaziArtikle() {
		try{
		BorderPane artikliPane= FXMLLoader.load(Main.class.getResource("Artikli.fxml"));
		Main.setCenterPane(artikliPane);
		} catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	public void prikaziAlarme() {
		try{
		BorderPane alarmiPane= FXMLLoader.load(Main.class.getResource("Alarmi.fxml"));
		Main.setCenterPane(alarmiPane);
		} catch(IOException e) {
		e.printStackTrace();
		}
	}
	
	}

