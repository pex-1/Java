package hr.java.vjezbe.entitet;

import java.util.ArrayList;
import java.util.List;

public class MaloprodajnaTvrtka extends Tvrtka{
	private List<Artikl> artikl = new ArrayList<>();
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public MaloprodajnaTvrtka(String nazivTvrtke, String oIBTvrtke, List<Artikl> artikl) {
		super(nazivTvrtke, oIBTvrtke);
		this.artikl = artikl;
	}

	public List<Artikl> getArtikl() {
		return artikl;
	}

	public void setArtikl(List<Artikl> artikl) {
		this.artikl = artikl;
	}
	

	

}
