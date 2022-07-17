package D20220717;

public class OddNumbers_1_Fail {
    public static void main(String[] args) {
        int [] arr= {-6,-2,0,2,3,4,5,6,7,8,9,0};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                str = str.append(arr[i] + ",");
            }
        }
        if (str.length() == 0) {
            str = str.append("\n");
        } else {
            str = str.deleteCharAt(str.length() - 1);
            str = str.append("\n");
            System.out.println(str);
        }
    }
}