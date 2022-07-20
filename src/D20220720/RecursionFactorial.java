package D20220720;

public class RecursionFactorial {
    public static void main(String[] args) {
    int i = 4;
        System.out.println(fac(i));
    }
     private static int fac(int i) {
        if (i==1)
            return 1;
        return i*fac(i-1);
     }
}
