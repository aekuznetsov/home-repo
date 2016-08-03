package collatzconjecture;

/**
 * Concrete realisation of ICollatzConjectureinterface
 * using recursion.
 * 
 * @author Aleksei Kuznetsov
 */
public class Collatz implements ICollatzConjecture {
    
    /**
     * {@inheritDoc} 
     */
    @Override
    public int collatz(int number) {
        
        if (number == 1) {
            return 0;
        } else if (number % 2 == 0) {
            return 1 + collatz(number / 2);
        } else {
            return 1 + collatz(number * 3 + 1);
        }
        
    }
    
}
