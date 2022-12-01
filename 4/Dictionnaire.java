
public class Dictionnaire extends Volume {
	private String theme;
	
	public Dictionnaire(String titre, String auteur, String theme) {
		super(titre, auteur);
		this.theme = theme;
	}
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String toString() {
		return ("Dictionnaire : theme =" + theme +
				",auteur =" + auteur + ",titre ="
		        + titre + ",theme =" + getTheme()+ 
		       ",classe:" + getClass()
		       + super.toString());
	}


}
