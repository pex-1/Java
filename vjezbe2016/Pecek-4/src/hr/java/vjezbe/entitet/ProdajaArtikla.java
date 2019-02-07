package hr.java.vjezbe.entitet;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProdajaArtikla extends Usluga implements Robna {
	private List<Artikl> artikl = new ArrayList<>();

	public ProdajaArtikla(Klijent klijent, String vrstaUsluge, String opisUsluge, LocalDate datumUsluge,
			BigDecimal cijenaUsluge, boolean obavljena, boolean naplacena, List<Artikl> artikl) {
		super(klijent, vrstaUsluge, opisUsluge, datumUsluge, cijenaUsluge, obavljena, naplacena);
		this.artikl = artikl;
	}

	@Override
	public BigDecimal prodaja(int brojArtikala) {
		setObavljena(true);
		setNaplacena(true);
		return getCijenaUsluge().multiply(new BigDecimal(brojArtikala));
	}

	public List<Artikl> getArtikl() {
		return artikl;
	}

	public void setArtikl(List<Artikl> artikl) {
		this.artikl = artikl;
	}

}
