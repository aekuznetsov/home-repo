package collatzconjecture;

import java.util.Scanner;

/**
 * Main class for running programm.
 * This programm uses incapsulation,
 * inheritance and polymorphism.
 * 
 * @author Aleksei Kuznetsov
 */
public class CollatzMain {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Collatz Conjecture:");
	System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Called Collatz::collatz():");
        ICollatzConjecture collatz = new Collatz();
        calledCollatz(collatz, number);
        System.out.print("Called CollatzConjecture::collatz():");
        collatz = new CollatzConjecture();
        calledCollatz(collatz, number);
    }
    
    /**
     * Call interface method.
     * 
     * @param collatz - interface object
     * @param number - beginning number
     */
    private static void calledCollatz(ICollatzConjecture collatz, int number) {
        int countOfSteps = collatz.collatz(number);
        System.out.println(String.
                format("\nIt takes %d steps to reach 1 using the Collatz Conjecture,"
                        + "beginning with the number %d.\n", countOfSteps, number));
    }
    
}
