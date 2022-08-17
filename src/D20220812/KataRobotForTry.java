package D20220812;

public class KataRobotForTry {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 1; i < 3; i++) {
            try {
                a = a + i;
                i = 3;
            } catch (Exception eCommon) {
                throw eCommon;
            }
            System.out.println(i);
            System.out.println(a);
        }

    }
}
