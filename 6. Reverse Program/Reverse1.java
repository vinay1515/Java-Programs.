/* Program to Reverse the given number Using Arithmetic Operations */

import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("The Reversed number is :" + reversed);
        scanner.close();
    }
}


/* OUTPUT: 
Enter a Number: 123456789
The Reversed number is :987654321 */