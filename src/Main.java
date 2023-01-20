import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] donnees = genererDonneesEntreBornes(50, 0, 20);
        int[] donnees = genererDonnees(500);
//        System.out.println(Arrays.toString(donnees));

        long tempsDebut = System.nanoTime();



        long tempsFin = System.nanoTime();
        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDebut) / 1000000) );
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

    public static boolean isSorted(int[] tab) {
        for(int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void affichageArray(int[] tab) {
        for (int element : tab) {
            System.out.print(element + "\n");
        }
    }

    /*
        Temps : 3585ms
     */
    public static void triInsertion(int[] tab) {
        for(int i = 1; i < tab.length; i++) {
            int j = i - 1;
            int val = tab[i];
            while (j >= 0 && tab[j] > val) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = val;
        }
    }

    /*
        Temps : 63533ms
     */
    public static void triBulles(int[] tab) {
        int pivot;

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if(tab[j] > tab[j+1]) {
                    pivot = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = pivot;
                }
            }
        }
    }

    /*
        28ms
     */
    public static void triPeigne(int[] tab) {
        int gap = tab.length;
        boolean swap = true;

        while (gap > 1 || swap) {
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }

            swap = false;
            for(int i = 0; i + gap < tab.length; i++) {
                if (tab[i] > tab[i + gap]) {
                    int pivot = tab[i];
                    tab[i] = tab[i + gap];
                    tab[i + gap] = pivot;
                    swap = true;
                }
            }
        }
    }
//
//    public static void triComptage(int[] tab){
//        int plusGrand=tab[0];
//        int indice = 0;
//
//        for (int i=1; i<tab.length; i++){
//            if (tab[i]>plusGrand){
//                plusGrand = tab[i];
//            }
//        }
//
//        int[] output = new int[plusGrand];
//
//
//        for (int i=0; i<output.length; i++){
//            output[i]=0;
//        }
//
//
//        for (int i=0; i<tab.length; i++){
//            output[tab[i]]++;
//        }
//
//        for (int i=0; i<output.length; i++){
//            for (int j=0; j<output[i]; j++)
//                tab[indice]=output[i];
//            indice++;
//        }
//
//        System.out.println(tab);
//
//    }



    public static int[] plusGrands(int[] tab, int n) {

        int[] result = new int[n];
        int valeurtemporaire, i, j;
        for (i=0; i< tab.length; i++) {
            for(j=i; j< tab.length; j++) {
                if(tab[j]>tab[i]) {
                    valeurtemporaire = tab[i];
                    tab[i] = tab[j];
                    tab[j] = valeurtemporaire;
                }
            }
        }
        for(int k=0; k < n; k++){
            result[k] = tab[k];
        }
        return result;
    }
}
