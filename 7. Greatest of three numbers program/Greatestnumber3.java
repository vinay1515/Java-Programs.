/* Using Ternary Operator */
import java.util.Scanner;

public class Greatestnumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}


 /* OUTPUT:
Enter three numbers: 15 86 12
The greatest number is: 86
  */