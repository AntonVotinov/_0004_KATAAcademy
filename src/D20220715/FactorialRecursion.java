package D20220715;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("N-?");
            int varN = sc.nextInt();
            System.out.println(factorial(varN));
    }
    public static BigInteger factorial(int input){
        BigInteger result = BigInteger.valueOf(1);
        if (input == 1 || input == 0){
            return result;
        }
        result = BigInteger.valueOf(input).multiply(factorial(input-1));
        return result;
    }
}