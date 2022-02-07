import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testSortNum() {
        Comparable[] data = {102, 104, 301, 25};
        SortAlg sortAlg = new QuickSort();
        sortAlg.sort(data);
        Comparable[] ref = {25, 102, 104, 301};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }
    }

    @Test
    public void testSortString() {
        Comparable[] data = {"abc", "aab", "bac", "bab"};
        SortAlg sortAlg = new QuickSort();
        sortAlg.sort(data);
        Comparable[] ref = {"aab", "abc", "bab", "bac"};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }

    }
}