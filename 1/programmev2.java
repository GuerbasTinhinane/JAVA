
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
public class programmev2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entrez la taille de la collection : ");
			 int n = sc.nextInt();
			 
			 TreeSet<Integer> set = new TreeSet<Integer>();

			for(int i=0;i<n;i++){ 
				Random r = new Random();
			    int nbr = r.nextInt(1000);
				set.add(nbr); 
			}
			
		}

	}

}
