/**
 * Prueba Unitaria MergeSort.
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testSortNum() {
        Integer[] data = Archivos.leerInt(1000);
        RadixSort.radixsort(data);

        for (int i=0; i<999; i++){
            if (data[i] > data[i+1]){
                fail("Error");
            }
        }
    }

    @Test
    public void testSortString() {
        String[] data = {"abc", "aab", "bac", "bab"};
        SortAlg sortAlg = new MergeSort();
        sortAlg.sort(data);
        String[] ref = {"aab", "abc", "bab", "bac"};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }

    }
}
