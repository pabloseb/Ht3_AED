/**
 * Prueba Unitaria Archivos.
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ArchivosTest {

    @Test
    public void test(){
        Archivos.escribir();
        Integer[] data = Archivos.leer(2);
        assertEquals(data.length, 2, "Error");

    }
}
