package hr.java.vjezbe.baza.podataka;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hr.java.vjezbe.entitet.Klijent;
import hr.java.vjezbe.entitet.Tvrtka;

public class BazaPodataka {
	static Connection veza = null;
	
	
	//spremanje u bazu podataka
	public static void spremiKlijenta(Klijent klijent, Tvrtka tvrtka)
			throws SQLException, IOException {
			Connection veza = spajanjeNaBazuPodataka();
			veza.setAutoCommit(false);
			try {
			PreparedStatement insertKlijent = veza.prepareStatement("INSERT INTO CRM.KLIJENT (OIB, PREZIME, IME, TELEFON, EMAIL, DATUM_RODJENJA)VALUES (?, ?, ?, ?, ?, ?);");
					insertKlijent.setString(1, klijent.getOIB());
					insertKlijent.setString(2, klijent.getPrezime());
					insertKlijent.setString(3, klijent.getIme());
					insertKlijent.setString(4,
					klijent.getBrojTelefona());
					insertKlijent.setString(5, klijent.getEmail());
					insertKlijent.setDate(6,
					Date.valueOf(klijent.getDatumRodenja()));
					insertKlijent.executeUpdate();
					ResultSet generatedKeys = insertKlijent.getGeneratedKeys();
					if (generatedKeys.next()) {
					klijent.setId(generatedKeys.getInt(1));
					}
					PreparedStatement insertTvrtkaKlijent = veza
					.prepareStatement("INSERT INTO	CRM.TVRTKA_KLIJENT VALUES (?, ?)");
					insertTvrtkaKlijent.setInt(1, 1);
					insertTvrtkaKlijent.setInt(2, klijent.getId());
					insertTvrtkaKlijent.executeUpdate();
					veza.commit();
					}
					catch(Throwable ex) {
					veza.rollback();
					throw ex;
				}
					zatvaranjeVezeNaBazuPodataka(veza);
	}
	
	//dohvat podataka iz tablice u bazi podataka i vraèanje liste
	public static List<Klijent> dohvatiKlijente() throws SQLException,
	IOException {
		Connection veza = spajanjeNaBazuPodataka();
		Statement statementKlijenti = veza.createStatement();
		ResultSet resultSetKlijenti =
				statementKlijenti.executeQuery("SELECT * FROM CRM.KLIJENT");
		List<Klijent> listaKlijenata = new ArrayList<>();
		while (resultSetKlijenti.next()) {
			Integer klijentId = resultSetKlijenti.getInt("ID");
			String oib = resultSetKlijenti.getString("OIB");
			String prezime =
			resultSetKlijenti.getString("PREZIME");
			String ime = resultSetKlijenti.getString("IME");
			String brojTelefona =
			resultSetKlijenti.getString("TELEFON");
			String email = resultSetKlijenti.getString("EMAIL");
			LocalDate datumRodjenja = resultSetKlijenti.getDate("DATUM_RODJENJA").toLocalDate();
			Klijent klijent = new Klijent(oib, prezime, ime,
			brojTelefona, email, datumRodjenja);
			klijent.setId(klijentId);
			listaKlijenata.add(klijent);
		}
		zatvaranjeVezeNaBazuPodataka(veza);
		return listaKlijenata;
	}
	
	
	private static Connection spajanjeNaBazuPodataka(){
		try{
			veza = DriverManager.getConnection(
			"jdbc:h2:tcp://localhost/~/Java-2014", "student", "student");
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

}
