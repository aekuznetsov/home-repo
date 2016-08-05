package aekuznetsov.bubblesort;

import java.util.Scanner;

/**
 * @author Aleksei Kuznetsov
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bubble sort.");
        int[] array = createArray();
        BubbleSort bs = new BubbleSort();
        System.out.print("Called BubbleSort::sort():\n");
        bs.sort(array);
    }

    /**
     * Create array by user input.
     *
     * @return Filled array
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

}
