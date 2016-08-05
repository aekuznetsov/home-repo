package aekuznetsov.collatz;

/**
 * Implements Collatz Conjecture.
 *
 * @author Aleksei Kuznetsov
 */
public class Collatz {

    private int countOfSteps = 0;

    /**
     * Get beginning number and find
     * the number of steps by recursion.
     *
     * @param n Beginning number
     * @return Count of steps
     */
    public int solve(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + solve(n / 2);
        } else {
            return 1 + solve(n * 3 + 1);
        }
    }

    /**
     * Get beginning number and find
     * the number of steps by while loop.
     *
     * @param n Beginning number
     * @return Count of steps
     */
    public int collatz(int n) {
        while (n != 1) {
            countOfSteps++;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            System.out.print(n + " ");

            if (countOfSteps % 9 == 0) {
                System.out.print("\n");
            }
        }
        return countOfSteps;
    }

}
