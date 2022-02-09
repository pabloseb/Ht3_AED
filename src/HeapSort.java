/**
 * Algoritmo HeapSort.
 * Modificado de https://gist.github.com/jayeshsolanki93/10404428
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

public class HeapSort implements SortAlg {

    static <E extends Comparable<? super E>> void heapify(E[] a, int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n)
            if (a[child].compareTo(a[max]) > 0)
                max = child;
        if (child + 1 < n)
            if (a[child + 1].compareTo(a[max]) > 0)
                max = child + 1;
        if (max != i) {
            E temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    static <T extends Comparable<? super T>> void buildheap(T[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            heapify(a, a.length, i);
    }

    public <T extends Comparable<T>> void sortComp(T[] input) {
        buildheap(input);
        for (int i = input.length - 1; i >= 1; i--) {
            T temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            heapify(input, i, 0);
        }

    }

    public void sort(Integer[] input) {
        sortComp(input);
    }
}
