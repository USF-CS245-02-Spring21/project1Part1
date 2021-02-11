package sorting;

/** An interface that describes several algorithms for sorting a list */
public interface SortingInterface {
    void insertionSort(Comparable[] array, int lowindex, int highindex,
                              boolean reversed);
    void shakerSort(Comparable[] array, int lowindex, int highindex, boolean reversed);

    void modifiedQuickSort(Comparable[] array, int lowindex, int highindex);

    void externalSort(String inputFile, String outputFile, int k, int m);

}
