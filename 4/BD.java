
public class BD extends Volume {
	private String dessinateur;
	
	public BD(String titre, String auteur, String dessinateur) {
		super(titre, auteur);
		this.dessinateur = dessinateur;
	}
	
	public String getDessinateur() {
		return dessinateur;
	}
	
	public void affichage(){
		System.out.println(this);
	}
	
	public String toString() {
		return ("BD: -dessinateur: " + dessinateur + 
				" ,classe:" + getClass());
		}

}
