package aekuznetsov.bubblesort;

/**
 * Bubble sort algorithm.
 * Sort array by ascending.
 *
 * @author Aleksei Kuznetsov
 */
class BubbleSort {

    private boolean isSorted = true;

    /**
     * Get unsorted int array and sorts it.
     *
     * @param array Array of int
     */
    void sort(int[] array) {
        int temp;
        int j = 0;

        while (isSorted) {
            isSorted = false;
            j++;
            printArray(array);

            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = true;

                }
            }
        }
    }

    private static void printArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

}
