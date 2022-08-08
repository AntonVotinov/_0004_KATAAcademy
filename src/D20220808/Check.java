package D20220808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check {

    public static void main(String[] args) throws IOException {

        char x = 1071;
        System.out.println(x);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Мы считали с клавиатуры эту строку:");
        System.out.println(s);
    }
}