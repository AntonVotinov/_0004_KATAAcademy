package D20220723;

public class Robot {
    public static void main(String[] args) {
        int a,b,c,d,dir,x0,toX, r,t,s;
        a = 1; // UP
        b = 2; // RIGHT
        c = 3; // DOWN
        d = 4; // LEFT
        dir = 4;
        x0 = 0;
        toX = 2;
/*
        boolean a1,b1,c1;
        a1 = true;
        b1 = false;
        c1 = true;
        System.out.println(b1 & c1);
*/

        if ((((dir == a) | (dir == c)| (dir == d)) & ((toX - x0) > 0))
        |
        (((dir == a) | (dir == b)| (dir == c)) & ((toX - x0) < 0)))
        {
            System.out.println("Need X!");
        } else {
            System.out.println("NO NEED X!");
        }
        s = Math.abs(toX-x0);
        System.out.println(s);

        for (int iX = 0; iX < s; iX++){
            System.out.println("CFYZ");
        }
/*        for (int i = 0; i < 5; i++){
            System.out.println(i);
            if (i == 4) {
                System.out.println("I - ok");
            }
        }
        for (int j = 6; j > 0; j--) {
            System.out.println(j);
            if (j == 1) {
                System.out.println("J - ok");
            }
        }*/
    }
}
