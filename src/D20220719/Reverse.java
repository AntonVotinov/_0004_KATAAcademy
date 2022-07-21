package D20220719;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abcdefgh");
        System.out.println(str.reverse());
        System.out.println(str.capacity());
        StringBuilder sb = new StringBuilder("Papa! ");
        System.out.println(sb.capacity());
        System.out.println(sb.append("Mama!"));
    }
}
