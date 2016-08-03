package collatzconjecture;


/**
 * Collatz Conjecture.
 * Start with a number n > 1.
 * Find the number of steps it takes to reach 
 * one using the following process: 
 * if n is even, divide it by 2,
 * if n is odd, multiply it by 3 and add 1.
 * 
 * @author Aleksei Kuznetsov
 */
public interface ICollatzConjecture {
    
    /**
     * Get beginning number and find 
     * the number of steps.
     * 
     * @param number - beginning number
     * @return count of steps
     */
    int collatz(int number);
    
}
