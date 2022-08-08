package D20220808;

import java.io.IOException;

public class ReadFromKeyBoard {
    public static void main(String[] args) throws IOException {
        int n = 0;
        while (n < 20){
            int x = System.in.read();
            System.out.println(x);
            n++;
        }
    }
}
