
public class DefinitionArray {

    public static void main(String[] args) {
        int taille = 10;
        int[] tableau = new int[taille];    // définition d'un tableau
        afficheTableau(tableau);

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = 1000 + i;
        }
        afficheTableau(tableau);
    }

    public static void afficheTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " "); // affiche les éléments du tableau
        }
        System.out.println("");             // retour à ligne pour une présentation plus élégante
    }

}
