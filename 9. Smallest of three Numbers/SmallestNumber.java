/* Program to find Greatest of among three numbers using if-else Condition */

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        double num1, num2, num3;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Three numbers:");

            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            num3 = scanner.nextDouble();
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest Number is  " + num1);
        }
        else  if (num2 < num1 && num2  < num3) {
            System.out.println("Smallest Number is " + num2);
        }
        else{
            System.out.println("Smallest Number is " + num3);
        }
    }
}


/* OUTPUT:
Enter the Three numbers: 89 62 45
Smallest Number is 45.0
 */