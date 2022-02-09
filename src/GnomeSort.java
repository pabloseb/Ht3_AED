/**
 * Implementación del algoritmo GnomeSort.
 * Obtenido de https://github.com/nlfiedler/burstsort4j/blob/master/src/org/burstsort4j/Gnomesort.java 
 * Nathan Fiedler 
 * Licencia: https://github.com/nlfiedler/burstsort4j/blob/master/LICENSE 
 * 
 * @author Manuel Martinez
 * @author Pablo Herrera
 * @author Jorge Andrino
 *
 */
public class GnomeSort implements SortAlg {

	public <T extends Comparable<T>> void sortComp(T[] input) {
        if (input == null || input.length < 2) {
            return;
        }
        int i = 1;
        int j = 2;
        while (i < input.length) {
            if (input[i - 1].compareTo(input[i]) < 1) {
                i = j;
                j++;
            } else {
                T t = input[i - 1];
                input[i - 1] = input[i];
                input[i] = t;
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
	}

	public void sort(Integer[] input){
        sortComp(input);
    }
}
