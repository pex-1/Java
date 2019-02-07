package hr.java.vjezbe.sortiranje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import hr.java.vjezbe.entitet.Komunikacija;

public class KomunikacijaSorter implements Comparator<Komunikacija> {
	private List<Komunikacija> sorted = new ArrayList<>();

	@Override
	public int compare(Komunikacija o1, Komunikacija o2) {
//		"a".compareTo("b"); // returns a negative number, here -1
		boolean before = false;
		if(o1.getKlijent().getPrezime().compareTo(o2.getKlijent().getPrezime()) == -1){
			before = true;
		}
		
		if(o1.getVrijemeKomunikacije().isBefore(o2.getVrijemeKomunikacije())||before){
			return 1;
		}
		else{
			return -1;
		}
	}

	
	

}
