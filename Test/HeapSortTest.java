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
        Integer[] data = Archivos.leer(1000);
        SortAlg sortAlg = new HeapSort();
        sortAlg.sort(data);

        for (int i=0; i<999; i++){
            if (data[i] > data[i+1]){
                fail("Error");
            }
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
