package D20220717;

public class ANNA {

    public static void main(String[] args) {
        int[] a1,a2,a3;
        a1 = new int [] {4, 6, 6};
        a2 = new int [] {5, 8, 6};
        a3 = new int[a1.length+a2.length];
        int k = 0; //counter of a3 array index


        for (int i = 0; i < a1.length;i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    a3[k] = 8;
                } else {
                    a3[k] = 0;
                }
                k++;
            }


        }

        System.out.print(k);
/*        for (int k = 0; k < a3.length; k++) {
            System.out.print(a3[k] + " ");
        }*/
    }
}