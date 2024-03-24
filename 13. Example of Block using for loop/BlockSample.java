/*
 Demonstrate a block of code.
 Call this file "BlockTest.java"
*/

public class BlockSample {
    public static void main(String[] args) {
        int x , y;
        y = 20;

        //the target of this loop is a block
        for(x=1 ; x <=10 ; x++) {
            System.out.println("This is x:" + x);
            System.out.println("This is y:" + y);
            y = y - 2;
        }
    }
}

/* Output:
This is x:1
This is y:20
This is x:2
This is y:18
This is x:3
This is y:16
This is x:4
This is y:14
This is x:5
This is y:12
This is x:6
This is y:10
This is x:7
This is y:8
This is x:8
This is y:6
This is x:9
This is y:4
This is x:10
This is y:2
 */