import java.util.LinkedList;

public class Adherent {
	private String nom;
	private String prenom;
	public LinkedList<Empruntable> L = new LinkedList<Empruntable>();

	public Adherent(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
	this.prenom = prenom;
	}
	
	public String toString() {
		return ("Adherent a pour nom " + nom + 
				" ,et pour prenom " + prenom);
	}
	public boolean emprunter(Empruntable o) {
		if( o instanceof Livre) {
			if(L.size() < 5) {
				if(o.isDisponible()) {
					L.add(o);
		            Livre l = (Livre) o;
		            l.setAdherent(this);
		            return true; 
		         }
		     }
		     System.out.print(" Vous avez deja effectue 5 emprunts\n");
		     return false; 
		}
		return false;
	}
	
	public boolean rendre(Empruntable o) {
		if( o instanceof Livre) {
			if(L.contains(o)){
				L.remove(o);
		        Livre l = (Livre) o;
		        l.setAdherent(null);
		        return true;
		     }
		     return false;
		}
		return false;
	}
	
	public void afficherEmprunts() {
		System.out.println(L);
	}

}
