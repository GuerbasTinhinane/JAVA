import java.util.Iterator;
import java.util.LinkedList;
public class InterCritere {
	LinkedList<Critere> listC = new LinkedList<Critere>();
	
    public void ajouter(Critere c){
    	listC.add(c);
    }
    public boolean correspond ( Object o){
    	boolean b = true;
		Iterator<Critere> i = listC.iterator();
		Critere c;
		while((i.hasNext()) && (b)){
			c = (Critere) i.next();
			if( !(c.correspond(o)))
				b = false;
		}
		return b;
	}

}
 