/* Program to find Greatest of among three numbers using if-else Condition */
import java.util.Scanner;

public class Greatestnumber {

    public static void main(String[] args) {
        double num1, num2, num3;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Three Numbers:");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The Greatest number is:" + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The Greatest number is:" + num2);
        }else{
            System.out.println("The Greatest number is:"+ num3);
        }
    }
}

/* OUTPUT: 
Enter the Three Numbers: 15 56 12
The Greatest number is:56.0
 */