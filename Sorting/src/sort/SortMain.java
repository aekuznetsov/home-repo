package sort;

import java.util.Scanner;

/**
 * Main class for running programm.
 * This programm uses incapsulation,
 * inheritance and polymorphism.
 * 
 * @author Aleksei Kuznetsov
 */
public class SortMain {
    
    public static void main(String[] args) {
        
        System.out.println("Sorting:");
        int[] array = createArray();
        ISorting sort = new MergeSort();
        System.out.print("Called MergeSort::sort():\n");
        calledSort(sort, array);
        sort = new BubbleSort();
        System.out.print("Called BubbleSort::sort():\n");
        calledSort(sort, array);
        
    }
    
    /**
     * Create array by user input.
     * 
     * @return filled array 
     */
    private static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enetr an array value: ");
            array[i] = input.nextInt();
        }
        return array;
    }
    
    /**
     * Call interface method.
     * 
     * @param sort - interface object
     * @param array - unsorted array
     */
    private static void calledSort(ISorting sort, int[] array) {
        ISorting sorting = sort;
        System.out.print("Unsorted array: ");
        printArray(array);
        System.out.print("Sorted array: ");
        sorting.sort(array);
        printArray(array);
    }
    
    /**
     * Print array in console.
     * 
     * @param arr - array for printing
     */
    private static void printArray(int[] arr) {
    
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
    }
    
}
