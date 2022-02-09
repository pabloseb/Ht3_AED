/**
 * Algoritmo MergeSort.
 * Modificado de:
 * Varun Upadhyay (https://github.com/varunu28)
 * Podshivalov Nikita (https://github.com/nikitap492)
 *
 * @author Manuel Martinez
 * @author Jorge Andrino
 * @author Pablo Herrera
 */


public class MergeSort implements SortAlg {

    /**
     * This method implements the Generic Merge Sort
     *
     * @param input the array which should be sorted
     * @param <T>      Comparable class
     * @return sorted array
     */
    public <T extends Comparable<T>> void sortComp(T[] input) {
        T[] tmp = (T[]) new Comparable[input.length];
        doSort(input, tmp, 0, input.length - 1);
    }

    /**
     * @param arr   The array to be sorted
     * @param temp  The copy of the actual array
     * @param left  The first index of the array
     * @param right The last index of the array
     *              Recursively sorts the array in increasing order
     **/
    private static <T extends Comparable<T>> void doSort(T[] arr, T[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            doSort(arr, temp, left, mid);
            doSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }

    }

    /**
     * This method implements the merge step of the merge sort
     *
     * @param arr   The array to be sorted
     * @param temp  The copy of the actual array
     * @param left  The first index of the array
     * @param mid   The middle index of the array
     * @param right The last index of the array
     *              merges two parts of an array in increasing order
     **/

    private static <T extends Comparable<T>> void merge(T[] arr, T[] temp, int left, int mid, int right) {
        System.arraycopy(arr, left, temp, left, right - left + 1);


        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i].compareTo(temp[j]) <= 0) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }

        while (j <= right) {
            arr[k++] = temp[j++];
        }
    }

    public void sort(Integer[] input){
        sortComp(input);
    }
}
