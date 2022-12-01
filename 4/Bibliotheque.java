
import java.util.Collection;
import java.util.LinkedList;

public class Bibliotheque {
	public LinkedList<Adherent> A = new LinkedList<Adherent>();
	public LinkedList<Document> D = new LinkedList<Document>();

	public String toString() {
		return ("Bibliotheque: -adherent=" + A + " -document=" + D) ;
		}

	public Boolean addAdherent(Adherent adherent) {
		if (A.contains(adherent)) return false ;
	    else
	    {
	    	A.add(adherent);
	        return true;
	    }
	}
	
	public Boolean addDocument(Document document) {
		if (D.contains(document)) return false ;
	    else
	    {
	    	D.add(null);
	        return true;
	    }
	}

	public void afficherFonds() {
		System.out.println(D);
	}
	
	public Collection rechercherTitre ( String mot) {
		LinkedList<Document> d = new LinkedList<Document>();
		
		for(Document o: D)
		{
			if(o.getTitre().indexOf(mot)!= -1)
			{
				d.add(o);
			}
		}
		return d;
	}


}
