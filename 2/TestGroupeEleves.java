public class TestGroupeEleves {
	public static void main(String[] args) {
		
		GroupeEleves groupe = new GroupeEleves();	
		
		Eleve eleve = new Eleve("Sophia");
		eleve.ajouterNote(15);
		eleve.ajouterNote(17);
		groupe.ajouterEleve(eleve);
		
		Eleve eleve1 = new Eleve("Aria");
		eleve1.ajouterNote(16);
		eleve1.ajouterNote(18);
		groupe.ajouterEleve(eleve1);
		
		Eleve eleve2 = new Eleve("Jasmine");
		eleve2.ajouterNote(18);
		eleve2.ajouterNote(12);
		groupe.ajouterEleve(eleve2);

		Eleve meilleurE = groupe.meilleurEleve();
		System.out.println("Le ou la Meilleur(e) eleve est : " + meilleurE.getNom());
		
		groupe.trierEleves();
		System.out.println("\nVoici la liste triee par moyenne:");
		groupe.lister();
		
		groupe.trierElevesNom(groupe);
		System.out.println("\nVoici la liste triee par nom:");
		groupe.lister();
	}
}
