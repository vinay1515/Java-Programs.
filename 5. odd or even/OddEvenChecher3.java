/* Check Weather the given number is Odd Or Even Using Ternary Operator */
import java.util.Scanner;

public class OddEvenChecher3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is an " + result + " number.");

        scanner.close();
    }
    
}
