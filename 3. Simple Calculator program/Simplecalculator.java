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
