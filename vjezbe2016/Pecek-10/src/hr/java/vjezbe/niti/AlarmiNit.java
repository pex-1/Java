package hr.java.vjezbe.niti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import hr.java.vjezbe.entitet.Klijent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

public class AlarmiNit implements Runnable {
	static Connection veza = spajanjeNaBazuPodataka();
//	Statement statementKlijenti = veza.createStatement();
//	ResultSet resultSetKlijenti = statementKlijenti.executeQuery("SELECT * FROM CRM.ALARM WHERE TIMESTAMPDIFF('SECOND', VRIJEME, NOW()) <= 60 ORDER BY VRIJEME ASC");


	
	ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1); 
	AlarmiNit alarmiNit = new AlarmiNit(); 
//	scheduler.scheduleAtFixedRate( alarmiNit, 0, 10, TimeUnit.SECONDS);
	
	
	
	
//	ButtonType confirmButton = new ButtonType("Da", ButtonBar.ButtonData.OK_DONE); 
//	ButtonType cancelButton = new ButtonType("Ne", ButtonBar.ButtonData.CANCEL_CLOSE); 
//	Alert alert = new Alert(AlertType.CONFIRMATION, "Alarm za korisnika " + alarm.getKlijent().getPrezime() + " " + alarm.getKlijent().getIme() + " s opisom '" + alarm.getOpis() + "' istjeèe " + Main.dateTimeFormatter.format(alarm.getVrijeme()) + " Želite li unijeti podatke o komunikaciji?", confirmButton, cancelButton);
//	alert.setTitle("Upozorenje");
//	alert.setHeaderText("Alarm pred istekom");
//	Optional<ButtonType> response = alert.showAndWait();
//	if (response.isPresent() && response.get() == confirmButton) {
//	//prikaz ekrana za odabir zaposlenika
//	}
	
	
	private static Connection spajanjeNaBazuPodataka(){
		try{
			veza = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Java-2014", "student", "student");
			} catch(SQLException e) {
			e.printStackTrace();
		}
		return veza;
	}
	
	private static void zatvaranjeVezeNaBazuPodataka(Connection veza){
		try{
			veza.close();
			} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
