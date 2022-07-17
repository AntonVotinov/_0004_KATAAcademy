package D20220717;

public class SortingOfTwoArrays {
    public static void main(String[] args) {
        int[] a1, a2, finalArray;
        a1 = new int [] {0,2,2};
        a2 = new int [] {1,3};
        
        finalArray = new int [a1.length + a2.length];
        int i = 0;
        int j = 0;

        for (int x = 0; x < (a1.length + a2.length); x++) {
            if (i > a1.length - 1) {
                finalArray[x] = a2[j];
                j++;
            } else if (j > a2.length - 1) {
                finalArray[x] = a1[i];
                i++;
            } else if (a1[i] < a2[j]) {
                finalArray[x] = a1[i];
                i++;
            } else {
                finalArray[x] = a2[j];
                j++;
            }
        }

        for (int y = 0; y < finalArray.length; y++) {
            System.out.print(finalArray[y] + " ");
        }
    }
/*    public static int[] mergeArrays(int[] a1, int[] a2) {
	    int[] a3 = new int[a1.length + a2.length];
	    int i = 0;
        int j = 0;
	    for (int k = 0; k < a3.length; k++) {
		if (i > a1.length - 1) {
			a3[k] = a2[j];
			j++;
		} else if (j > a2.length - 1) {
			a3[k] = a1[i];
			i++;
		} else if (a1[i] < a2[j]) {
			a3[k] = a1[i];
			i++;
		} else {
			a3[k] = a2[j];
			j++;
		}
	}
	return a3;
    }*/
}