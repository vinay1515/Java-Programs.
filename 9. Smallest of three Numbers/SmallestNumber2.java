/* Program to find Smallest of three numbers Using Nested if-else Condition */
import java.util.Scanner;

public class SmallestNumber2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int Smallest = num1;
        
        if (num2 < Smallest) {
            Smallest = num2;
        }
        if (num3 < Smallest) {
            Smallest = num3;
        }
        
        System.out.println("The Smallest number is: " + Smallest);
        
        scanner.close();
    }
}

/* OUTPUT: 
Enter three numbers:  15,  45,  12
The Smallest number is: 12 
*/