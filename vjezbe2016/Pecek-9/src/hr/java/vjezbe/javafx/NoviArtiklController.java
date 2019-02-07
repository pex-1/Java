package hr.java.vjezbe.javafx;
import javafx.scene.control.Tooltip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import hr.java.vjezbe.entitet.Artikl;
import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NoviArtiklController {
	@FXML
	private TextField nazivTextField;
	@FXML
	private TextField kategorijaTextField;
	@FXML
	private TextField opisTextField;
	@FXML
	private Button spremiButton;
	@FXML
	private Tooltip tool1;
	@FXML
	private Tooltip tool2;
	@FXML
	private Tooltip tool3;

	@FXML
	public void spremiZaposlenika() {
		if(!(nazivTextField.getText().equals("") || kategorijaTextField.getText().equals("")|| opisTextField.getText().equals(""))){
			String naziv = nazivTextField.getText();
			String kategorija = kategorijaTextField.getText();
			String opis = opisTextField.getText();
			Artikl artikl = new Artikl(naziv, kategorija, opis);
			File artikliFile = new File("dat/artikli.txt");
			try (FileWriter writer = new FileWriter(artikliFile, true);) {
				writer.write(naziv + "\n");
				writer.write(kategorija + "\n");
				writer.write(opis + "\n");
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Uspješno spremanje artikla!");
				alert.setHeaderText("Uspješno spremanje artikla!");
				alert.setContentText("Uneseni podaci za artiklu su uspješno spremljeni.");
				alert.showAndWait();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Stage stage = (Stage) spremiButton.getScene().getWindow();
			stage.close();
			ArtikliController.dodajNoviArtikl(artikl);
		}
		else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Neuspješno spremanje zaposlenika!");
			alert.setHeaderText("Potrebno je ispraviti sljedece pogreske:");
			String poruka="";
			if(nazivTextField.getText().equals("")){
				poruka="Morate unjeti naziv!\n";
				tool1.setOpacity(1);
				tool1.setText("Morate upisati naziv!");
				nazivTextField.setTooltip(tool1);
			}
				
			if(kategorijaTextField.getText().equals("")){
				poruka=poruka+"Morate unjeti kategoriju!\n";
				tool2.setOpacity(1);
				tool2.setText("Morate upisati kategoriju!");
				kategorijaTextField.setTooltip(tool2);
			}
				
			if(opisTextField.getText().equals("")){
				poruka=poruka+"Morate unjeti opis!\n";
				tool3.setOpacity(1);
				tool3.setText("Morate upisati opis!");
				opisTextField.setTooltip(tool3);
			}
				
			alert.setContentText(poruka);
			alert.showAndWait();
		}
		
	}


}
