public class Voiture {
 private String marque;
 private String modele;
 private int anneep;
 private float prixLocation;
public Voiture( String marque,String modele, int anneep, float prixLocation) {
	this.marque = marque;
	this.modele = modele;
	this.anneep = anneep;
	this.prixLocation = prixLocation;
 }
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public int getAnneep() {
	return anneep;
}
public void setAnneep(int anneep) {
	this.anneep = anneep;
}
public float getPrixLocation() {
	return prixLocation;
}
public void setPrixLocation(float prixLocation) {
	this.prixLocation = prixLocation;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Voiture other = (Voiture) obj;
	if (anneep != other.anneep)
		return false;
	if (marque == null) {
		if (other.marque != null)
			return false;
	} else if (!marque.equals(other.marque))
		return false;
	if (modele == null) {
		if (other.modele != null)
			return false;
	} else if (!modele.equals(other.modele))
		return false;
	if (Float.floatToIntBits(prixLocation) != Float.floatToIntBits(other.prixLocation))
		return false;
	return true;
}

public String toString() {
	return "Voiture [marque=" + marque + ", modele=" + modele + ", anneep=" + anneep + ", prixLocation=" + prixLocation
			+ "]";
}

} 