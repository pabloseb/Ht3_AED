public class Main {

    public static void main(String[] args) {
        Comparable[] data = Archivos.leerComp(3000);
        SortAlg sortAlg = new QuickSort();
        sortAlg.sort(data);
        for (int j=0; j<10000; j++) {
            for (int i = 0; i < 2999; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    System.out.println("Error");
                }
            }
        }

    }

}
