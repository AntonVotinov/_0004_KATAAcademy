package D20220807;

import java.util.Scanner;

public class isEnter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEnterishe = false;
        int sum = 0;
        while (!isEnterishe) {
            if (scanner.hasNextInt()) {
            sum += scanner.nextInt();} else {
                String s = scanner.nextLine();
                isEnterishe = s.equals("enter");
            }
        }
        System.out.println(sum);
    }
}
