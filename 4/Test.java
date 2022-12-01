

public class Test {
	public static void main(String[] args) {
		Bibliotheque bib = new Bibliotheque();
		
		Adherent ad = new Adherent("Guerbas", "Tinhinane");
		bib.addAdherent(ad);
		Adherent ad2 = new Adherent("Achour","Sarah");
		bib.addAdherent(ad2);
		
		bib.addDocument(new Livre("Les Misérables","Victor Hugo"));
		bib.addDocument( new Journal("Liberte","01/01/2022"));
		bib.addDocument( new BD("Dessin1","G.T", "G.T."));
		bib.addDocument( new Livre("document1","G.T."));
		bib.addDocument( new Livre("document2","G.T."));
		}
}
   


