import java.util.LinkedList;

public class Programme {

	public static void main(String[] args) {
		Agence agence = new Agence();
		Voiture v1 = new Voiture("toyota", "yaris", 2020, 5000);
		agence.getListe().add(v1);
		Voiture v2 = new Voiture("Audi", "A1", 2020, 15000);
		agence.getListe().add(v2);
		Voiture v3 = new Voiture("Audi", "Q5", 2020, 20000);
		agence.getListe().add(v3);
		Voiture v4 = new Voiture("bmw", "i4", 2020, 22000);
		agence.getListe().add(v4);
		Voiture v5 = new Voiture("bmw", "x2", 2020, 20000);
		agence.getListe().add(v5);
		Voiture v6 = new Voiture("bugatti", "divo", 2020, 45000);
		agence.getListe().add(v6);
		
		agence.lister();
		
		LinkedList<Voiture> car; 
		car = agence.selectionne(new CriterePrix(20000));
		
		InterCritere c = new InterCritere();
		c.ajouter(new CritereMarque("Reunault"));
		c.ajouter(new CriterePrix(20000));
		LinkedList<Voiture> v;
		v = agence.selectionne(c);

	}

}
