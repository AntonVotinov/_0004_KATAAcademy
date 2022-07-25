package D20220724;

public class ParametersAndArguments {

    public static void main (String args[]){

        int a = 6;
        int b = 8;
        sum(a, b);  // 14
        sum(3, a);  // 9
        sum(5, 23); // 28
        for (int i = 0; i < 9; i++) {
            final int r = 0;
            
        }
    }
    static void sum(int x, int y){

        int z = x + y;
        System.out.println(z);
    }
}