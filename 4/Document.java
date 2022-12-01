
public class Document {
	protected String titre;
	
	public Document(String titre) {
		this.titre = titre;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String toString() {
		return ("Document : titre=" + titre +
		  " ,classe" + getClass());
		}

}
