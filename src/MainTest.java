import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void notSorted() {
        int[] donnes = Main.genererDonnees(500);

        assertFalse(Main.isSorted(donnes), "Tableau non triée");
    }

    @Test
    void triPeigne() {
        int[] donnees = Main.genererDonnees(500);
        Main.triPeigne(donnees);

        assertTrue(Main.isSorted(donnees), "Tableau tri à peigne");
    }

    @Test
    void triInsertion() {
        int[] donnees = Main.genererDonnees(500);
        Main.triInsertion(donnees);

        assertTrue(Main.isSorted(donnees), "Tableau tri à insertion");
    }

    @Test
    void triBulles() {
        int[] donnees = Main.genererDonnees(500);
        Main.triBulles(donnees);

        assertTrue(Main.isSorted(donnees), "Tableau tri à bulles");
    }
}
