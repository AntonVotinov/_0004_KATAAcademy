package D20220716;

public class IsPalindrome {
    public static void main(String[] args) {
        String text = "12345678";

        String newText = text.replaceAll("[^a-zA-Z0-9]","");

        String [] tempArray;
        String tempChar;
        tempArray = newText.split("");
        StringBuilder reversedString = new StringBuilder();
        int stringLength = tempArray.length;
        int j=stringLength;
        for (int i=0; i<stringLength/2; i++) {
            tempChar = tempArray[i];
            tempArray[i] = tempArray [j-1];
            tempArray[j-1]=tempChar;
            j--;
        }

        for (int i=0; i<stringLength; i++){
            reversedString.append(tempArray[i]);
        }

        System.out.println(newText.equalsIgnoreCase(String.valueOf(reversedString)));
    }
}
