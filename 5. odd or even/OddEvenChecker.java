/*Check given number is Odd or Even using Modulus Operator */

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Given Number is Even:" + number);
        } else {
            System.out.println("The Given number is Odd:" + number);
        }
        scanner.close();
    }
}

/* OUTPUT:
Enter a number: 216545
The Given number is Odd:216545
 */
