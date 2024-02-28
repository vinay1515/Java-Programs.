/* Check weather the given Number is Odd or Even Using Bitwise AND Operator */

import java.util.Scanner;

public class OddEvenChecker2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Randon Number:");
        int Number = scanner.nextInt();

        if ((Number & 1) == 0) {
            System.out.println("The Given Number is Even:" + Number);
        } else {
            System.out.println("The Given number is Odd:" + Number);
        }
        scanner.close();
    }
}


/* OUTPUT: 
Enter a Randon Number: 123456
The Given Number is Even:123456
 */