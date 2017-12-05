
import java.util.Scanner;


public class RandomArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taille du tableau: ");
        int taille = input.nextInt();
        System.out.print("Valeur minimum: ");
        int min = input.nextInt();
        System.out.print("Valeur maximum: ");
        int max = input.nextInt();
        if(max <= min) {
            System.out.println("Veuillez introduire un maximum supérieur au minimum");
        } else {
            int[] tableau = new int[taille];
            /* remplacé par for"each"
            for(int i=0; i<tableau.length; i++) {
                tableau[i] = (int) (Math.random() * (max - min + 1) + min);
            }*/
            for (int element : tableau) {
                element = (int) (Math.random() * (max - min + 1) + min);
            }
            DefinitionArray.afficheTableau(tableau);
        }
    }
}
