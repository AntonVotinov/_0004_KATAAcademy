package D20220724;

public class ParametersAndArguments4 {


    public static void main(String[] args) {

        sum("Welcome!", 20, 10);
        sum("Hello World!");
    }

    static void sum(String message, int... nums) {

        System.out.println(message);
        int result = 0;
        for (int x : nums)
            result += x;
        System.out.println(result);
    }
}