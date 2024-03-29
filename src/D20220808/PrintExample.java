package D20220808;

import java.util.Arrays;
import java.util.List;

public class PrintExample {

    void print(Object s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        PrintExample print = new PrintExample();
        List list = Arrays.asList("first step", null, "second step");

        for (Object s:list) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }
    }
}