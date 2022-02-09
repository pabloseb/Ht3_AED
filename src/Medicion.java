public class Medicion {

    public static void main(String[] args){
        SortAlg sortAlg = new HeapSort();
        medir(sortAlg);
    }
    public static void medir (SortAlg sortAlg) {
        for (int n=10; n<3001; n=n+100){
            long tot = 0;
            long tot_ord = 0;
            for (int i=0; i<100; i++) {
                Archivos.escribir();
                Integer[] data = Archivos.leer(n);
                long t = System.nanoTime();
                sortAlg.sort(data);
                tot += System.nanoTime() - t;
                t = System.nanoTime();
                sortAlg.sort(data);
                tot_ord += System.nanoTime() - t;
            }

            System.out.print(tot/100);
            System.out.print("\t");
            System.out.print(tot_ord/100);
            System.out.print("\n");
        }
    }
}
