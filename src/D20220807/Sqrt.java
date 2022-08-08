package D20220807;

public class Sqrt {
    public static void main(String[] args) {
        double b = -16;
        double c = 0;
        c = sqrt(b);
        System.out.println(c);
    }
    public static double sqrt(double x) {
        double a = 0;
        if (x<0) {throw new IllegalArgumentException("Expected non-negative number, got ?");}
        else {a = Math.sqrt(x);}
        return a; // your implementation here
    }
}
