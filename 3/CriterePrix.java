public class CriterePrix implements Critere {
 private float prix;
 
public CriterePrix(float prix) {
	super();
	this.prix = prix;
}

public boolean correspond(Object o) {
	boolean b;
	b = ((o instanceof Voiture) && (!(o==null)) && (((Voiture)o).getPrixLocation()<=prix));
	return b;
}
} 