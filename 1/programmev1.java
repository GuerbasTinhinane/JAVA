
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class programmev1 {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entrez la taille de la collection : ");
			 int n = sc.nextInt();
			 
			ArrayList<Integer> list = new ArrayList<Integer>(); 

			for(int i=0;i<n;i++){ 
				Random r = new Random();
			    int nbr = r.nextInt(1000);
				list.add(nbr); 
			}
			Collections.sort(list);
		}
	}
}
		
        