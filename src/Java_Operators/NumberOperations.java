package Java_Operators;

public class NumberOperations {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4; //16
        int b = a+1; //17

/*
Check and prints if both the following statements are true:
- statement 1: check if b is an odd number
- statement 2: che if the result of (b multiplied to b + 1) is a multiple of 3
*/
        // if the statement 1 is true, the result will be 1
        System.out.println("result statement1: " + b % 2);
        // modo alternativo
        System.out.println("result statement1: " + Math.floorMod(b, 2));

        // if the statement 2 is true, the result will be 0
        System.out.println("result statement2: " + b * (b + 1) % 3);
        // modo alternativo
        System.out.println("result statement2: " + Math.floorMod(b*(b+1), 3));

    }
}
