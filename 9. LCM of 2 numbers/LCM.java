public class LCM {
    public static void main(String[] args) {
        int a = 225;
        int b = 545;

        int result = (a > b)  ? a : b;

        while (true) {
            if (result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        System.out.println("LCM of " + a + "and" + b + ":" + result);

    }
}
/* OUTPUT:
 * LCM of 225 and 545:24525
 */