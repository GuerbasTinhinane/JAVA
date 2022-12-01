
public class Volume extends Document {
	protected String auteur;
	
	public Volume(String titre, String auteur) {
		super(titre);
		this.auteur = auteur;
	}

	public String toString() {
		return ("Volume : -auteur: " + auteur + 
			   " -titre: " + titre + super.toString() + 
		        " ,classe:"+ getClass());
	}
}
