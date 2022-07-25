package D20220725;

public class HashCode {
    public static void main(String[] args) {
        String str1 = "Hello1";
        String str2 = "Hello2";
        String str3 = "Hello3";
        String str4 = "Hello3";
        String str5 = "Hello3";
        String str6 = "";
        String str7 = "" + "" +"" +"";
        System.out.println("Hello1 hashCode: " + str1.hashCode());
        System.out.println("Hello2 hashCode: " + str2.hashCode());
        System.out.println("Hello3 hashCode: " + str3.hashCode());
        System.out.println("Hello4 hashCode: " + str4.hashCode());
        System.out.println("Hello5 hashCode: " + str5.hashCode());
        System.out.println("Hello6 hashCode: " + str6.hashCode());
        Double dob = 2.0;
        System.out.println(dob);
    }
}