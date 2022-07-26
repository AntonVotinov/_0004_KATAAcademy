package D20220726;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x>0)&&(y>0)) System.out.println("1 четверть");
        if ((x<0)&&(y>0)) System.out.println("2 четверть");
        if ((x<0)&&(y<0)) System.out.println("3 четверть");
        if ((x>0)&&(y<0)) System.out.println("4 четверть");
    }
}
