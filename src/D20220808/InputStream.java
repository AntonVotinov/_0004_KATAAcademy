package D20220808;

import java.io.*;

public class InputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        while (n <6) {
            String x = reader.readLine();
            System.out.println(x);
            n++;
            anotherMethod1();
        }

    }

    private static void anotherMethod1() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(stackTrace[i]);
        }
    }
}