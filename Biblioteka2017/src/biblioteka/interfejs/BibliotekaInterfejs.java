package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> bratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov,
			Autor autor, long isbn,String izdavac);
	
}
