import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testSortNum() {
        Comparable[] data = {102, 104, 301, 25, 1};
        SortAlg sortAlg = new MergeSort();
        sortAlg.sort(data);
        Comparable[] ref = {1, 25, 102, 104, 301};

        for (int i=0; i<5; i++){
            assertEquals(data[i], ref[i], "Error");
        }
    }

    @Test
    public void testSortString() {
        Comparable[] data = {"abc", "aab", "bac", "bab"};
        SortAlg sortAlg = new MergeSort();
        sortAlg.sort(data);
        Comparable[] ref = {"aab", "abc", "bab", "bac"};

        for (int i=0; i<4; i++){
            assertEquals(data[i], ref[i], "Error");
        }

    }
}
