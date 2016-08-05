package aekuznetsov.collatz;

import java.util.Scanner;

/**
 * Collatz Conjecture.
 * Start with a number n > 1.
 * Find the number of steps it takes to reach one using the following process:
 * If n is even, divide it by 2.
 * If n is odd, multiply it by 3 and add 1.
 *
 * @author Aleksei Kuznetsov
 */
public class Main {

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Collatz Conjecture:");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Called Collatz::solve():");
        printResult(collatz.solve(number), number);
        System.out.print("Called Collatz::collatz():");
        printResult(collatz.collatz(number), number);
    }

    /**
     * Print result of method into console.
     *
     * @param countOfSteps Count of steps
     * @param number Beginning number
     */
    private static void printResult(int countOfSteps, int number) {
        System.out.println(String.
                format("\nIt takes %d steps to reach 1 using the Collatz Conjecture,"
                        + "beginning with the number %d.\n", countOfSteps, number));
    }

}
