public class Main {

    public static void main(String[] args) {

        for (int j=0; j<100; j++) {
            Integer[] data = Archivos.leer(3000);
            SortAlg sortAlg = new QuickSort();
            sortAlg.sort(data);
            for (int i = 0; i < 2999; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    System.out.println("Error");
                }
            }
        }

    }

}
