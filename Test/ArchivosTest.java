import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ArchivosTest {

    @Test
    public void test(){
        Archivos.escribir();
        int[] data = Archivos.leer(2);
        assertEquals(data.length, 2, "Error");

    }
}
