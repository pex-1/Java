package hr.java.vjezbe.javafx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.javafx.logging.Logger;

import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NoviZaposlenikController {
	@FXML
	private TextField prezimeTextField;
	@FXML
	private TextField imeTextField;
	@FXML
	private TextField sifraTextField;
	@FXML
	private TextField korisnickoImeTextField;
	@FXML
	private Button spremiButton;
	

	@FXML
	public void spremiZaposlenika() {
		if(!(prezimeTextField.getText().equals("") || imeTextField.getText().equals("") || sifraTextField.getText().equals("") || korisnickoImeTextField.getText().equals(""))){
			String korisnickoIme = korisnickoImeTextField.getText();
			String prezime = prezimeTextField.getText();
			String ime = imeTextField.getText();
			String sifra = sifraTextField.getText();
			Zaposlenik zaposlenik = new Zaposlenik(korisnickoIme, ime, prezime, sifra);
			File zaposleniciFile = new File("dat/zaposlenici.txt");
			try (FileWriter writer = new FileWriter(zaposleniciFile, true);) {
				writer.write(korisnickoIme + "\n");
				writer.write(ime + "\n");
				writer.write(prezime + "\n");
				writer.write(sifra + "");
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Uspješno spremanje zaposlenika!");
				alert.setHeaderText("Uspješno spremanje zaposlenika!");
				alert.setContentText("Uneseni podaci za zaposlenika su uspješno spremljeni.");
				alert.showAndWait();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Stage stage = (Stage) spremiButton.getScene().getWindow();
			stage.close();
//			ZaposleniciController.dodajNovogZaposlenika(zaposlenik);
		}
		else{
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Neuspješno spremanje zaposlenika!");
			alert.setHeaderText("Potrebno je ispraviti sljedece pogreske:");
			String poruka="";
			if(prezimeTextField.getText().equals(""))
				poruka="Morate unjeti prezime!\n";
			if(imeTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti ime!\n";
			if(sifraTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti sifru!\n";
			if(korisnickoImeTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti korisnicko ime!\n";
			alert.setContentText(poruka);
			alert.showAndWait();
		}
		
	}

}
