package sort;

/**
 * Bubble sort realisation of ISorting.
 * 
 * @author Aleksei Kuznetsov
 */
public class BubbleSort implements ISorting {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        boolean flag = true;
        int temp;
        int j = 0;
        
        while (flag) {            
            flag = false;
            j++;
            
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
            
        }
        
    }
    
    
    
}
