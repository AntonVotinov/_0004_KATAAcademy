package D20220722;

import static java.lang.Math.abs;

public class Robot {
    public static void main(String[] args) {
        int x0 = 10;
        int x1 = 5;



        for (int x = 0; Math.abs(x1-x0) > x; x++) {
            System.out.println("MovE!"); // stepForward()
        }
    }
}