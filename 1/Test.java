
public class Test {

	public static void main(String[] args) {
		Eleve eleve = new Eleve("Sophia"); 
		System.out.println(eleve.getMoyenne());
		System.out.println(eleve.getNom());
		eleve.ajouterNote(14);
		eleve.ajouterNote(17);
		eleve.ajouterNote(15);
		System.out.println(eleve.toString());

	}

}
