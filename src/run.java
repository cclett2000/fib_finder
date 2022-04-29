//////////////////////////////////////////////////////////
// name: run.java
// function: executable script
// programmer: Charles Lett Jr.
// last modifies: 4/29/22
//////////////////////////////////////////////////////////

import java.util.Scanner;

public class run {
    static boolean ENABLE_DEBUG = false;

    public static void main(String[] args) {
        int number = 5;
        fib_finder ff = new fib_finder();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check for it's position in the fibonacci sequence if found.");
        System.out.print(">>> ");
        number = input.nextInt();

        ff.run(number, ENABLE_DEBUG);
    }
}
