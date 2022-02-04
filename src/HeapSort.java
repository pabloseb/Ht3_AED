/**
 * Algoritmo HeapSort.
 * Modificado de https://github.com/Bouowmx/APCS/blob/master/18-Heapsort/Heapsort.java
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

public class HeapSort implements SortAlg {

    public static <E extends Comparable<? super E>> void heapify(E[] a) {
        for (int i = (a.length - 2) / 2; i >= 0; i--) {
            shiftDown(a, i, a.length - 1);
        }
    }

    public <T extends Comparable<T>> T[] sort(T[] input) {
        heapify(input);
        for (int i = input.length - 1; i > 0; i--) {
            swap(input, i, 0);
            shiftDown(input, 0, i);
        }
        return input;
    }

    public static <E extends Comparable<? super E>> void shiftDown(E[] a, int start, int end) {
        int root = start;
        while (2 * root + 1 <= end) {
            int swap = root, leftChild = 2 * root + 1, rightChild = 2 * root + 2;
            if (a[swap].compareTo(a[leftChild]) < 0) {swap = leftChild;}
            if ((rightChild <= end) && (a[swap].compareTo(a[rightChild]) < 0)) {swap = rightChild;}
            if (swap != root) {
                swap(a, root, swap);
                root = swap;
            }
            else {return;}
        }
    }

    public static <E> void swap(E[] a, int i1, int i2) {
        E t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
    }
}
