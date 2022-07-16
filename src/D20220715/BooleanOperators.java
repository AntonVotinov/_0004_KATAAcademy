package D20220715;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean a, b, r;
        a=true;
        b=false;
        r = a ^ b;
        System.out.println(r);
        int intA,intB;
        intA = 1_000;
        intB = 2_000;
        System.out.println(r+" fuck "+intA);
        int inc;
        inc = (intA=intA+1) + ++intB;
        System.out.println(inc);
    }
}