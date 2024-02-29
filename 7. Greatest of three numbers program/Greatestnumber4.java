import java.util.Scanner;

public class Greatestnumber4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        int greatest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("The greatest number is: " + greatest);
        
        input.close();
    }
}

/* OUTPUT: 
Enter three numbers: 13 65 89
The greatest number is: 89
 */