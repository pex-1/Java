package hr.java.vjezbe.javafx;

import java.awt.TextField;
import java.io.IOException;
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
	private TableColumn<Alarm, String> vrijemeColumn; 
	@FXML 
//	public void initialize() { 
//		klijentColumn.setCellValueFactory(new PropertyValueFactory<Klijent, String>("klijent")); 
//		opisColumn.setCellValueFactory(new PropertyValueFactory<Alarm, String>("opis")); 
////		vrijemeColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Alarm, String>, ObservableValue<String>>() {
////			@Override public ObservableValue<String> call(CellDataFeatures<Alarm, String> param) { 
////				return new ReadOnlyObjectWrapper<String>(Main.dateTimeFormatter.format(param.getValue().getVrijeme())); 
////				} 
////			}); 
//		listaKlijenata = Main.ucitavanjeKlijenata(); 
//		listaZaposlenika = Main.ucitavanjeZaposlenika(); 
//		listaAlarma = Main.ucitavanjeAlarma(); 
////		tvrtka = Main.ucitavanjeTvrtke(); 
////		tvrtka.setKlijent(listaKlijenata); 
////		tvrtka.setZaposlenik(listaZaposlenika); 
//		} 
//	
	public void prikaziAlarme() { 
		listaAlarma = Main.ucitavanjeAlarma(); 
		List<Alarm> filtriraniAlarmi = new ArrayList<Alarm>();
		if (alarmiFilterTextField.getText().isEmpty() == false) { 
			filtriraniAlarmi = listaAlarma.stream().filter(p -> p.getKlijent().getOIB().contains(alarmiFilterTextField.getText())).collect(Collectors.toList()); 
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
	}

