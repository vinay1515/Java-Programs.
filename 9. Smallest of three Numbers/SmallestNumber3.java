import java.util.Scanner;

public class SmallestNumber3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        final double Smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        System.out.println(Smallest + " is the smallest number.");

        scanner.close();
    }
}

/* Output: 
Enter three numbers:
564165, 54585, 65484
54585.0 is the smallest number.
 */