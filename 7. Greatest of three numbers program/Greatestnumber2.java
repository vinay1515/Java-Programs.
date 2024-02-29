/* Program to find greatest of three numbers Using Nested if-else Condition */
import java.util.Scanner;

public class Greatestnumber2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}


/* OUTPUT:
Enter three numbers: 15 62 86
The greatest number is: 86
 */