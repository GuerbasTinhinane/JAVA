import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
public class Annuaire implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Map<String, Fiche> Map = new HashMap<>();

public Map<String, Fiche> getMap() {
	return Map;
}

public void setMap(Map<String, Fiche> map) {
	Map = map;
}
}