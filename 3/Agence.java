import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
public class Agence {

 private LinkedList<Voiture> listV ;

 public Agence() {
	
	 this.listV = null;
 }
public LinkedList<Voiture> getListe() {
		return listV;
	}
public void lister() {
		for (Voiture v : listV) {
			System.out.println(v);
		}
	}
public boolean correspond(Voiture v) {
	boolean b=false;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Quel est le prix?");
		float prix = sc.nextFloat();
	if(v.getPrixLocation()==prix)
		b =true;
	return b;}
}
public LinkedList<Voiture> selectionne(Critere c){
	LinkedList<Voiture> listselect = new LinkedList<Voiture>();
	Object o;
	Iterator<Voiture> i = listV.iterator();
	while(i.hasNext()){
		o = i.next();
		if (c.correspond(o))
			listselect.add((Voiture)o);
	}
    return listselect;
 }
} 