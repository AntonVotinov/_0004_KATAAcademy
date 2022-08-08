package D20220807;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            System.out.println(i--);
        }
        int n = 0;
        while (n < 10) {
            System.out.println(n++);
        }
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String s = console.nextLine();
            isExit = s.equals("exit");
        }

    }
}