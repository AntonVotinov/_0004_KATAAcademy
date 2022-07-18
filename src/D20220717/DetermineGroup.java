package D20220717;

import java.util.Scanner;

public class DetermineGroup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Age?");
            int age = sc.nextInt();

            System.out.println(determineGroup(age));
        }

    }
    public static int determineGroup(int age) {
        if ((age >= 7) && (age <= 13)) {
            return 1;
        } else {
            if ((age >= 14) && (age <= 17)) {
                return 2;
            } else {
                if ((age >= 18) && (age <= 65)) {
                    return 3;
                } else {
                    return -1;
                }
            }
        }
    }

}
