package D20220716;

public class TypeOfLiteral {
    public static void main(String[] args) {
        double a = 0x0bp3;
        int value = 8;
        byte b = (byte) 0b10001001;
        int thatMother=7;
        System.out.println(a);
        System.out.println(b);
        System.out.println((char)(92+0));
        int i = Integer.bitCount(thatMother);
        System.out.println(i);
        boolean boo = Integer.bitCount(Math.abs(value)) == 1;
        System.out.println("Integer.bitCount: " + boo);
        System.out.println("A"+('\t'+'\u0003'));
        System.out.println('A'+'1'+'2');
        System.out.println("A"+12);
        System.out.println('A'+"12");
    }
}