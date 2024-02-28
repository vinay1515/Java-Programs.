/* Program to Reverse the given number Using Recursion Method */

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = scanner.nextInt();
        int reversed = reversedNumber(number);

        System.out.println("Reversed Number:" + reversed);
        scanner.close();
    }
    public static int reversedNumber(int number) {
        if (number < 10) {
            return number;
        }
        return Integer.parseInt(String.valueOf(number % 10) + reversedNumber(number / 10));
    }
}


/* OUTPUT: 
Enter a Number: 123456
Reversed Number:654321 */