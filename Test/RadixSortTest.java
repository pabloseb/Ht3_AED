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

        Integer[] data = Archivos.leer(1000);
        RadixSort.radixsort(data);

        for (int i=0; i<999; i++){
            if (data[i] > data[i+1]){
                fail("Error");
            }
        }

        Integer[] data2 = {102, 104, 301, 25};
        RadixSort.radixsort(data2);
        Integer[] ref2 = {25, 102, 104, 301};

        for (int i=0; i<4; i++){
            assertEquals(data2[i], ref2[i], "Error");
        }
    }
}
