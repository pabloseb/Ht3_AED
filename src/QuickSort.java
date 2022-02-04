/**
 * Algoritmo QuickSort.
 * Modificado de https://github.com/andrewliu100/Algorithms/blob/master/Algorithms/src/geekspearls/sorting/QuickSort.java
 * COPYRIGHT (C) 2015 Andrew Liu. All Rights Reserved.
 *
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 */

public class QuickSort implements SortAlg {

    /**
     * Sort an object array in non-decreasing order by quick sort algorithm.
     *
     * @param input An array of objects
     */
    public <T extends Comparable<T>> T[] sort(T[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    /**
     * Quick sort the sub array <i>array[low..high]</i>.
     *
     * @param array An array of objects
     * @param low The start index of the sub array
     * @param high The end index of the sub array
     */
    private <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {

        if (low < high) {
            int w = split(array, low, high);
            quickSort(array, low, w - 1);
            quickSort(array, w + 1, high);
        }
    }

    /**
     * Partition the <i>array[low..high]</i> using <i>array[low]</i> as the pivot. All elements smaller than the pivot are placed on the left of the pivot.
     * All greater elements are placed on the right.<br/>
     *
     * A[0..5] = {5, 7, 1, 6, 4}, pivot = A[0] = 5. After partition, A[0..5] = {4, 1, 5, 6, 7}
     *
     * @param array An array of objects
     * @param low The start index of the sub array to partition
     * @param high The end index of the sub array to partition
     * @return The correct position index of the pivot
     */
    private <T extends Comparable<T>> int split(T[] array, int low, int high) {

        int i = low;
        T x = array[low];
        for (int j = low + 1; j <= high; j++) {
            if (array[j].compareTo(x) < 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, low, i);
        return i;
    }

    /**
     * Swap the elements at position i and j in the array
     *
     * @param array An array of objects
     * @param i The index of one element
     * @param j The index of another element
     */
    private <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        if (i == j) {
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
