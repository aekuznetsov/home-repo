package sort;

/**
 * Sorting.
 * Implement two types of sorting algorithms: 
 * merge sort and bubble sort.
 * 
 * @author Aleksei Kuznetsov
 */
public interface ISorting {
    
    /**
     * Get unsorted array and
     * sortes it.
     * 
     * @param array - unsorted array
     */
    void sort(int[] array);
    
}
