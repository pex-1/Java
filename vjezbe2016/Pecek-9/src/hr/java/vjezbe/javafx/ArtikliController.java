package hr.java.vjezbe.javafx;

import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

public class ArtikliController {
	private static List<Artikl> listaArtikala;
	
	@FXML
	private TextField artikliText; 
	@FXML 
	private TableView<Artikl> artikliTable; 
	@FXML 
	private TableColumn<Artikl, String> nazivColumn; 
	@FXML 
	private TableColumn<Artikl, String> kategorijaColumn; 
	@FXML 
	private TableColumn<Artikl, String> opisColumn; 
	
	@FXML 
	public void initialize(){
		nazivColumn.setCellValueFactory(new PropertyValueFactory<Artikl, String>("naziv")); 
		kategorijaColumn.setCellValueFactory(new PropertyValueFactory<Artikl, String>("kategorija")); 
		opisColumn.setCellValueFactory(new PropertyValueFactory<Artikl, String>("opis")); 
		listaArtikala = Main.ucitajArtikle();
		
	}
	
	public void print() { 
		List<Artikl> filter = new ArrayList<Artikl>();
		if (artikliText.getText().isEmpty() == false) {
			for(int i=0; i<listaArtikala.size(); i++){
				if(listaArtikala.get(i).getNaziv().contains(artikliText.getText())) filter.add(listaArtikala.get(i));
			}
		}
		else{
			filter = listaArtikala;
		}
		ObservableList<Artikl> lista = FXCollections.observableArrayList(filter); 
		artikliTable.setItems(lista); 
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

	public static void dodajNoviArtikl(Artikl artikl) {
		listaArtikala.add(artikl);
		
	}
	
	
	
}

