package D20220718;

public class CheckOfTypesConversion {
    public static void main(String[] args) {
        int intByte = 128;
        int s;
        byte value = (byte) intByte;
        System.out.println(value);
        byte r = 0x7e + 1;
        System.out.println(r);
        int int1 = 131;
        byte o;
        float f = 139.1f;
        o = (byte) f;
        System.out.println(o);
        int i3;
        byte b2=3;
        Byte myB;
        myB=b2;
        myB++;
        b2=myB;
        i3=myB;
        System.out.println(b2);
        System.out.println(i3);
    }
}
