import java.util.Arrays;

public class View {
    public static void main(String[] args) {
        //se escribe el archivo en el computador
        Archivos.escribir();
        //se escribren los archivos de tipo entero p
        //se escribe el arreglo desordenado
        Integer[] Disorganized_int_array = Archivos.leer(3000);
        //se escribe el arreglo ordenado
        Integer[] Organized_int_array = Archivos.leer(3000);
        Arrays.sort(Organized_int_array);

        //se crean los arreglos de tipo comparable
        //se crea arreglo desarreglado tipo comparable
        Comparable[] Disorganized_comparable_array = Archivos.LeerComparable(3000);
        //se crea arreglo ordenado tipo comparable
        Comparable[] Organized_comparable_array = Archivos.LeerComparable(3000);
        Arrays.sort(Organized_comparable_array);

        //se prueba el tiempo de los sorts

        GnomeSort Gsort = new GnomeSort();
        Gsort.sort(Disorganized_comparable_array);
        Gsort.sort(Organized_comparable_array);

        HeapSort Hsort = new HeapSort();
        Hsort.sort(Disorganized_comparable_array);
        Hsort.sort(Organized_comparable_array);


        MergeSort Msort = new MergeSort();
        Msort.sort(Disorganized_comparable_array);
        Msort.sort(Organized_comparable_array);


        QuickSort Qsort = new QuickSort();
        Qsort.sort(Disorganized_comparable_array);
        Qsort.sort(Organized_comparable_array);

        RadixSort.radixsort(Organized_int_array);
        RadixSort.radixsort(Disorganized_int_array);
    }
}