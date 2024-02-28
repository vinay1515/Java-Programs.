/* Program to Reverse the given number Using StringBulider Class */
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int number = scanner.nextInt();
        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();

        System.out.println("The Reversed Number is:" + reversed);
        scanner.close();
    }
}
