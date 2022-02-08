/**
 * Prueba Unitaria RadixSort.
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class RadixSortTest {

    @Test
    public void testSort(){
        Integer[] data = {2, 1, 3, 5};
        RadixSort.radixsort(data);
        Integer[] ref = {1, 2, 3, 5};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }

        Integer[] data2 = {102, 104, 301, 25};
        RadixSort.radixsort(data2);
        Integer[] ref2 = {25, 102, 104, 301};

        for (int i=0; i<4; i++){
            assertEquals(data2[i], ref2[i], "Error");
        }
    }
}
