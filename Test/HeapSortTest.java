import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
 * Prueba Unitaria HeapSort.
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

public class HeapSortTest {

    @Test
    public void testSortNum() {
        Integer[] data = {102, 104, 301, 25};
        SortAlg sortAlg = new HeapSort();
        sortAlg.sort(data);
        Integer[] ref = {25, 102, 104, 301};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }
    }

    @Test
    public void testSortString() {
        String[] data = {"abc", "aab", "bac", "bab"};
        SortAlg sortAlg = new HeapSort();
        sortAlg.sort(data);
        String[] ref = {"aab", "abc", "bab", "bac"};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }

    }
}
