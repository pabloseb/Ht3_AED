public interface SortAlg {

    public void sort(Integer[] input);

    public <T extends Comparable<T>> void sortComp(T[] input);
}
