public class Swap {
    public static void main(String[] args) {
        int a = 32;
        int b = 67;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " +b);
    }
}

/* OUTPUT: 
Before Swap
a = 32
b = 67
After Swap
a = 67
b = 32
 */