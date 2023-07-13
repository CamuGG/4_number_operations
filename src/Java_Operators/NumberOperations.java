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

        boolean isValueOfBIsOdd = b % 2 != 0;
        boolean isValueOfBIsOddMath = Math.floorMod(b, 2) != 0;
        boolean isMultipliedBOf3 = b * (b + 1) % 3 == 0;
        boolean isMultipliedBOf3Math = Math.floorMod(b*(b+1), 3) == 0;

        // statement 1
        System.out.println("result statement1: " + isValueOfBIsOdd);
        // modo alternativo
        System.out.println("result statement1: " + isValueOfBIsOddMath);

        // statement 2
        System.out.println("result statement2: " + isMultipliedBOf3);
        // modo alternativo
        System.out.println("result statement2: " + isMultipliedBOf3Math);

    }
}
