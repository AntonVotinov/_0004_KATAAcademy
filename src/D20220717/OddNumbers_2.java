package D20220717;

public class OddNumbers_2 {
    public static void main(String[] args) {
        int [] arr= {13,-25,-13,91,99,1,2,3,4,5,6};
        int j = 0; // j is a counter of Odd Numbers
        if (arr.length == 0) {
            System.out.print("\n");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    j++;
                }
            }
            if (j == 0) {
                System.out.print("\n");
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i]);
                        if (j == 1) {
                            System.out.print("\n");
                        } else {
                            System.out.print(",");
                            j--;
                        }
                    }
                }
            }
        }
    }
}