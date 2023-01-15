import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int[] donnees = genererDonneesEntreBornes(50, 0, 20);

        int[] donnees = genererDonnees(200000);
//        System.out.println(Arrays.toString(donnees));

        long tempsDebut = System.nanoTime();

        triBullesSalah(donnees);
//        Arrays.sort(donnees); // trie le tableau en utilisant un algorithme de type Quicksort

        long tempsFin = System.nanoTime();

        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDebut) / 1000000) );


        // Tableau aléatoire


        // Question préliminaire


        // Question 1


        // Question 2
        triBulles(donnees);
    }

    /*
    Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires
    (valeurs comprises entre Integer.MIN_VALUE=-2^31 et Integer.MAX_VALUE=2^31-1 inclus).
*/
    public static int[] genererDonnees(int n) {
        Random random = new Random();
        int[] t = new int[n];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
        return t;
    }

    /*
        Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires comprises entre min et max inclus.
    */
    public static int[] genererDonneesEntreBornes(int n, int min, int max) {
        Random random = new Random();
        int[] t = new int[n];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = random.nextInt(max-min+1)+min; // nextInt(borne) retourne un int compris entre 0 inclus et borne exclus.
        return t;
    }

    public static void affichageArray(int[] tab) {
        for (int element : tab) {
            System.out.print(element + "\n");
        }
    }

    public static void triSelection(int[] tab) {

    }

    /*
        Temps : 63533ms
     */
    public static void triBulles(int[] tab) {
        int pivot;

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if(tab[j+1] < tab[j]) {
                    pivot = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = pivot;
                }
            }
        }
    }

    public static void triPeigne(int[] tab) {

    }
}
