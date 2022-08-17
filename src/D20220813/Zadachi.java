package D20220813;

import javax.imageio.ImageTranscoder;
import java.util.Random;
import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int min = 18;
        int max = 777;
        while (n < a) {


            int random_int = (int)Math.floor(Math.random()*(max - min + 1)+min);
            System.out.println(random_int);
            n++;
        }
    }
}
