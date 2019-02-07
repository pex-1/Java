package hr.java.vjezbe.javafx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.Zaposlenik;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NoviKlijentController {
	@FXML
	private TextField prezimeTextField;
	@FXML
	private TextField imeTextField;
	@FXML
	private TextField OIBTextField;
	@FXML
	private TextField brojTelefonaTextField;
	@FXML
	private TextField emailTextField;
	@FXML
	private DatePicker datumRodenjaTextField;
	@FXML
	private Button spremiButton;
	

	@FXML
	public void spremiKlijenta() {
		if(!(prezimeTextField.getText().equals("") || imeTextField.getText().equals("") || OIBTextField.getText().equals("") || brojTelefonaTextField.getText().equals("")||datumRodenjaTextField.getValue() == null)){
			String prezime = prezimeTextField.getText();
			String ime = imeTextField.getText();
			String oib = OIBTextField.getText();
			String tel = brojTelefonaTextField.getText();
			String email = emailTextField.getText();
			String temp = datumRodenjaTextField.toString();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			LocalDate datum = LocalDate.parse(temp, formatter);
			Klijent klijent = new Klijent(oib, ime, prezime, tel, email, datum);
			File zaposleniciFile = new File("dat/klijenti.txt");
			try (FileWriter writer = new FileWriter(zaposleniciFile, true);) {
				writer.write(oib + "\n");
				writer.write(ime + "\n");
				writer.write(prezime + "\n");
				writer.write(tel + "\n");
				writer.write(email + "\n");
				writer.write(datum + "");
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Uspješno spremanje klijenta!");
				alert.setHeaderText("Uspješno spremanje klijenta!");
				alert.setContentText("Uneseni podaci za klijenta su uspješno spremljeni.");
				alert.showAndWait();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Stage stage = (Stage) spremiButton.getScene().getWindow();
			stage.close();
//			ZaposleniciController.dodajNovogKlijenta(klijent);
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
			if(emailTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti email!\n";
			if(OIBTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti oib!\n";
			if(brojTelefonaTextField.getText().equals(""))
				poruka=poruka+"Morate unjeti broj telefona!\n";
			if(datumRodenjaTextField.getValue() == null)
				poruka=poruka+"Morate unjeti datum!\n";
			alert.setContentText(poruka);
			alert.showAndWait();
		}
		
	}

}
