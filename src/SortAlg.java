public interface SortAlg {

    public <T extends Comparable<T>> T[] sort(T[] input);
}
