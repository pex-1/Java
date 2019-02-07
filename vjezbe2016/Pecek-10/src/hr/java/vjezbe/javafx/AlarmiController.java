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

public class AlarmiController {
	private List<Klijent> listaKlijenata; 
	private List<Zaposlenik> listaZaposlenika; 
	private List<Alarm> listaAlarma; 
//	private MaloprodajnaTvrtka tvrtka; 
	
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

