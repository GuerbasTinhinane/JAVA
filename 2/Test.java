public class Test {
	
	public static void compare(Eleve eleve1, Eleve eleve2) {
		
		int comparaison = eleve1.compareTo(eleve2);
		
		if (comparaison > 0) 
			System.out.println(eleve1.getNom()+" est meilleur que "+eleve2.getNom());
		else  if  (comparaison == 0) 
			System.out.println(eleve1.getNom()+" et "+ eleve2.getNom()+" sont sur le meme seuil d'egalite"); 
		else 
			System.out.println(eleve2.getNom()+" est meilleur que "+eleve1.getNom());
	}
	
	public static void main(String[] args) {
		
		Eleve eleve = new Eleve("Sophia"); 
		eleve.ajouterNote(14);
		eleve.ajouterNote(17);
		eleve.ajouterNote(15);
		System.out.println(eleve.toString());
		
	
		Eleve autreEleve = new Eleve("Aria"); 
		autreEleve.ajouterNote(11);
		autreEleve.ajouterNote(18);
		autreEleve.ajouterNote(19);
		System.out.println(autreEleve.toString());
		
		
		compare(eleve,  autreEleve);	
	}
}
