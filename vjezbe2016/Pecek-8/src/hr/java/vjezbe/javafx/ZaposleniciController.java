package hr.java.vjezbe.javafx;

import javafx.scene.control.TextField;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class ZaposleniciController {
	private List<Zaposlenik> listaZaposlenika; 

	@FXML
	private TextField zaposleniciText; 
	@FXML 
	private TableView<Zaposlenik> zaposleniciTable; 
	@FXML 
	private TableColumn<Zaposlenik, String> korisnickoImeColumn; 
	@FXML 
	private TableColumn<Zaposlenik, String> prezimeColumn;
	@FXML 
	private TableColumn<Zaposlenik, String> imeColumn;
	@FXML 
	private TableColumn<Zaposlenik, String> sifraColumn;
	
	@FXML 
	public void initialize(){
		korisnickoImeColumn.setCellValueFactory(new PropertyValueFactory<Zaposlenik, String>("korisnickoIme")); 
		prezimeColumn.setCellValueFactory(new PropertyValueFactory<Zaposlenik, String>("prezime"));
		imeColumn.setCellValueFactory(new PropertyValueFactory<Zaposlenik, String>("ime"));
		sifraColumn.setCellValueFactory(new PropertyValueFactory<Zaposlenik, String>("sifraZaposlenika"));
		 
		listaZaposlenika = Main.ucitajZaposlenike();
		
	}
	
	public void print(){
		List<Zaposlenik> filter = new ArrayList<Zaposlenik>();
		if (zaposleniciText.getText().isEmpty() == false) {
			for(int i=0; i<listaZaposlenika.size(); i++){
				if(listaZaposlenika.get(i).getPrezime().contains(zaposleniciText.getText())) filter.add(listaZaposlenika.get(i));
			}
		}
		else{
			filter = listaZaposlenika;
		}
		ObservableList<Zaposlenik> lista = FXCollections.observableArrayList(filter); 
		zaposleniciTable.setItems(lista); 
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

