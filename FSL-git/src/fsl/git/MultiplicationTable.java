/*
affiche la table de multiplication d'un nombre
 */
import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre: ");
        int nombre = input.nextInt();
        System.err.print("Plus grand multiplicateur: ");
        int multi = input.nextInt();
        int[] table = new int[multi+1];
        for(int i=0; i<=multi; i++) {
            table[i] = i * nombre;
        }
        for (int element : table) {
            System.out.print(element + " - ");
        }
    }
}
