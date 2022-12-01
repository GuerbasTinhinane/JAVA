public class CritereMarque implements Critere {
 private String marquee;
 
 CritereMarque(String marque){
	 marquee = marque;
 }
 public boolean correspond ( Object o) {
	 boolean b;
	 b = ((o instanceof Voiture)&&(!(o==null))&&(((Voiture) o).getMarque()==marquee));
	 return b; 
  }
 }

