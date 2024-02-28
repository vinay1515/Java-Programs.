import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {    //main function
        double num1, num2; //for storing values

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in); //for input value from user

        System.out.println("Enter the two numbers:");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.println("Enter the Operators (+,-,*,/):");

        char op = scanner.next().charAt(0);
        double o = 0;

        switch (op) {
        case '+':   //for adding two numbers
            o = num1 + num2;
            break;
        case '-':
            o = num1 - num2;
            break;
        case '*':
            o = num1 * num2;
            break;
        case '/':
            o = num1 / num2;
            break;
        default:
            System.out.println("Yoy Entered invalid Input");
        }
        System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2 + " = " + o);

    }
}

/*OUTPUT:1
 * Enter the two numbers:65 & 96
Enter the Operators (+,-,*,/): +
The final result: 65.0 + 96.0 = 161.0
 */

/* OUTPUT:2
Enter the two numbers: 89 & 61
Enter the Operators (+,-,*,/): -
The final result: 89.0 - 61.0 = 28.0
 */

/* OUTPUT:3
Enter the two numbers: 15 & 5
Enter the Operators (+,-,*,/): *
The final result: 15.0 * 5.0 = 75.0
 */

/* OUTPUT:4 
Enter the two numbers: 96 & 4 
Enter the Operators (+,-,*,/): /
The final result: 96.0 / 4.0 = 24.0
*/