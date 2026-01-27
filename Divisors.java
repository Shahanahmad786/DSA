// Program to print all divisors of a number
// Author: Shahan Ahmad

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Divisors of " + n + " are:");

        // Loop from 1 to n and check divisibility
        for (int i = 1; i <= n; i++) {
            // If i divides n completely, then it is a divisor
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close(); // closing scanner
    }
}