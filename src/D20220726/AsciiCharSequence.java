package D20220726;

import java.util.Arrays;

public class AsciiCharSequence {
    public static class AssCC implements CharSequence {
        byte[] array;

        public AssCC(byte[] array) {
         this.array = array;
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AssCC(Arrays.copyOfRange(array, start, end));

        }

        @Override
        public String toString() {
            return new String(array);
        }
    }
}
