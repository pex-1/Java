package hr.java.vjezbe.javafx;

import javafx.scene.control.TextField;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.auth.callback.Callback;

import hr.java.vjezbe.entitet.Alarm;
import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.MaloprodajnaTvrtka;
import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class PocetniEkranController {
	private List<Klijent> listaKlijenata; 
	private List<Zaposlenik> listaZaposlenika; 
	private List<Alarm> listaAlarma; 
//	private MaloprodajnaTvrtka tvrtka; 
	
	@FXML
	private TextField alarmiFilterTextField; 
	@FXML 
	private TableView<Alarm> alarmiTableView; 
	@FXML 
	private TableColumn<Klijent, String> klijentColumn; 
	@FXML 
	private TableColumn<Alarm, String> opisColumn; 
	@FXML 
	private TableColumn<Alarm, LocalDateTime> vrijemeColumn; 
	@FXML 
	public void initialize() { 
		klijentColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("prezime")); 
		opisColumn.setCellValueFactory(new PropertyValueFactory<Alarm, String>("opisAlarma")); 
		vrijemeColumn.setCellValueFactory(new PropertyValueFactory<Alarm, LocalDateTime>("statusAlarma")); 

//		listaKlijenata = Main.ucitavanjeKlijenata(); 
//		listaZaposlenika = Main.ucitajZaposlenike(); 
		listaAlarma = Main.ucitavanjeAlarma(); 
//		tvrtka = Main.ucitavanjeTvrtke(); 
//		tvrtka.setKlijent(listaKlijenata); 
//		tvrtka.setZaposlenik(listaZaposlenika); 
		} 
//	
	public void prikaziAlarme() { 

		List<Alarm> filtriraniAlarmi = new ArrayList<Alarm>();
		if (alarmiFilterTextField.getText().isEmpty() == false) { 
			 
			} 
		else { 
			filtriraniAlarmi = listaAlarma; 
			} 
		ObservableList<Alarm> listaAlarma = FXCollections.observableArrayList(filtriraniAlarmi); 
		alarmiTableView.setItems(listaAlarma); 
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
	
//	public void prikaziAlarme() {
//		try{
//		BorderPane alarmiPane= FXMLLoader.load(Main.class.getResource("Alarmi.fxml"));
//		Main.setCenterPane(alarmiPane);
//		} catch(IOException e) {
//		e.printStackTrace();
//		}
//	}
}

