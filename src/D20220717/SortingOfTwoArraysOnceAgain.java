package D20220717;

// one more check of whether I remember this stuff or not

public class SortingOfTwoArraysOnceAgain {
    public static void main(String[] args) {
    int[] a,b,c;
    a = new int[] {0,2,2};
    b = new int[] {1,3};
    int i = 0;
    int j = 0;
    int k;
    c = new int[a.length+b.length];

    for (k = 0; k < (a.length+b.length); k++) {
        if (i > a.length-1) {
            c[k] = b[j++];
        } else if (j > b.length-1) {
            c[k] = a[i++];
        } else if (a[i] < b[j]) {
            c[k] = a[i++];
        } else {
            c[k] = b[j++];
        }
    }
    for (int o = 0; o < (a.length+b.length); o++) {
        System.out.println(c[o]);
    }
    }
}
