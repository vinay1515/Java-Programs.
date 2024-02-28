public class SwapMethod2 {
    public static void main(String[] args) {
        int a = 155;
        int b = 651;

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
