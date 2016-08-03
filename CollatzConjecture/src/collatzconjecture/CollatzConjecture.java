package collatzconjecture;

/**
 * Concrete realisation of ICollatzConjectureinterface
 * using while statement.
 * 
 * @author Aleksei Kuznetsov
 */
public class CollatzConjecture implements ICollatzConjecture {
    
    private int countOfSteps = 0;
    
    /**
     * {@inheritDoc}  
     */
    @Override
    public int collatz(int number) {
        
        while (number != 1) {
            countOfSteps++;
            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
            System.out.print(number + " ");
            
            if (countOfSteps % 9 == 0) {
                System.out.print("\n");
            }
        }
        return countOfSteps;
        
    }
    
}
