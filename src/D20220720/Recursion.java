package D20220720;

import java.util.Iterator;

public class Recursion {
    public static void main(String[] args) {
        counter(60_000);
    }

    private static void counter(int n) {
        if (n == 0)
            return;

        System.out.println((char)n);

        counter(n-1);
    }
}